package com.niit.Backend.DAOIMPL;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Backend.DAO.ProductDAO;
import com.niit.Backend.model.Product;
import com.niit.Backend.model.User;

@Repository("productDAO")
@Transactional
public class ProductDAOIMPL implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean insert(Product product) {
		try {
			sessionFactory.getCurrentSession().persist(product);
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean delete(Product product) {
		try {
			product.setActive(false);
			sessionFactory.getCurrentSession().update(product);
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public Product getProduct(int id) 
	{
		return sessionFactory.getCurrentSession().get(Product.class,id );
	}

	@Override
	public List<Product> productList() 
	{
		return sessionFactory
				.getCurrentSession()
				.createQuery("FROM Product" , Product.class)
				.getResultList();
	}


	@Override
	public List<Product> listActiveProducts() 
	{
		String selectActiveCategory = "FROM Product WHERE active = :active";
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);		
		query.setParameter("active", true);			
		return query.getResultList();
	}

	@Override
	public List<Product> listActiveProductsByCategory(int categoryId) 
	{
		String selectActiveProductsByCategory = "FROM Product WHERE active = :active AND categoryId = :categoryId";
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveProductsByCategory);
		query.setParameter("active", true);
		query.setParameter("categoryId",categoryId);
		
		return query.getResultList();
		
	}
	
	
}
