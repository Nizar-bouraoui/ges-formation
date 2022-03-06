package com.esprit.examen.requestedEntities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.TypeCours;
import com.esprit.examen.requestedentities.CoursRequestedModel;
@SpringBootTest
class CoursRequestedModelTest {

	
	@Test
	void testToCours() {
		CoursRequestedModel coursRequestedModel = new CoursRequestedModel(1L, "test",  TypeCours.Informatique,  "test");
		coursRequestedModel.setId(1L);
		coursRequestedModel.setDescription("test");
		coursRequestedModel.setTypeCours(TypeCours.Informatique);
		coursRequestedModel.setIntitule("test");

        
        Cours entity = coursRequestedModel.toCours();

        assertEquals(entity.getId(), coursRequestedModel.getId());
        assertEquals(entity.getDescription(), coursRequestedModel.getDescription());
        assertEquals(entity.getIntitule(), coursRequestedModel.getIntitule());
        assertEquals(entity.getTypeCours(), coursRequestedModel.getTypeCours());
	}

}
