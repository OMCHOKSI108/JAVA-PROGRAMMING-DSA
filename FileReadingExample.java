import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class FileReadingExample {
    public static void main(String[] args) {
        FileReadingExample reader = new FileReadingExample();

        System.out.println("Using BufferedReader:");
        reader.buffReader();

        System.out.println("\nUsing FileReader:");
        reader.fileReader();

        System.out.println("\nUsing Scanner:");
        reader.scannerReader();

        System.out.println("\nUsing readAllLines:");
        List<String> lines = readFileInList("choksi.txt");
        for (String line : lines) {
            System.out.println(line);
        }

        System.out.println("\nUsing readFileAsString:");
        readFileAsString("choksi.txt");
    }

    void buffReader() {
        try (BufferedReader br = new BufferedReader(new FileReader("choksi.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file using BufferedReader: " + e.getMessage());
        }
    }

    void fileReader() {
        try (FileReader fr = new FileReader("choksi.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading file using FileReader: " + e.getMessage());
        }
    }

    void scannerReader() {
        try (Scanner sc = new Scanner(new File("choksi.txt"))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading file using Scanner: " + e.getMessage());
        }
    }

    public static List<String> readFileInList(String filename) {
        try {
            return Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Error reading file using readAllLines: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    // User-defined function to read file as a single string
    public static void readFileAsString(String fileName) {
        try {
            String data = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
            System.out.println(data);
        } catch (IOException e) {
            System.err.println("Error reading file as string: " + e.getMessage());
        }
    }
}
