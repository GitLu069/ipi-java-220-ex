package com.ipiecoles.java.java220;
import org.joda.time.LocalDate;

interface Comparable {

}

public class Technicien extends Employe implements Comparable{

    private Integer grade;

    public Technicien(String name, String fName, String matric, LocalDate dateEmb, Double salary, Integer grade) {
        super(name, fName, matric, dateEmb, salary);
        this.grade = grade;

    }

    public Technicien(){

    }

    public Integer compareTo(Technicien tech){
        if (tech.getGrade()<this.grade){
            return 1;
        }else if (tech.getGrade()>this.grade){
            return -1;
        }else if (tech.getGrade()==this.grade){
            return 0;
        }

        return null;
    }

    @Override
    public Double getPrimeAnnuelle(){

        return Entreprise.primeAnnuelleBase()+
                (Entreprise.primeAnnuelleBase()*Double.parseDouble("0."+this.getGrade()))+
                super.getNombreAnneeAnciennete()*100;
    }

    //Getter and setter
    public Integer getGrade() {
        return grade;
    }
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public void setSalaire(Double salaire) {

        super.setSalaire(salaire+this.getGrade()*100);
    }
    @Override
    public Integer getNbConges(){

        return Entreprise.NB_CONGES_BASE+this.getNombreAnneeAnciennete();
    }
}
