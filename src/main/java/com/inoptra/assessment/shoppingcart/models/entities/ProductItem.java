package com.inoptra.assessment.shoppingcart.models.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.inoptra.assessment.shoppingcart.models.Constants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* ProductItem entity / model class
**/

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_item")
public class ProductItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_item_id")
    private long id;

    @Column(name = "name")
    private String name;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_item_id", referencedColumnName = "product_item_id")
    //@MapsId
    private ProductMeta productMeta;
	/*
	 * @Column(name = "title") private String title;
	 * 
	 * @Column(name = "brand") private String brand;
	 * 
	 * @Column(name = "color") private String color;
	 * 
	 * @Column(name = "basePrice") private double basePrice;
	 */

    //@JsonManagedReference
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "vendor_id", nullable = true)
    private Vendor vendor;

//    @JsonBackReference
//    @ManyToOne(cascade = CascadeType.MERGE)
//    @JoinColumn(name = "shopping_cart_id", nullable = true)
//    private ShoppingCart shoppingCart;
    
	/*
	 * @Column(name = "mfgDate", columnDefinition = "DATE", nullable = true) private
	 * LocalDate mfgDate;
	 * 
	 * @Column(name = "expiryDate", columnDefinition = "DATE", nullable = true)
	 * private LocalDate expiryDate;
	 */

    @Column(name = "createdBy", nullable = true)
    private String createdBy;

    @Column(name = "createdDate", columnDefinition = "DATE", nullable = true)
    private LocalDate createdDate;

    @Column(name = "modifiedBy", nullable = true)
    private String modifiedBy;

    @Column(name = "modifiedDate", columnDefinition = "DATE", nullable = true)
    private LocalDate modifiedDate;
    
}
