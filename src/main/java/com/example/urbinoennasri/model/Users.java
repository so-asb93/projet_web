package com.example.urbinoennasri.model;


import javax.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_users;

    @Column(name = "mail")
    private String mail;
    @Column(name = "password")
    private String password;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;

    public int getIdUsers() {
        return id_users;
    }

    public void setIdUsers(int id_users) {
        this.id_users = id_users;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
