package edu.iut.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iut.app.*;

// Exercice 2 
public class IUTException /* étendre les exceptio, */ extends Exception{
	protected Logger sessionExceptionLogger;
	
	public IUTException() {
		super();
		// Logger une erreur avec le message empty en utilisant le singleton session, ie le logger défini dans la session */
		sessionExceptionLogger = /* Logger pour exception */Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		sessionExceptionLogger.setLevel(Level.ALL/* Touls les message doivent être affiché */);
		sessionExceptionLogger.log(sessionExceptionLogger.getLevel(), "empty");
	}
	public IUTException(IUTException e) {
		super(e);
		// Logger une erreur avec le message contenu dans 'e'  en utilisant le singleton session, ie le logger défini dans la session */
		sessionExceptionLogger = /* Logger pour exception */Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		sessionExceptionLogger.setLevel(Level.ALL/* Touls les message doivent être affiché */);
		sessionExceptionLogger.log(sessionExceptionLogger.getLevel(), e.getMessage());
	}
	public IUTException(String message) {
		super(message);
		// Logger une erreur avec le message contenu dans 'message'  en utilisant le singleton session, ie le logger défini dans la session */
		sessionExceptionLogger = /* Logger pour exception */Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		sessionExceptionLogger.setLevel(Level.ALL/* Touls les message doivent être affiché */);
		sessionExceptionLogger.log(sessionExceptionLogger.getLevel(), message);
	}
	
}
