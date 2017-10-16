package com.ynov;

import java.io.File;
import java.util.Scanner;

public class Extension {
    private String initialpath = "";
    public String ext;
    public boolean empty = false;

    public Extension(String path, String extension) {
        this.initialpath = path;
        this.ext=extension;
    }

    public void list() {
        this.listDirectory(this.initialpath, this.ext);
    }

    private void listDirectory(String dir,String ext) {
        File file = new File(dir);
        File[] files = file.listFiles();
        if (file.isDirectory()) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile() == true && files[i].getName().endsWith(ext) ) {
                    System.out.println("  Fichier: " + files[i].getName());
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
        String pathToExplore =   sc.nextLine();
        System.out.println("Entrez une extension ");
        String ext =   sc.nextLine();
        Extension diskFileExplorer = new Extension(pathToExplore, ext);
        diskFileExplorer.list();
        System.out.println("----------");
        System.out.println("Analyse de " + pathToExplore);
    }
}
