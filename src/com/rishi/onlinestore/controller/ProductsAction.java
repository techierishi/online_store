package com.rishi.onlinestore.controller;

import com.google.gson.Gson;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.rishi.onlinestore.model.Product;
import com.rishi.onlinestore.service.ProductService;
import java.util.List;

public class ProductsAction extends ActionSupport {

 

    private HttpServletRequest request;

    private HttpSession session;

    private ServletContext application;
    
    private List<Product> products;
    private String productJson;

   

    public String showproducts() throws Exception {
        this.request = ServletActionContext.getRequest();
        this.session = this.request.getSession();

        String ret = "";
        
        ProductService productService = new ProductService();

        
        if (true) {
            if(null !=productService.getListOfProducts() && !productService.getListOfProducts().isEmpty()){
            setProducts(productService.getListOfProducts());
            
            Gson gson = new Gson();
            String json = gson.toJson(productService.getListOfProducts());
            
                setProductJson(json);
            }
            ret = SUCCESS;
        } else {
            ret = ERROR;
        }

        return ret;

    }

    /**
     * @return the products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return the productJson
     */
    public String getProductJson() {
        return productJson;
    }

    /**
     * @param productJson the productJson to set
     */
    public void setProductJson(String productJson) {
        this.productJson = productJson;
    }
    
    
    

}
