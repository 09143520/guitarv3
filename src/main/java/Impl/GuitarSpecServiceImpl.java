package Impl;

import Dao.GuitarSpecDao;
import Service.GuitarService;

public abstract class GuitarSpecServiceImpl implements GuitarService{
	private GuitarSpecDao guitarSpecDao;

	public void setGuitarSpecDao(GuitarSpecDao guitarSpecDao) {
		this.guitarSpecDao = guitarSpecDao;
	}
	

}
