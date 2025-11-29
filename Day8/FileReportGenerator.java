/*Write a Java program that:
	- Create a text file essay.txt with multiple lines.
	- Open the text file and read the file line by line.
	- Counts the total number of words in the file.
	- Writes the following information to a new file called report.txt:
		Total number of lines: 
		Total number of words: 
	- Closes both files properly
	- Prints "Report generated successfully!" after writing.*/

import java.io.*;

public class FileReportGenerator {

    public static void main(String[] args) {

        String inputFile = "essay.txt";
        String outputFile = "report.txt";

        try {
            // ------------------- Step 1: Create essay.txt -------------------
            FileWriter fw = new FileWriter(inputFile);
            fw.write("Java is a powerful programming language.\n");
            fw.write("It is widely used for building applications.\n");
            fw.write("File handling in Java is simple and effective.");
            fw.close();

            // ------------------- Step 2: Read file line by line -------------------
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;
            int lineCount = 0;
            int wordCount = 0;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count words (split by spaces)
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            br.close();

            // ------------------- Step 3: Write report.txt -------------------
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            bw.write("Total number of lines: " + lineCount + "\n");
            bw.write("Total number of words: " + wordCount + "\n");
            bw.close();

            // ------------------- Step 4: Print message -------------------
            System.out.println("Report generated successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
