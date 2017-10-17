package com.ynov;

import java.io.File;
import java.util.Scanner;

public class FileReading {

    String initialpath = "";//adresse du répertoire
    int filecount = 0;// compteur de files
    boolean empty = false; // variable servant à savoir si le répertoire donné est vide ou non

    public FileReading(String path) {
        initialpath = path;
    }//constructeur

    public void list() {
        listDirectory(initialpath);
    }

    private void listDirectory(String dir) {
        File file = new File(dir); //créer un file de type File
        File[] files = file.listFiles(); // créer un tables File de files qui stocke les fichiers du path
        if (file.isDirectory()) { // verifie si le path correspond à un dossier
            System.out.println(dir + " est un dossier");
            for (int i = 0; i < files.length; i++) { //on parcourt les files stockés dans le tableau
                if (files[i].isFile() == true) {//vérification s'il le files[i] est bien un fichier
                    System.out.println("  Fichier: " + files[i].getName());// affichage du nom du fichier
                    this.filecount++;
                    empty = true;
                }
            }
            if (empty==false)System.out.println("Il n'y a pas de fichiers dans le répertoire donné!");
        }
        else if(file.isFile())System.out.println(dir + " est un fichier"); // verifie si le path correspond à un fichier
        else{
            System.out.println("Chemin incorrect !");
        }
    }
    public static void main(String[] args) {
        System.out.println("Entrez un chemin d'accès : ");
        Scanner sc = new Scanner(System.in);
        String str =   sc.nextLine();//adresse du répertoire
        String pathToExplore = str;
        FileReading diskFileExplorer = new FileReading(pathToExplore);
        System.out.println("Analyse de " + pathToExplore);
        diskFileExplorer.list(); // appel de la méthode list
        System.out.println(diskFileExplorer.filecount + " fichiers");
    }
}

