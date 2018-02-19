package com.gescol.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table
public class Matiere {

	@Id
//	@JsonView(Views.Common.class)
	public String nom;
//	@JsonView(Views.Common.class)
	public Couleur couleur;
	
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
