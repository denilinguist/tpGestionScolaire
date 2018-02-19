package com.gescol.model;



import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Professeur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@JsonView(Views.Common.class)
	public Integer id;
//	@JsonView(Views.Common.class)
	public String nom;
//	@JsonView(Views.Common.class)
	public String prenom;
//	@JsonView(Views.Common.class)
	public Date dateNaissance;
//	@JsonView(Views.ProfesseurWithMatier.class)
	public List<Matiere> matieres;
	
	public Professeur() {
		super();
	}

	public Professeur(Integer id, String nom, String prenom, Date dateNaissance, List<Matiere> matieres) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.matieres = matieres;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}
	
	
	
}
