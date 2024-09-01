package ie.atu.sw;

import java.io.IOException;
import java.util.Scanner;

// This class handles user inputs and directs the workflow based on menu selections.
public class Menu {
    // Default file paths are now relative paths
    private String embeddingsFilePath = "./word-embeddings.txt";
    private String outputFilePath = "./out.txt";
    private String[] userInputWords;
    private int numMatches = 5;

    public void displayOptions() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display introductory header
            System.out.println(ConsoleColour.WHITE);
            System.out.println("************************************************************");
            System.out.println("*     ATU - Dept. of Computer Science & Applied Physics    *");
            System.out.println("*          Similarity Search with Word Embeddings          *");
            System.out.println("*           Developed by student Andrii Skvortsov          *");
            System.out.println("************************************************************");

            // Display menu options
            System.out.println("(1) Specify Embedding File");
            System.out.println("(2) Specify an Output File (default: ./out.txt)");
            System.out.println("(3) Enter a Word or Text");
            System.out.println("(4) Configure Options");
            System.out.println("(5) Search and Output Results");
            System.out.println("(0) Quit");

            System.out.print(ConsoleColour.BLACK_BOLD_BRIGHT);
            System.out.print("Select Option [0-5]>");
            System.out.println(ConsoleColour.RESET);

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    specifyEmbeddingFile(scanner);
                    break;
                case "2":
                    specifyOutputFile(scanner);
                    break;
                case "3":
                    enterWordOrText(scanner);
                    break;
                case "4":
                    configureOptions(scanner);
                    break;
                case "5":
                    searchAndOutputResults();
                    break;
                case "0":
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
        scanner.close();
    }

    private void specifyEmbeddingFile(Scanner scanner) {
        System.out.print("Enter the path for the word embeddings file: ");
        embeddingsFilePath = scanner.nextLine().trim();
        System.out.println("Embeddings file set to: " + embeddingsFilePath);
    }

    private void specifyOutputFile(Scanner scanner) {
        System.out.print("Enter the output file path: ");
        outputFilePath = scanner.nextLine().trim();
        System.out.println("Output file set to: " + outputFilePath);
    }

    private void enterWordOrText(Scanner scanner) {
        System.out.print("Enter a word or a short sentence to compare: ");
        String userInput = scanner.nextLine().trim();
        userInputWords = userInput.split("\\s+");
        System.out.println("Words/Text set to: " + String.join(", ", userInputWords));
    }

    private void configureOptions(Scanner scanner) {
        System.out.print("Enter the number of top matches to report (default: 5): ");
        try {
            numMatches = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Using default value: 5");
            numMatches = 5;
        }
        System.out.println("Number of top matches set to: " + numMatches);
    }

    private void searchAndOutputResults() {
        try {
            WordEmbeddings wordEmbeddings = WordEmbeddings.loadEmbeddings(embeddingsFilePath);
            double[] averageVector = wordEmbeddings.getAverageVector(userInputWords);

            if (averageVector == null) {
                System.out.println("None of the input words were found in the embeddings.");
                return;
            }

            Similarity similarity = new Similarity();
            similarity.findAndOutputSimilarWords(averageVector, numMatches, outputFilePath, wordEmbeddings);
        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}
