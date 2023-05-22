package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("inputFile.txt");
            boolean fStatus = file.createNewFile();
            if (fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }
            File fileUtil = FileUtils.getFile("inputFile.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));


            File destDir = new File("../resources");
            FileUtils.copyFileToDirectory(file, destDir);
            File newFile = FileUtils.getFile(destDir, "outputFile.txt");
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
