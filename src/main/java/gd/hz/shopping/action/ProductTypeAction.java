package gd.hz.shopping.action;

import javax.annotation.Resource;

import gd.hz.shopping.model.ProductType;
import gd.hz.shopping.service.ProductTypeMnager;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component("productTypeAction")
@Scope("prototype")
public class ProductTypeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private ProductTypeMnager productTypeMnager = null;
	private ProductType productType = null;

	@Resource(name = "productTypeMnager")
	public void setProductTypeMnager(ProductTypeMnager productTypeMnager) {
		this.productTypeMnager = productTypeMnager;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public String test() {
		productType = productTypeMnager.findProductType(1);
		return "test";
	}
	
	@Override
	public String execute() throws Exception {
		productType = productTypeMnager.findProductType(1);
		return "test";
	}
}
