package com.esprit.examen.bootstrapdata;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.TypeCours;
import com.esprit.examen.services.CoursService;

@Component
public class BootstrapData implements CommandLineRunner {
	private final CoursService coursService;
	private static final org.apache.logging.log4j.Logger l  = LogManager.getLogger(BootstrapData.class);

	

	public BootstrapData(CoursService coursService) {
		super();
		this.coursService = coursService;
	}


	@Override
	public void run(String... args) throws Exception {
		coursService.deleteAll();
		l.info("table cours purged" );
		Cours cours = new Cours();
		cours.setDescription("Maîtrisez Javascript grâce au cours le plus complet sur internet ! Projets, exercices, quiz, ES8 et bien d’autres !");
		cours.setIntitule("JavaScript : la formation ULTIME");
		cours.setTypeCours(TypeCours.Informatique);
		coursService.addCours(cours);
		l.info("entity cours saved" );
	}

}
