import java.util.*;

public class CharacterFrequencyDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            int oldCount = frequencies.getOrDefault(letter, 0);
            frequencies.put(letter, oldCount + 1);
        }
        List<Character> letters = new ArrayList<>(frequencies.keySet());
        Collections.sort(letters);
        for (Character letter : letters) {
            String label = letter == ' ' ? "[space]" : "'" + letter + "'";
            System.out.println(label + " -> " + frequencies.get(letter));
        }
        if (frequencies.isEmpty()) {
            System.out.println("No characters to count.");
        }
    }
}
