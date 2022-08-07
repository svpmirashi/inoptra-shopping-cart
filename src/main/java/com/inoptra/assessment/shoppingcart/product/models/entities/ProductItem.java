package com.inoptra.assessment.shoppingcart.product.models.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Table(name = "Product_Item")
public class ProductItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_item_id")
    private long pid;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @Column(name = "brand")
    private String brand;

    @Column(name = "color")
    private String color;

    @Column(name = "basePrice")
    private double basePrice;

    //@JsonManagedReference
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "vendor_id", nullable = false)
    private Vendor vendor;

    @Column(name = "mfgDate", columnDefinition = "DATE", nullable = true)
    private LocalDate mfgDate;

    @Column(name = "expiryDate", columnDefinition = "DATE", nullable = true)
    private LocalDate expiryDate;

    @Column(name = "createdBy", nullable = true)
    private String createdBy;

    @Column(name = "createdDate", columnDefinition = "DATE", nullable = true)
    private LocalDate createdDate;

    @Column(name = "modifiedBy", nullable = true)
    private String modifiedBy;

    @Column(name = "modifiedDate", columnDefinition = "DATE", nullable = true)
    private LocalDate modifiedDate;
    
}
