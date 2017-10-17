package com.ynov;

import java.io.*;

public class CopyFile {
    public static void main(String [] args){
        File copy=new File("E:\\Cours\\Java\\Copié.txt");// initialisation fichier copié avec son path
        File paste=new File ("E:\\Cours\\Java\\Collé.txt");// initialisation fichier collé avec son path voulu
        String line="";//initialisation variable qui stockera le contenu du fichié copié
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(copy))){ //lecture du fichier copié & sauvagarde du contenu du fichier via bufferedReader
            paste.createNewFile();// création du fichier dans lequel nous allons coller le contenu
            FileWriter writeFile=new FileWriter(paste);//ouverture du fichier collé pour écriture
            line = bufferedReader.readLine();//stockage du contenu di fichier copié dans la variable line
            while(line != null){

                writeFile.write(line + System.getProperty("line.separator"));//écriture du fichier collé
                line = bufferedReader.readLine();
            }
            writeFile.close(); // fermer le fichier à la fin des traitements
        } catch (Exception e) {}
    }
}
