package com.rishi.onlinestore.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class ProductAttributes implements Serializable {

    @Id
    @GeneratedValue
    private Long attribute_id;
    private String attribute_name;
    private String attribute_value;
    private Set<Product> prodcuts = new HashSet<Product>(0);
   

    public ProductAttributes() {
    }


    /**
     * @return the attribute_id
     */
    public Long getAttribute_id() {
        return attribute_id;
    }

    /**
     * @param attribute_id the attribute_id to set
     */
    public void setAttribute_id(Long attribute_id) {
        this.attribute_id = attribute_id;
    }

    /**
     * @return the attribute_name
     */
    public String getAttribute_name() {
        return attribute_name;
    }

    /**
     * @param attribute_name the attribute_name to set
     */
    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    /**
     * @return the attribute_value
     */
    public String getAttribute_value() {
        return attribute_value;
    }

    /**
     * @param attribute_value the attribute_value to set
     */
    public void setAttribute_value(String attribute_value) {
        this.attribute_value = attribute_value;
    }

    /**
     * @return the prodcuts
     */
    public Set<Product> getProdcuts() {
        return prodcuts;
    }

    /**
     * @param prodcuts the prodcuts to set
     */
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "attributes")
    public void setProdcuts(Set<Product> prodcuts) {
        this.prodcuts = prodcuts;
    }

}
