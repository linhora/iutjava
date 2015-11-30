package edu.iut.app;

import java.util.ArrayList;

public class CriteriaPerson implements ICriteria{

	@Override
	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> event) {
		ArrayList<ExamEvent> person = new ArrayList<ExamEvent>();
		for(ExamEvent p : event){
			if(p.getStudent().getFunction().equals("Student")){
				person.add(p);
			}
		}
		return person;
	}

}
