package net.rwt.Ecommerce.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.rwt.Ecommerce.dao.CategoryDAO;
import net.rwt.Ecommerce.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();  
	
	static
	{
		Category category=new Category();
		
		//Adding first category
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television !");
		category.setImageURL("");
		categories.add(category);
		
		//Adding second category
		
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile !");
		category.setImageURL("");
		categories.add(category);
		
		//Adding third category
		
				category=new Category();
				category.setId(3);
				category.setName("Laptop");
				category.setDescription("This is some description for Laptop !");
				category.setImageURL("");
				categories.add(category);
				
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhance for loop
		for(Category category: categories)
		{
			if(category.getId()==id)
				return category;
			
		}
		return null;
	}

}
