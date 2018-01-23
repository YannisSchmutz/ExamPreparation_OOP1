package in_out_exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ask user for two file names, one for the input and one for the output and copy line-by-line from
 * the input file to the output file. During this process, the lines are numbered and converted to
 * upper case. Here, main throws an exception if an error occurs. Here, errors are handled using a
 * try/catch and a corresponding error message is shown.
 */
public class TextFileCopierWithCatch {
    /**
     * Asks for two file names, open files, copies and processes line by line.
     *
     * @param args command line arguments are ignored.
     */
    public static void main(String[] args) {
        try {
            Scanner consoleScanner = new Scanner(System.in);
            System.out.print("Input text file: ");
            String inputFileName = consoleScanner.next();
            FileReader fileReader = new FileReader(inputFileName);

            System.out.print("Output text file: ");
            String outputFileName = consoleScanner.next();
            FileWriter fileWriter = new FileWriter(outputFileName);

            Scanner fileScanner = new Scanner(fileReader);
            int lineNumber = 0;
            while (fileScanner.hasNextLine()) { // repeat as long as there are lines
                lineNumber++;
                String line = fileScanner.nextLine();
                fileWriter.write(lineNumber + ": " + line.toUpperCase() + '\n');
            }
            System.out.println("Processed " + lineNumber + " lines.");
            fileScanner.close();
            fileReader.close();
            fileWriter.close();
            consoleScanner.close();
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
