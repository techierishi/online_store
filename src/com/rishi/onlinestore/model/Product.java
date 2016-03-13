package com.rishi.onlinestore.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private Long product_id;
    private String product_name;
    private Double product_price;
    private String product_qty;
    private String product_image;
    
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "CATEGORY",catalog = "online_store", joinColumns = { 
			@JoinColumn(name = "product_id", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "category_id", 
					nullable = false, updatable = false) })
    private Set<Category> categories = new HashSet<Category>(0);
    
    @OneToMany
    @JoinTable(name = "PRODUCT_ATTRIBUTES", joinColumns = {@JoinColumn(name="product_id")},
               inverseJoinColumns = {@JoinColumn(name="attribute_id")} )
    private List<ProductAttributes> attributes;
    
   

    public Product() {
    }

    /**
     * @return the product_id
     */
    public Long getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the category_id
     */
    
   

    /**
     * @return the product_name
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * @param product_name the product_name to set
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    /**
     * @return the product_price
     */
    public Double getProduct_price() {
        return product_price;
    }

    /**
     * @param product_price the product_price to set
     */
    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    /**
     * @return the categories
     */
   
    public Set<Category> getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
    

    /**
     * @return the product_image
     */
    public String getProduct_image() {
        return product_image;
    }

    /**
     * @param product_image the product_image to set
     */
    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(String product_qty) {
        this.product_qty = product_qty;
    }

    public List<ProductAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ProductAttributes> attributes) {
        this.attributes = attributes;
    }


    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", product_price=" + product_price + ", product_image=" + product_image + ", categories=" + categories + '}';
    }

}
