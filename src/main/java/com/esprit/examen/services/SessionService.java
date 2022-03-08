package com.esprit.examen.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.esprit.examen.entities.Session;

import com.esprit.examen.repositories.SessionRepository;

@Service
public class SessionService implements ISessionService{

	private static final org.apache.logging.log4j.Logger l  = LogManager.getLogger(SessionService.class);
	@Autowired
	SessionRepository sessionRepository;
	@Override
	public Long addSession(Session session) {
		
		try {
			l.info("In addSession() : ");
			l.debug("Je vais lancer l'ajout.");
			
			l.debug("Je viens de lancer l'ajout. " +sessionRepository.save(session) );
			l.debug("Je viens de finir l'opération .");

			l.info("Out addSession() without errors.");
			}
			catch (Exception e) { l.error("Erreur dans addSession() : " + e); }
		
		return session.getId();
	}

	@Override
	public Long modifierSession(Session session) {
		sessionRepository.save(session);
		return session.getId();
	}

	@Override
	public void supprimerSession(Long sessionId) {
		sessionRepository.deleteById(sessionId);
	}

	@Override
	public void affecterFormateurASession(Long formateurId, Long sessionId) {
			/*todo*/
		
	}

	@Override
	public Long countSession() {
		return sessionRepository.count();
	}

	@Override
	public void deleteAll() {
		sessionRepository.deleteAll();
		
	}

	@Override
	public List<Session> getSession() {
		List<Session> session = sessionRepository.findAll();
		return session;
	}

}
