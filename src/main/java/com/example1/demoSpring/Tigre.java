package com.example1.demoSpring;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Tigre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String nom;
    private int age;
    private String couleur;
    private boolean vaccin;



    public Tigre(String nom, int age, String couleur, boolean vaccin) {
        super();
        this.nom = nom;
        this.age = age;
        this.couleur = couleur;
        this.vaccin = vaccin;

    }

    public Tigre() {
        super();
        // TODO Auto-generated constructor stub
    }

    public boolean isVaccin() {
        return vaccin;
    }
    public void setVaccin(boolean vaccin) {
        this.vaccin = vaccin;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    @Override
    public String toString() {
        return "Tigre [nom=" + nom + ", age=" + age + ", couleur=" + couleur + ", vaccin=" + vaccin + "]";
    }



}
