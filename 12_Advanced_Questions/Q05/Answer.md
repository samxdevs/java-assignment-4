# Question 05

Write a program to store a list of products and their prices in a TreeMap and display the products in sorted order by name.

## Answer

TreeMap<String,BigDecimal> stores product names and prices. After reading products, entrySet iteration prints products in natural, case-sensitive name order. An existing product name updates its price. Prices must be nonnegative decimal values with at most two decimal places.

## Files and running the program

- [ProductPricesDemo.java](ProductPricesDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java ProductPricesDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java ProductPricesDemo < sample_input.txt
```
