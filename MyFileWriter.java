
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void main(String[] args) {
        String passwordString = "This Is Top Secret! Get Out Of Here!";
        String fileName1 = "example1.txt";
        String fileName2 = "example2.txt";
        String fileName3 = "example3.txt";
        String fileName4 = "example4.txt";
        String fileName5 = "example5.txt";
        String fileInHiddenDir = "fileInHiddenDir.txt";
        String dataInHiddenDir = "This is in a hidden directory. Private stuff .....";
        String passwordFile = ".passwordFile.txt";

        // 5. Using Files (java.nio.file)
        try {
            Files.write(Paths.get(passwordFile), passwordString.getBytes(StandardCharsets.UTF_8));
            File hiddenDir = new File(".secretDirectory");
            hiddenDir.mkdir();
            Path hiddenDirPath = Paths.get(".secretDirectory");
            Path filePathHidden = hiddenDirPath.resolve(fileInHiddenDir);
            Files.write(filePathHidden, dataInHiddenDir.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printTotalFileSize(String... fileNames) {

        System.out.println("Total size of all files: ...TBD... bytes");
    }
}