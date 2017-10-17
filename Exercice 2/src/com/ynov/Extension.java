package com.ynov;

import java.io.File;
import java.util.Scanner;

public class Extension {
     String initialpath = "";//adresse du répertoire
     String ext;// déclaration extension
     int filecount = 0;// compteur de files
     boolean empty = false;// variable servant à savoir si le répertoire donné est vide ou non

    public Extension(String path, String extension) { //constructeur
        initialpath = path;
        ext=extension;
    }

    public void list() {
        listDirectory(initialpath, ext);
    }

    private void listDirectory(String dir,String ext) {
        File file = new File(dir);//créer un file de type File
        File[] files = file.listFiles();//créer un tables File de files qui stocke les fichiers du path
        if (file.isDirectory()) { // verifie si le path correspond à un dossie
            for (int i = 0; i < files.length; i++) {//on parcourt les files stockés dans le tableau
                if (files[i].isFile() == true && files[i].getName().endsWith(ext) ) { //vérification s'il le files[i] est bien un fichier avec l'extension passé en paramètre
                    System.out.println("  Fichier: " + files[i].getName());// affichage du nom du fichier
                    this.filecount++;
                    empty = true;
                }
            }
            if (empty==false)System.out.println("Il n'y a pas de fichiers dans le répertoire donné!");
        }
        else{
            System.out.println("Chemin incorrect !");
        }
    }
    public static void main(String[] args) {
        System.out.println("Entrez un chemin d'accès : ");
        Scanner sc = new Scanner(System.in);
        String pathToExplore = sc.nextLine();//adresse du répertoire
        System.out.println("Entrez une extension ");
        String ext = sc.nextLine();//extension entrée
        Extension diskFileExplorer = new Extension(pathToExplore, ext);
        System.out.println("Analyse de " + pathToExplore);
        diskFileExplorer.list();//appel de la méthode list
        System.out.println(diskFileExplorer.filecount + " fichiers avec l'extension " + ext + ".");

    }
}
