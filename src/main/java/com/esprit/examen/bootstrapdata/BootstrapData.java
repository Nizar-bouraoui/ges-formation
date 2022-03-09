package com.esprit.examen.bootstrapdata;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.esprit.examen.entities.Contrat;
import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.Formateur;
import com.esprit.examen.entities.Poste;
import com.esprit.examen.entities.Session;
import com.esprit.examen.entities.TypeCours;
import com.esprit.examen.services.CoursService;
import com.esprit.examen.services.FormateurService;
import com.esprit.examen.services.SessionService;

@Component
public class BootstrapData implements CommandLineRunner {
	private final CoursService coursService;
	private final SessionService sessionService;
	private final FormateurService formateurService;
	private static final org.apache.logging.log4j.Logger l  = LogManager.getLogger(BootstrapData.class);

	

	public BootstrapData(CoursService coursService,SessionService sessionService,FormateurService formateurService) {
		super();
		this.coursService = coursService;
		this.sessionService = sessionService;
		this.formateurService= formateurService;
	}


	@Override
	public void run(String... args) throws Exception {
		coursService.deleteAll();
		l.info("table cours purged" );
		Cours cours = new Cours();
		cours.setDescription("Maîtrisez Javascript grâce au cours le plus complet sur internet ! Projets, exercices, quiz, ES8 et bien d’autres !");
		cours.setIntitule("JavaScript : la formation ULTIME");
		cours.setTypeCours(TypeCours.INFORMATIQUE);
		coursService.addCours(cours);
		l.info("entity cours saved" );
		
		
		sessionService.deleteAll();
		l.info("table session purged" );
		Session session = new Session();
		session.setDateDebut("11/12/2022");
		session.setDateFin("20/12/2022");
		session.setDescription("Session Principale");
		session.setDuree(30L);
		sessionService.addSession(session);
		l.info("entity session saved" );
		
		Formateur formateur=new Formateur();
		formateur.setAdmin(true);
		formateur.setContrat(Contrat.CDI);
		formateur.setEmail("bensassi.saifeddine@esprit.tn");
		formateur.setNom("saif eddine");
		formateur.setPassword("password");
		formateur.setPoste(Poste.Ingénieur);
		formateur.setPrenom("BEN SASSI");
		formateurService.addFormateur(formateur);
		l.info ("formateur ajouter avec succes");
	}

}
