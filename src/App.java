import java.util.Scanner;

import entities.Professeur;
import service.CoursService;
import service.ProfesseurService;
import view.CoursView;
import view.ProfesseurView;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ProfesseurView.setScanner(scanner);
        CoursView.setScanner(scanner);
        ProfesseurService professeurService = new ProfesseurService();
        CoursService coursService = new CoursService();
        CoursView coursView = new CoursView(professeurService);
        ProfesseurView professeurView = new ProfesseurView(professeurService);
        int choix;
        do {
            choix = ShowMenu();
            switch (choix) {
                case 1:
                    professeurService.save(professeurView.saisie());
                    break;
                case 2:
                    professeurView.affiche(professeurService.show());
                    break;
                case 3:
                    coursService.save(coursView.saisie());
                    break;
                case 4:
                    coursView.affiche(coursService.show());
                    break;
                case 5:
                    Professeur professeur = professeurService.getBy(professeurView.saisieString("Entrer le numro du professeur"));
                    if (professeur == null) {
                        System.out.println("le professeur n'existe pas");
                        break;
                    }
                    professeurView.listerCoursProf(professeur);
                    break;
                default:
                    break;
            }
        }while (choix != 6);

    }

    public static int ShowMenu() {
        System.out.println("1- Ajouter professeur");
        System.out.println("2- Lister professeur");
        System.out.println("3- creer cours");
        System.out.println("4- Lister tout les cours");
        System.out.println("5- Lister les cours d'un professeur");
        System.out.println("6- Quitter");
        return scanner.nextInt();
    }
}
