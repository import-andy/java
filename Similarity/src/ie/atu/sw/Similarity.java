package ie.atu.sw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;


// Handles similarity calculation and outputting results.
public class Similarity {

    public void findAndOutputSimilarWords(double[] inputVector, int numMatches, String outputFilePath, WordEmbeddings wordEmbeddings) {
        String[] words = wordEmbeddings.getWords();
        double[][] embeddings = wordEmbeddings.getEmbeddings();

        PriorityQueue<WordSimilarity> queue = new PriorityQueue<>(Comparator.comparingDouble(ws -> -ws.similarity));

        for (int i = 0; i < words.length; i++) {
            double similarity = cosineSimilarity(inputVector, embeddings[i]);
            queue.add(new WordSimilarity(words[i], similarity));
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (int i = 0; i < numMatches && !queue.isEmpty(); i++) {
                WordSimilarity ws = queue.poll();
                writer.write(ws.word + ": " + ws.similarity);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }

        System.out.println("Top " + numMatches + " matches written to " + outputFilePath);
    }

    private double cosineSimilarity(double[] vectorA, double[] vectorB) {
        double dotProduct = 0.0;
        double normA = 0.0;
        double normB = 0.0;
        for (int i = 0; i < vectorA.length; i++) {
            dotProduct += vectorA[i] * vectorB[i];
            normA += Math.pow(vectorA[i], 2);
            normB += Math.pow(vectorB[i], 2);
        }
        return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
    }

    private static class WordSimilarity {
        String word;
        double similarity;

        WordSimilarity(String word, double similarity) {
            this.word = word;
            this.similarity = similarity;
        }
    }
}
