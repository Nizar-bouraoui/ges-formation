package com.esprit.examen.requestedentities;
import java.util.Set;
import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.Session;
import com.esprit.examen.entities.TypeCours;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CoursRequestedModel {
	private Long id;
	private String description;
	private TypeCours typeCours;
	private String intitule;
	private Set<Session> sessions;
	public CoursRequestedModel() {
		// no args constructor
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
