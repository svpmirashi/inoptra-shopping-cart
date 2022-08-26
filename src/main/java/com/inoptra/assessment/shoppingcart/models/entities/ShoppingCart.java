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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shopping_cart")
public class ShoppingCart implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shopping_cart_id")
	private Long id;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(  
							name = "SHOPPING_CART_PRODUCT_ITEM",
							indexes = {},
							joinColumns = { @JoinColumn (name = "shopping_cart_fk", referencedColumnName = "shopping_cart_id", unique = false, nullable = true, insertable = true, updatable = true)},
							inverseJoinColumns = { @JoinColumn(name = "product_item_fk", referencedColumnName = "product_item_id") },
							uniqueConstraints = {@UniqueConstraint(columnNames = {"shopping_cart_fk", "product_item_fk"})}
						)
	private List<ProductItem> productItems;
	
	@Embedded
	@AttributeOverrides( {
				@AttributeOverride(name = "grossTotalAmount", column = @Column(name = "gross_total_amount", columnDefinition = "double default 0.0")),
				@AttributeOverride(name = "totalDiscountsAmount", column = @Column(name = "total_discount_amount", columnDefinition = "double default 0.0")),
				@AttributeOverride(name = "netPayableAmount", column = @Column(name = "net_payable_amount", columnDefinition = "double default 0.0"))
	})
	private CartTotal cartTotal;

    @Column(name = "createdBy", nullable = true)
    private String createdBy;

    @Column(name = "createdDate", columnDefinition = "DATE", nullable = true)
    @Temporal(TemporalType.DATE)
    private LocalDate createdDate;

    @Column(name = "modifiedBy", nullable = true)
    private String modifiedBy;

    @Column(name = "modifiedDate", columnDefinition = "DATE", nullable = true)
    private LocalDate modifiedDate;

}
