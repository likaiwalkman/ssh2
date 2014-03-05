package gd.hz.shopping.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import gd.hz.shopping.dao.ProductTypeDao;
import gd.hz.shopping.model.ProductType;

@Component("productTypeDao")
public class ProductTypeDaoImpl implements ProductTypeDao {

	private SessionFactory sessionFactory = null;

	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public ProductType selProductType(int id) {
		Session session = sessionFactory.getCurrentSession();
		ProductType productType = (ProductType) session.get(ProductType.class,
				id);
		return productType;
	}
}
