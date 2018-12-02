package com.sarita.shoppingbackend1.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sarita.shoppingbackend1.dao.CategoryDAO;
import com.sarita.shoppingbackend1.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> Categories=new ArrayList<>();
	static {

	Category category=new Category();
	category.setId(1);
	category.setName("Television");
	category.setDescription("this is description of television");
	category.setImageURL("CAT_1.png");
	
	Categories.add(category);
	
	category=new Category();
	category.setId(2);
	category.setName("Computer");
	category.setDescription("this is description of Computer");
	category.setImageURL("CAT_2.png");
	
	Categories.add(category);
	
	
	category=new Category();
	category.setId(3);
	category.setName("Mobile");
	category.setDescription("this is description of Mobile");
	category.setImageURL("CAT_3.png");
	
	Categories.add(category);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return Categories;
	}

}
