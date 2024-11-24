import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Collections;

public class UnifiedFileWritingExample {
    public static void main(String[] args) {
        writeUsingWriteString("output1.txt", "This is written using writeString().");
        writeUsingFileWriter("output2.txt", "This is written using FileWriter.");
        writeUsingBufferedWriter("output3.txt", "This is written using BufferedWriter.");
        writeUsingFileOutputStream("output4.txt", "This is written using FileOutputStream.");
        writeUsingPrintWriter("output5.txt", "This is written using PrintWriter.");
        writeFileUsingFiles("output6.txt", "This is written using Files.write.");
    }

    static void writeUsingWriteString(String fileName, String content) {
        try {
            Files.writeString(Paths.get(fileName), content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeUsingFileWriter(String fileName, String content) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeUsingBufferedWriter(String fileName, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeUsingFileOutputStream(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeUsingPrintWriter(String fileName, String content) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeFileUsingFiles(String fileName, String content) {
        try {
            Path path = Paths.get(fileName);
            Files.write(path, Collections.singletonList(content), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
