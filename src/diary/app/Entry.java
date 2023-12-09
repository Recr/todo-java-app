package diary.app;

import java.util.Calendar;

public class Entry {
	
	private String name;
	private Calendar creationDate ;
	private Calendar dueDate;
	
	public Entry(){
		creationDate = Calendar.getInstance();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	
}
