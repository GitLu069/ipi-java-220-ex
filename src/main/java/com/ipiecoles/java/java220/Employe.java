package com.ipiecoles.java.java220;
import org.joda.time.LocalDate;

public class Employe {

    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche;
    private Double salaire;

    //Constructeur
    public Employe() {
    }

    //Constructeur avec arguments
    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {

        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    public final Integer getNombreAnneeAnciennete() {
        return LocalDate.now().getYear() - dateEmbauche.getYear();
    }


    public String toString() {
        String r = "Employe{nom=" + this.nom + ", prenom=" + this.prenom + ", matricule=" + this.matricule + ", dateEmbauche=" + this.dateEmbauche + ", salaire=" + this.salaire + "}";
    }

    public Integer getNbConges(){
        return Entreprise.NB_CONGES_BASE;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate NewDateEmbauche) {
        if (NewDateEmbauche.isBefore(this.dateEmbauche)){
            System.out.println("La date d'embauche ne peut être postérieure à la date courante");

        }
        else{
            this.dateEmbauche=NewDateEmbauche;
        }
        this.dateEmbauche = dateEmbauche;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }



}