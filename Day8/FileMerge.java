/*Write a Java program that:

	- Reads the contents of two text files: file1.txt and file2.txt.
	- Merges the content of both files alternating line by line (one line from file1.txt, then one from file2.txt).
	- Writes the merged content to a new file called merged.txt.
	- If one file has more lines than the other, the remaining lines from the longer file should be appended after the  alternating lines.
	- Prints "Merge completed successfully!" once done.
*/

import java.io.*;

public class FileMerge {

    public static void main(String[] args) {

        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String mergedFile = "merged.txt";

        try {
            // -------- Step 1: Create sample files (optional for testing) --------
            FileWriter fw1 = new FileWriter(file1);
            fw1.write("Apple\nBanana\nCherry\nDate");
            fw1.close();

            FileWriter fw2 = new FileWriter(file2);
            fw2.write("X-ray\nYam\nZebra");
            fw2.close();

            // -------- Step 2: Readers for both files --------
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile));

            String line1, line2;

            // -------- Step 3: Alternate lines --------
            while (true) {
                line1 = br1.readLine();
                line2 = br2.readLine();

                if (line1 == null && line2 == null) {
                    break;  // both files finished
                }

                if (line1 != null) {
                    bw.write(line1);
                    bw.newLine();
                }
                if (line2 != null) {
                    bw.write(line2);
                    bw.newLine();
                }
            }

            // -------- Step 4: Close streams --------
            br1.close();
            br2.close();
            bw.close();

            System.out.println("Merge completed successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
