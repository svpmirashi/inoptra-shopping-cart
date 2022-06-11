package com.inoptra.assessment.shoppingcartmicroservice.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "ProductItem")
public class ProductItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @Column(name = "brand")
    private String brand;

    @Column(name = "color")
    private String color;

    @Column(name = "base_price")
    private double basePrice;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "mfg_date", columnDefinition = "DATE", nullable = false)
    private LocalDate mfgDate;

    @Column(name = "expiry_date", columnDefinition = "DATE", nullable = false)
    private LocalDate expiryDate;

    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @Column(name = "created_date", columnDefinition = "DATE", nullable = false)
    private LocalDate createdDate;

    @Column(name = "modified_by", nullable = false)
    private String modifiedBy;

    @Column(name = "modified_date", columnDefinition = "DATE", nullable = false)
    private LocalDate modifiedDate;

}
