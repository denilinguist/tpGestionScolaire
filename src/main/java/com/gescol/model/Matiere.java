package com.gescol.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table
public class Matiere {

	@Id
	private String nom;
	@Enumerated(EnumType.STRING)
	private Couleur couleur;
	
	@ManyToOne
	private Classe classe;
	
	@ManyToOne
	private Professeur professeur;
	
	public Matiere() {
		super();
	}

	public Matiere(String nom, Couleur couleur) {
		super();
		this.nom = nom;
		this.couleur = couleur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
	
}
