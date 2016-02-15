package com.rishi.onlinestore.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SALES")
public class Sales implements Serializable {

    @Id
    @GeneratedValue
    private Long sales_id;
   

    public Sales() {
    }

    /**
     * @return the sales_id
     */
    public Long getSales_id() {
        return sales_id;
    }

    /**
     * @param sales_id the sales_id to set
     */
    public void setSales_id(Long sales_id) {
        this.sales_id = sales_id;
    }

   
    
    

}
