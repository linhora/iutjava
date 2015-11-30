package edu.iut.app;

import java.util.ArrayList;

public class CriteriaClassroom implements ICriteria{

	@Override
	public ArrayList<ExamEvent> meetCriteria(ArrayList<ExamEvent> event) {
		ArrayList<ExamEvent> classroom = new ArrayList<ExamEvent>();
		for(ExamEvent c : event){
			if(!c.getClassroom().getClassRoomNumber().equals("not affected")){
				classroom.add(c);
			}
		}
		return classroom;
	}

}
