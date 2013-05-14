package org.kane.seis601class.repositories;

import java.util.ArrayList;
import org.kane.seis601class.models.Product;
import org.kane.seis601class.models.User;

public class ProductRepository extends BaseRepository{
	//class members
	private ArrayList<Product> productList;
		
	//constructor
	public ProductRepository() {
		this.filename = "Products.txt";
		ArrayList <Product> list = (ArrayList<Product>) this.deserializeObj();
		if(list == null){
			this.productList = new ArrayList<Product>();
		}else{
			this.productList = list;
		}
	}
	
	//add and save methods
	public void addProduct(Product p) {
		this.productList.add(p);
	}
	public void save(){
		this.serialize(this.productList);
	}
	
}
