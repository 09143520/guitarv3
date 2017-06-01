package Dao;

import java.util.List;

import Entity.Guitar;


public interface GuitarDao {
	
	List<Guitar> findAll();
	
	void add(Guitar guitar);

	void update(Guitar guitar);
	
	void delete (String id);
	
	int count ();

	void save(Entity.Guitar entity);
	
}
