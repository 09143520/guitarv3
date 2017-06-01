package guitar.dao;

import java.util.List;

import Entity.Guitar;

public interface InventoryDao {
	List<Guitar> Search(Guitar searchGuitar);	
	boolean add(Guitar guitar);
	boolean del(String serialNumber);

}
