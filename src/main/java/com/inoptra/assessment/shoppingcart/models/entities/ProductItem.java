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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* ProductItem entity / model class
**/

@Builder
@Getter 
@Setter
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
    private ProductMeta productMeta;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "vendor_id", nullable = true)
    private Vendor vendor;

    @Column(name = "createdBy", nullable = true)
    private String createdBy;

    @Column(name = "createdDate", columnDefinition = "DATE", nullable = true)
    private LocalDate createdDate;

    @Column(name = "modifiedBy", nullable = true)
    private String modifiedBy;

    @Column(name = "modifiedDate", columnDefinition = "DATE", nullable = true)
    private LocalDate modifiedDate;

    
}
