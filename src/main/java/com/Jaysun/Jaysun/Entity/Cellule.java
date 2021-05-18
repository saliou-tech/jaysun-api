package com.Jaysun.Jaysun.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Cellule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nomcellule;
    private Long effectif;
    private Long nombredeSection;
    private String Jeuwrin;
    private String Adjoint;
    private String Trésorier;
    private  String PdtCOM;
    private  String PdtOrganisation;
    private  String PdtCulturel;
    private  String PdtSaytou;
    private  String PdtSocial;
    private  String PdtCommite;
    private  String PdtFeminine;
    private  String coordonateurPrincipal;
    private  String coordonateurDeSection;
    @OneToMany(mappedBy = "cellule")
    @JsonManagedReference
    private Collection<Membre> membres;
    public Collection<Membre> getMembres() {
        return membres;
    }

    public void setMembres(Collection<Membre> membres) {
        this.membres = membres;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomcellule() {
        return nomcellule;
    }

    public void setNomcellule(String nomcellule) {
        this.nomcellule = nomcellule;
    }

    public Long getEffectif() {
        return effectif;
    }

    public void setEffectif(Long effectif) {
        this.effectif = effectif;
    }

    public Long getNombredeSection() {
        return nombredeSection;
    }

    public void setNombredeSection(Long nombredeSection) {
        this.nombredeSection = nombredeSection;
    }

    public String getJeuwrin() {
        return Jeuwrin;
    }

    public void setJeuwrin(String jeuwrin) {
        Jeuwrin = jeuwrin;
    }

    public String getAdjoint() {
        return Adjoint;
    }

    public void setAdjoint(String adjoint) {
        Adjoint = adjoint;
    }

    public String getTrésorier() {
        return Trésorier;
    }

    public void setTrésorier(String trésorier) {
        Trésorier = trésorier;
    }

    public String getPdtCOM() {
        return PdtCOM;
    }

    public void setPdtCOM(String pdtCOM) {
        PdtCOM = pdtCOM;
    }

    public String getPdtOrganisation() {
        return PdtOrganisation;
    }

    public void setPdtOrganisation(String pdtOrganisation) {
        PdtOrganisation = pdtOrganisation;
    }

    public String getPdtCulturel() {
        return PdtCulturel;
    }

    public void setPdtCulturel(String pdtCulturel) {
        PdtCulturel = pdtCulturel;
    }

    public String getPdtSaytou() {
        return PdtSaytou;
    }

    public void setPdtSaytou(String pdtSaytou) {
        PdtSaytou = pdtSaytou;
    }

    public String getPdtSocial() {
        return PdtSocial;
    }

    public void setPdtSocial(String pdtSocial) {
        PdtSocial = pdtSocial;
    }

    public String getPdtCommité() {
        return PdtCommite;
    }

    public void setPdtCommité(String pdtCommité) {
        PdtCommite = pdtCommité;
    }

    public String getPdtFeminine() {
        return PdtFeminine;
    }

    public void setPdtFeminine(String pdtFeminine) {
        PdtFeminine = pdtFeminine;
    }

    public String getCoordonateurPrincipal() {
        return coordonateurPrincipal;
    }

    public void setCoordonateurPrincipal(String coordonateurPrincipal) {
        this.coordonateurPrincipal = coordonateurPrincipal;
    }

    public String getCoordonateurDeSection() {
        return coordonateurDeSection;
    }

    public void setCoordonateurDeSection(String coordonateurDeSection) {
        this.coordonateurDeSection = coordonateurDeSection;
    }







}
