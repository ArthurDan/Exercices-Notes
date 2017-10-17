package better;

import java.util.Scanner;

public class VerifChoice {

    public static String verifChoiceMenu1(){
        Scanner sc = new Scanner(System.in);
        String choice1;
        boolean correctStr = false;
        do{
            while(!sc.hasNextInt()){
                System.out.println("Cette lettre n'est pas valable");
                System.out.print("Votre choix : ");
                sc.next();
            }

            choice1 = sc.nextLine();

            if(choice1.toLowerCase().equals("c") || choice1.toLowerCase().equals("s")){
                correctStr = true;
            }else{
                System.out.println("la lettre doit etre s ou c");
            }

        }while(!correctStr);
        return choice1;
    }

    public static int verifChoiceMenu2(){
        Scanner sc = new Scanner(System.in);
        int choice2;
        boolean correctNb = false;
        do{
            while(!sc.hasNextInt()){
                System.out.println("Ce n'est pas nombre!");
                System.out.print("Votre choix : ");
                sc.next();
            }

            choice2 = sc.nextInt();

            if(choice2 >= 1 && choice2 <= 6){
                correctNb = true;
            }else{
                System.out.println("Le nombre doit être compris entre 0 & 6 !");
            }

        }while(!correctNb);
        return choice2;
    }

    public static int verifChoiceMenu3(){
        Scanner sc = new Scanner(System.in);
        boolean correctNb = false;
        int choice3;
        do{
            while(!sc.hasNextInt()){
                System.out.println("Ce n'est pas nombre!");
                System.out.print("Votre choix : ");
                sc.next();
            }

            choice3 = sc.nextInt();

            if(choice3 >= 1 && choice3 <= 6){
                correctNb = true;
            }else{
                System.out.println("Le nombre doit être compris entre 0 & 6 !");
            }

        }while(!correctNb);
        return choice3;
    }
}
