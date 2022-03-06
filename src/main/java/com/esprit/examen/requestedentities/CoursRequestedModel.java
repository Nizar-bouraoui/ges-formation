package com.esprit.examen.requestedentities;

import java.util.Set;

import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.Session;
import com.esprit.examen.entities.TypeCours;

public class CoursRequestedModel {

	private Long id;
	private String description;
	private TypeCours typeCours;
	private String intitule;
	private Set<Session> sessions;

	public CoursRequestedModel(long i, String description, TypeCours typeCours, String intitule) {
		super();
		this.id = i;
		this.description = description;
		this.typeCours = typeCours;
		this.intitule = intitule;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TypeCours getTypeCours() {
		return typeCours;
	}

	public void setTypeCours(TypeCours typeCours) {
		this.typeCours = typeCours;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Set<Session> getSessions() {
		return sessions;
	}

	public void setSessions(Set<Session> sessions) {
		this.sessions = sessions;
	}

	public Cours toCours() {
		Cours cours = new Cours();
		cours.setId(this.id);
		cours.setDescription(this.description);
		cours.setIntitule(this.intitule);
		cours.setTypeCours(this.typeCours);
		cours.setSessions(this.sessions);

		return cours;
	}

}
