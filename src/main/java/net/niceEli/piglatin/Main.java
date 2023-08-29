package net.niceEli.piglatin;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide words to translate as command-line arguments.");
            return;
        }
        PigLatin.translate(args);
    }
}