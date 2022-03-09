package com.esprit.examen.requestedentities;

import java.util.Set;

import com.esprit.examen.entities.Contrat;
import com.esprit.examen.entities.Formateur;
import com.esprit.examen.entities.Poste;
import com.esprit.examen.entities.Session;

public class FormateurRequestedModel {
	private Long id;
	private String nom;
	private String prenom;
	private Poste poste;
	private Contrat contrat;
	private String email;
	private String password;
	private Boolean admin;
	private Set<Session> sessions;
	public FormateurRequestedModel() {
	}
	
	public Formateur thisFormateur() {
		Formateur formateur = new Formateur();
		formateur.setId(this.id);
		formateur.setNom(this.nom);
		formateur.setPrenom(this.prenom);
		formateur.setPoste(this.poste);
		formateur.setContrat(this.contrat);
		formateur.setEmail(this.email);
		formateur.setPassword(this.password);
		formateur.setAdmin(this.admin);
		formateur.setSessions(this.sessions);
		return formateur;
	}
}
