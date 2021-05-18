package com.Jaysun.Jaysun.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Membre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String telephone;
    private String profession;
    private String CNI;
    private String EtatMatrimonial;
    private String ActiviteActuelle;
    private String statut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, updatable = false)
    @JsonBackReference
    private Cellule cellule;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCNI() {
        return CNI;
    }

    public void setCNI(String CNI) {
        this.CNI = CNI;
    }

    public String getEtatMatrimonial() {
        return EtatMatrimonial;
    }

    public void setEtatMatrimonial(String etatMatrimonial) {
        EtatMatrimonial = etatMatrimonial;
    }

    public String getActiviteActuelle() {
        return ActiviteActuelle;
    }

    public void setActiviteActuelle(String activiteActuelle) {
        ActiviteActuelle = activiteActuelle;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


}
