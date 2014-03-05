package gd.hz.shopping.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import gd.hz.shopping.dao.ProductTypeDao;
import gd.hz.shopping.model.ProductType;
import gd.hz.shopping.service.ProductTypeMnager;

@Component("productTypeMnager")
public class ProductTypeMnagerImpl implements ProductTypeMnager {

	private ProductTypeDao productTypeDao = null;

	@Resource(name = "productTypeDao")
	public void setProductTypeDao(ProductTypeDao productTypeDao) {
		this.productTypeDao = productTypeDao;
	}

	@Override
	public ProductType findProductType(int id) {
		return productTypeDao.selProductType(id);
	}

}
