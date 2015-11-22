package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import edu.iut.resources.*;

public class ApplicationSession {
	
	// Exercice 1 : Gérer l'internationation
	protected /* Objet permettant la gestion des 'resources bundle' */ ResourceBundle resourceBundle;
	protected /* Objet permettant la gestion des Locales */Locale locale;
	
	// Exercice 2 : Logger
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;


	private /*Qu'est ce qu'un singleton ?*/static ApplicationSession session = null;
	private ApplicationSession() {
		/* Definir US comme locale par défaut */
		Locale.setDefault(Locale.US);/* à compléter */
		
		locale = Locale.getDefault();
		resourceBundle = /* à compléter */ResourceBundle.getBundle("edu.iut.resources.strings.res");
		sessionGuiLogger = /* Initialiser le logger */Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		sessionGuiLogger.setLevel(Level.ALL/* Touls les message doivent être affiché */);
		sessionExceptionLogger = /* Logger pour exception */Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		sessionExceptionLogger.setLevel(Level.ALL/* Touls les message doivent être affiché */);
	}
	
	
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle= ResourceBundle.getBundle("edu.iut.resources.strings.res");/* récupérer les resources */
	}
	
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
	
}
