package ie.atu.sw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Handles loading and storing the word embeddings.
public class WordEmbeddings {
    private static final int EMBEDDING_SIZE = 50;
    private String[] words;
    private double[][] embeddings;

    public static WordEmbeddings loadEmbeddings(String filePath) throws IOException {
        List<String> words = new ArrayList<>();
        List<double[]> embeddingsList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            String word = parts[0];
            double[] embedding = new double[EMBEDDING_SIZE];
            for (int i = 0; i < EMBEDDING_SIZE; i++) {
                embedding[i] = Double.parseDouble(parts[i + 1]);
            }
            words.add(word);
            embeddingsList.add(embedding);
        }
        reader.close();

        WordEmbeddings wordEmbeddings = new WordEmbeddings();
        wordEmbeddings.words = words.toArray(new String[0]);
        wordEmbeddings.embeddings = embeddingsList.toArray(new double[0][]);
        return wordEmbeddings;
    }

    /* Calculating Average Vector Only for Found Words: If a word is not found,
    it is simply ignored in the calculation. The average vector is computed only
    for the words that are found. If none of the words are found, the method returns
    null, and the user is informed.
     */
    public double[] getAverageVector(String[] inputWords) {
        double[] averageVector = new double[EMBEDDING_SIZE];
        int count = 0;

        for (String inputWord : inputWords) {
            double[] wordVector = getWordVector(inputWord);
            if (wordVector != null) {
                for (int i = 0; i < EMBEDDING_SIZE; i++) {
                    averageVector[i] += wordVector[i];
                }
                count++;
            } else {
                System.out.println("Word not found in embeddings: " + inputWord);
            }
        }

        if (count == 0) {
            return null; // None of the input words were found
        }

        // Calculate the average vector
        for (int i = 0; i < EMBEDDING_SIZE; i++) {
            averageVector[i] /= count;
        }

        return averageVector;
    }

    public double[] getWordVector(String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(word)) {
                return embeddings[i];
            }
        }
        return null;
    }

    public String[] getWords() {
        return words;
    }

    public double[][] getEmbeddings() {
        return embeddings;
    }
}
