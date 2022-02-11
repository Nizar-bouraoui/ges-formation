package com.esprit.examen.services;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.Contrat;
import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.Formateur;
import com.esprit.examen.entities.Poste;
import com.esprit.examen.entities.TypeCours;
import com.esprit.examen.repositories.CoursRepository;
import com.esprit.examen.repositories.FormateurRepository;

@SpringBootTest
public class FormateurServiceTest {
	@Autowired
	FormateurRepository formateurRepository ;
	@Test
	public void testAddFormateur() {
		Formateur formateur = new Formateur();
		formateur.setAdmin(true);
		formateur.setContrat(Contrat.CDI);
		formateur.setEmail("bensassi.saifeddine@esprit.tn");
		formateur.setNom("saif eddine");
		formateur.setPassword("password");
		formateur.setPoste(Poste.Ingénieur);
		formateur.setPrenom("BEN SASSI");
		
		Long dataBeforeTest = formateurRepository.count();
		formateurRepository.save(formateur);
		Long dataAfterTest = formateurRepository.count();
		assertThat(dataBeforeTest).isEqualTo(dataAfterTest -1);
		formateurRepository.delete(formateur);
		
	}

}
