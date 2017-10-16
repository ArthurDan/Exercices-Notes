package com.ynov;

import java.io.File;
import java.util.Scanner;

public class FileReading {

    String initialpath = "";
    int filecount = 0;
    boolean empty = false;

    public FileReading(String path) {
        initialpath = path;
    }

    public void list() {
        listDirectory(initialpath);
    }

    private void listDirectory(String dir) {
        File file = new File(dir);
        File[] files = file.listFiles();
        if (file.isDirectory()) {
            System.out.println(dir + " est un dossier");
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile() == true) {
                    System.out.println("  Fichier: " + files[i].getName());
                    this.filecount++;
                    empty = true;
                }
            }
            if (empty==false)System.out.println("Il n'y a pas de fichiers dans le répertoire donné!");
        }
        else if(file.isFile())System.out.println(dir + " est un fichier");
        else{
            System.out.println("Chemin incorrect !");
        }
    }
    public static void main(String[] args) {
        System.out.println("Entrez un chemin d'accès : ");
        Scanner sc = new Scanner(System.in);
        String str =   sc.nextLine();
        String pathToExplore = str;
        FileReading diskFileExplorer = new FileReading(pathToExplore);
        System.out.println("Analyse de " + pathToExplore);
        diskFileExplorer.list();
        System.out.println(diskFileExplorer.filecount + " fichiers");
    }
}

