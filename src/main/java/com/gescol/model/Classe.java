package com.gescol.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Classe {

	@Id
	public String nom;
	public int capacite;
	public List<Matiere> matieres;
	
	public Classe() {
		super();
	}

	public Classe(String nom, int capacite, List<Matiere> matieres) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.matieres = matieres;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}
	
	
}
