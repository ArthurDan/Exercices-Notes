package better;

public class DisplayMenu {
    public static void displayMenu1(){
        System.out.println("Bienvenu dans le menu!\n");
        System.out.println("----------------------\n");
        System.out.println("s/S: Saisir les paramètres pour un nouvel employé\n");
        System.out.println("c/C: Lancer le clalcul des salaires\n");
        System.out.println("----------------------\n");
    }

    public static void displayMenu2(){
        System.out.println("Bienvenu dans le menu!\n");
        System.out.println("----------------------\n");
        System.out.println("1: Choisir le type d'employé\n");
        System.out.println("2: son prénom\n");
        System.out.println("3: son nom\n");
        System.out.println("4: son age\n");
        System.out.println("5: son année d'entrée\n");
        System.out.println("6: l'unité\n");
        System.out.println("----------------------\n");
    }

    VerifChoice choice1 = new VerifChoice();


    public static void displayMenu3(){
        System.out.println("Choix du type d'employé\n");
        System.out.println("----------------------\n");
        System.out.println("1: Créer un nouveau Vendeur\n");
        System.out.println("2: Créer un nouveu Représentant\n");
        System.out.println("3: Créer un nouveu Technicien\n");
        System.out.println("4: Créer un nouveu Manutentionnaire\n");
        System.out.println("5: Créer un nouveu Technarisque\n");
        System.out.println("6: Créer un nouveu ManutARisque\n");
        System.out.println("----------------------\n");
    }


}
