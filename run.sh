#!/usr/bin/env bash
set -euo pipefail

if [[ $# -ne 2 ]]; then
    echo "Usage: bash run.sh SECTION_NUMBER QUESTION_NUMBER"
    echo "Example: bash run.sh 1 6"
    exit 1
fi

root_dir="$(cd "$(dirname "$0")" && pwd)"
case "$1" in
    1|01) section="01_Generics" ;;
    2|02) section="02_Java_Util_and_Collections" ;;
    3|03) section="03_List_Interface" ;;
    4|04) section="04_Set_Interface" ;;
    5|05) section="05_Map_Interface" ;;
    6|06) section="06_Queue_and_Stack" ;;
    7|07) section="07_Specialized_Classes" ;;
    8|08) section="08_Concurrency_and_Thread_Safety" ;;
    9|09) section="09_Collections_Utility_Methods" ;;
    10) section="10_Custom_Comparator" ;;
    11) section="11_Practical_Use_Cases" ;;
    12) section="12_Advanced_Questions" ;;
    *) echo "Section must be from 1 to 12."; exit 1 ;;
esac

if [[ ! "$2" =~ ^(0?[1-9]|1[0-2])$ ]]; then
    echo "Enter a valid question number, such as 1 or 06."
    exit 1
fi
question_number="${2#0}"
printf -v question_folder 'Q%02d' "$question_number"
question_dir="$root_dir/$section/$question_folder"
if [[ ! -d "$question_dir" ]]; then
    echo "This question does not exist in the selected section."
    exit 1
fi
if [[ ! -f "$question_dir/main_class.txt" ]]; then
    echo "This is a theory question. Read $question_dir/Answer.md"
    exit 0
fi
if ! command -v javac >/dev/null 2>&1 || ! command -v java >/dev/null 2>&1; then
    echo "Install a Java JDK (8 or later) to run the programs."
    exit 1
fi

main_class="$(cat "$question_dir/main_class.txt")"
build_dir="$(mktemp -d "${TMPDIR:-/tmp}/java-module4.XXXXXX")"
trap 'rm -rf "$build_dir"' EXIT
javac -d "$build_dir" "$question_dir"/*.java
java -cp "$build_dir" "$main_class"
