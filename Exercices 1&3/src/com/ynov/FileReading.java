package com.ynov;

import java.io.File;
import java.util.Scanner;

public class FileReading {

    private String initialpath = "";
    public int filecount = 0;
    public boolean empty = false;

    public FileReading(String path) {
        this.initialpath = path;
    }

    public void list() {
        this.listDirectory(this.initialpath);
    }

    private void listDirectory(String dir) {
        File file = new File(dir);
        File[] files = file.listFiles();
        if (file.isDirectory()) {
            System.out.println("Dossier");
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile() == true) {
                    System.out.println("  Fichier: " + files[i].getName());
                    this.filecount++;
                    empty = true;
                }
            }
            if (empty==false)System.out.println("Il n'y a pas de fichiers dans le répertoire donné!");
        }
        else if(file.isFile())System.out.println("C'est un fichier");
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
        diskFileExplorer.list();
        System.out.println("----------");
        System.out.println("Analyse de " + pathToExplore);
        System.out.println(diskFileExplorer.filecount + " fichiers");
    }
}

