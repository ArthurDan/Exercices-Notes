package com.ynov;

        import java.io.*;
        import java.net.*;

public class ImgDist {
    public static void main(String [] args) {
        try {
            URLConnection ucon = new URL("https://www.google.fr/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png").openConnection();// ouverture connection ver url
            FileOutputStream fos = new FileOutputStream("E:\\Cours\\Java\\prout.png");//création d'un nouveau fichier dans lequel nous allons écrire des données
            InputStream in = ucon.getInputStream(); //lecture du flux d'entrée c-à-d le fichier de l'adresse url
            byte[] buf = new byte[1024];// création buffer de 1024octets
            int b;
            while ((b = in.read(buf,0,buf.length)) != -1)//tant que l'image a un taille et rentre dans le buffer, il écrit son contenu dans le nouveau fichier local
                fos.write(buf,0,b);
            fos.close();// fermeture du fichier local.
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
