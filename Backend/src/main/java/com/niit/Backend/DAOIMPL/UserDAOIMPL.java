package com.niit.Backend.DAOIMPL;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Backend.DAO.UserDAO;
import com.niit.Backend.model.Category;
import com.niit.Backend.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOIMPL implements UserDAO 
{
	@Autowired
	SessionFactory sessionFactory; 

	@Override
	public boolean insert(User user) 
	{
		try
		{
			sessionFactory.getCurrentSession().persist(user);
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	@Override
	public User getUserByEmail(String email) 
	{
		String selectActiveUser = "FROM User WHERE enabled = :enabled and email = :email";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveUser);
				
		query.setParameter("enabled", true);
		query.setParameter("email", email);
						
		return (User) query.getSingleResult();
	}
	
	
	public User getUser(int id) 
	{
		return sessionFactory.getCurrentSession().get(User.class,id );
	}

}
