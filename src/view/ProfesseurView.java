package view;

import entities.Cours;
import entities.Professeur;
import service.ProfesseurService;

public class ProfesseurView extends ViewImpl<Professeur> {
    private ProfesseurService professeurService;

    public ProfesseurView(ProfesseurService professeurService) {
        this.professeurService = professeurService;
    }

    @Override
    public Professeur saisie() {
        Professeur professeur = new Professeur();
        scanner.nextLine();
        System.out.println("Entrer le nom complet");
        professeur.setNomComplet(scanner.nextLine());
        do {
            System.out.println("Entrer le numero de telephone");
            professeur.setTel(scanner.nextLine());
        } while(professeurService.getBy(professeur.getTel()) != null);
        
        return professeur;
    }

    public void listerCoursProf(Professeur professeur) {
        for (Cours cours : professeur.getCoursProf()) {
            System.out.println(cours);
        }
    }
    
}
