package better;

import better.domain.*;
import better.service.Personnel;
import java.util.*;

public class Salaires {
    public static void main(String[] args) {

        Personnel p = new Personnel();

        p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));

       /* p.afficherSalaires();
        System.out.println(String.format(
                "Le salaire moyen dans l'entreprise est de %.2f francs.",
                p.salaireMoyen()
        ));*/

       DisplayMenu.displayMenu1();
       if(VerifChoice.verifChoiceMenu1().toLowerCase().equals("s"))DisplayMenu.displayMenu2();
       else if(VerifChoice.verifChoiceMenu1().toLowerCase().equals("c"))p.afficherSalaires();
       if (VerifChoice.verifChoiceMenu2() == 1){
           DisplayMenu.displayMenu3();
           VerifChoice.verifChoiceMenu3();
       }




    }
}
