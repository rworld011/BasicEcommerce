package net.rwt.Ecommerce.dao;

import java.util.List;

import net.rwt.Ecommerce.dto.Category;

public interface CategoryDAO {

	
	List <Category> list();
		Category get(int id);
	
}
