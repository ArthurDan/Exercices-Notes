package com.ynov;

import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class WriteFolder {
    public static void main(String [] args){
        String line="";
        Scanner sc = new Scanner(System.in);
        try{
            File file=new File("E:\\Cours\\Java\\Test.txt"); // définir l'adresse du fichier dans lequel nous allons écrire
            file.createNewFile();//création du fichier
            FileWriter writeFile=new FileWriter(file);//sert pour l'écriture de caractères dans le fichier
            System.out.println("Ecrivez votre ligne !");
            line = sc.nextLine(); //édition de la première ligne (si quit est entré des la premiere ligne, le fichier sera fermé)
            while(!line.toLowerCase().equals("quit")){ // écrire des ligne tant que "quit" n'est pas écrit
                writeFile.write(line + System.getProperty("line.separator")); // écrire une ligne dans le fichier Test.txt + forcer le passage à la ligne
                System.out.println("Ecrivez votre ligne !");
                line = sc.nextLine();//sauvegarde de l'entrée utilisateur dans la variable line
            }
            writeFile.close(); // fermer le fichier à la fin des traitements
        } catch (Exception e) {}
    }
}
