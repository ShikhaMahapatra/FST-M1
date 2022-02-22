package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Activity14 {
    public static void main(String[] args)
    {
        String filepath="C:\\Users\\HP\\Documents\\AlchemyWorkspace\\FST20-M1\\src\\main\\java\\activities";
        String fileContent="This file has been created for Activity 14";
        try {
        File file = new File(filepath+"\\newfile.txt");
        boolean fStatus = file.createNewFile();
            FileUtils.write(file,fileContent);
            System.out.println("Sucessfully created the file");
        //get the file Object
        File fileUtil = FileUtils.getFile(filepath+"\\newfile.txt");
        //Read file
        System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
        //Create directory
        File destDir = new File("resources");
        //Copy file to directory
        FileUtils.copyFileToDirectory(file, destDir);
        //Get file from new directory
        File newFile = FileUtils.getFile(destDir, "newfile.txt");
        //Read data from file
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
