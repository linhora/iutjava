package edu.iut.app;

import java.text.*;
import java.util.*;


public class CriteriaDate implements ICriteria {

	@Override
	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> event) {
		ArrayList<ExamEvent> date = new ArrayList<ExamEvent>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateD = "20/06/2015"; // Date début des soutenances
		String dateF = "24/06/2015"; // Date fin des soutenances
		try {
			Date dateDebut = simpleDateFormat.parse(dateD);
			Date dateFin = simpleDateFormat.parse(dateF);
			for (ExamEvent d : event) {
				if (d.getExamDate().after(dateDebut) && d.getExamDate().before(dateFin)) {
					date.add(d);
				}
			}
		}catch (java.text.ParseException e) {
			System.out.println("Erreur dans le parsage de dates");
			e.printStackTrace();
		}
		return date;
	}

}
