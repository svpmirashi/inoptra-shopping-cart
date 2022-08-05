package com.inoptra.assessment.shoppingcart.product.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Product_Item")
public class ProductItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    @ManyToOne
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

	/*
	 * @Override public String toString() { StringBuilder builder = new
	 * StringBuilder(); builder.append("ProductItem [id=").append(id)
	 * .append(", name=").append(name) .append(", title=").append(title)
	 * .append(", brand=").append(brand) .append(", color=").append(color)
	 * .append(", basePrice=").append(basePrice)
	 * .append(", vendorName=").append(vendorName)
	 * .append(", mfgDate=").append(mfgDate)
	 * .append(", expiryDate=").append(expiryDate)
	 * .append(", createdBy=").append(createdBy)
	 * .append(", createdDate=").append(createdDate)
	 * .append(", modifiedBy=").append(modifiedBy)
	 * .append(", modifiedDate=").append(modifiedDate) .append("]"); return
	 * builder.toString(); }
	 */



}
