package de.agilercm.hobbit;

import java.util.ArrayList;

public class Storage {


	ArrayList<DataEntry> data = new ArrayList<DataEntry>();
	
	public Storage() {
	}
	
	public void addData(DataEntry data) throws HobbitException {
		
		if (this.data.contains(data)){
			throw new HobbitException("Den Datensatz gibts schon ... " + data.name);
		}
		
		this.data.add(data);
		
	}
	

}
