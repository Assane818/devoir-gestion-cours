package view;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import entities.Cours;
import entities.Professeur;
import service.ProfesseurService;

public class CoursView extends ViewImpl<Cours> {
    private ProfesseurService professeurService;

    public CoursView(ProfesseurService professeurService) {
        this.professeurService = professeurService;
    }

    @Override
    public Cours saisie() {
        Cours cours = new Cours();
        Professeur professeur;
        scanner.nextLine();
        do {
            System.out.println("Entrer la date");
            cours.setDate(formatDate(scanner.nextLine()));
        } while(cours.getDate().compareTo(LocalDate.now()) < 0);
        do {
            System.out.println("Entrer l'heure de debut");
            cours.setHeureDb(formatTime(scanner.nextLine()));
            System.out.println("Entrer l'heure de fin");
            cours.setHeureFin(formatTime(scanner.nextLine()));
        } while (cours.getHeureDb().compareTo(cours.getHeureFin()) >= 0);
        do {
            System.out.println("Entrer le numero de telephone du professeur");
            professeur = professeurService.getBy(scanner.nextLine());    
        } while (professeur == null);
        cours.setProfesseur(professeur);
        professeur.setCoursProf(cours);
        return cours;
    }
    
    public LocalDate formatDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date, formatter);
    }
    public LocalTime formatTime(String heure) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(heure, formatter);
    }
}
