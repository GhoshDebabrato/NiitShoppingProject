package com.niit.Backend.DAOIMPL;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Backend.DAO.CategoryDAO;
import com.niit.Backend.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOIMPL implements CategoryDAO 
{
	@Autowired
	//spring will internally search for getSessionFactory()
	SessionFactory sessionFactory;

	@Override
	public boolean insert(Category category) 
	{
		try
		{
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public List<Category> listCategory() 
	{
		String selectActiveCategory = "FROM Category WHERE isactive = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
				
		query.setParameter("active", true);
						
		return query.getResultList();
	}
	
	public Category getCategory(int id) 
	{
		return sessionFactory.getCurrentSession().get(Category.class,id );
	}

}
