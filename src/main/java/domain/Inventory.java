package domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	public List<Entity.Guitar> search(Entity.GuitarSpec searchSpec,List<Entity.Guitar> guitars) { 
		List<Entity.Guitar> matchingGuitars = new LinkedList<Entity.Guitar>(); 
		for (Iterator<Entity.Guitar> i = guitars.iterator(); i.hasNext(); ) { 
			Entity.Guitar guitar = i.next();
			if(guitar.getSpec().matches(searchSpec)){
				matchingGuitars.add(guitar);
			}
			 
		} 
		return matchingGuitars; 
	}
}
