package com.ynov;

import java.io.*;

public class CopyFile {
    public static void main(String [] args){
        File copy=new File("E:\\Cours\\Java\\Copié.txt");
        File paste=new File ("E:\\Cours\\Java\\Collé.txt");
        String line="";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(copy))){
            paste.createNewFile();
            FileWriter writeFile=new FileWriter(paste);
            line = bufferedReader.readLine();
            while(line != null){

                writeFile.write(line + System.getProperty("line.separator"));
                line = bufferedReader.readLine();
            }
            writeFile.close(); // fermer le fichier à la fin des traitements
        } catch (Exception e) {}
    }
}
