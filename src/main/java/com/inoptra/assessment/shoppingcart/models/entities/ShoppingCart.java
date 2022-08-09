package com.inoptra.assessment.shoppingcart.models.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.inoptra.assessment.shoppingcart.models.Constants;

import lombok.Data;

@Data
@Entity
@Table(name = "shopping_cart")
public class ShoppingCart implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shopping_cart_id")
	private Long id;
	
	//	@JsonManagedReference
	//@JoinColumn(name = "shopping_cart_id", referencedColumnName = "shopping_cart_id")
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable( name = "SHOPPING_CART_PRODUCT_ITEM",
							joinColumns = { @JoinColumn (name = "shopping_cart_id", referencedColumnName = "shopping_cart_id")},
							inverseJoinColumns = { @JoinColumn(name = "product_item_id", referencedColumnName = "product_item_id") }
						)
	private List<ProductItem> productItems;
	
	@Embedded
	@AttributeOverrides( {
				@AttributeOverride(name = "grossTotalAmount", column = @Column(name = "gross_total_amount")),
				@AttributeOverride(name = "totalDiscountsAmount", column = @Column(name = "total_discount_amount")),
				@AttributeOverride(name = "netPayableAmount", column = @Column(name = "net_payable_amount"))
	})
	private CartTotal cartTotal;

    @Column(name = "createdBy", nullable = true)
    private String createdBy;

    @Column(name = "createdDate", columnDefinition = "DATE", nullable = true)
    private LocalDate createdDate;

    @Column(name = "modifiedBy", nullable = true)
    private String modifiedBy;

    @Column(name = "modifiedDate", columnDefinition = "DATE", nullable = true)
    private LocalDate modifiedDate;
    
}
