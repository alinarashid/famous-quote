package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Famous Quotes App
 * Lets the user pick a number and displays the matching quote.
 * Uses try/catch to handle invalid input without crashing.
 */

public class FamousQuote {
    public static void main(String[] args) {
        // Scanner to read what the user types
        Scanner input = new Scanner(System.in);

        // List of 10 famous quotes
        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("Talk is cheap. Show me the code. - Linus Torvalds");
        quotes.add("The only way to do great work is to love what you do. - Steve Jobs");
        quotes.add("Any fool can write code that a computer can understand. Good programmers write code that humans can understand. - Martin Fowler");
        quotes.add("Programs must be written for people to read, and only incidentally for machines to execute. - Harold Abelson");
        quotes.add("Code is like humor. When you have to explain it, it's bad. - Cory House");
        quotes.add("Premature optimization is the root of all evil. - Donald Knuth");
        quotes.add("Experience is the name everyone gives to their mistakes. - Oscar Wilde");
        quotes.add("Fall seven times, stand up eight. - Japanese proverb");
        quotes.add("The best time to plant a tree was 20 years ago. The second best time is now. - Chinese proverb");
        quotes.add("Well begun is half done. - Aristotle");

        // try: run code that might crash from bad input
        try {
            System.out.println("Welcome to FamousQuote");
            System.out.println("Pick a quote (1-" + quotes.size() + "):");
            int choice = input.nextInt();

            // User picks 1-10, but the list index starts at 0 (0-9)
            int index = choice - 1;

            System.out.println("Your quote is " + quotes.get(index));
        } catch (Exception e) {

            // Runs if the number is out of range or not a number at all
            System.out.println("Oops! Number invalid. Please enter a number between 1 and " + (quotes.size()));
        }

        // Close the Scanner when the program is done
        input.close();
    }
}
