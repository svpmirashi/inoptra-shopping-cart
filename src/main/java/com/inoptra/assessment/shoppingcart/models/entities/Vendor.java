package com.inoptra.assessment.shoppingcart.models.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description: Vendor entity / model class
 **/

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vendor")
public class Vendor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vendor_id")
	private long id;

	@Column(name = "vendor_name")
	private String vendorName;

	@Column(name = "vendor_address")
	private String vendorAddress;

	@JsonManagedReference
	@OneToMany(mappedBy = "vendor", fetch = FetchType.LAZY)
	private List<ProductItem> availableProductItems;

	@Column(name = "createdBy", nullable = true)
	private String createdBy;

	@Column(name = "createdDate", columnDefinition = "DATE", nullable = true)
	private LocalDate createdDate;

	@Column(name = "modifiedBy", nullable = true)
	private String modifiedBy;

	@Column(name = "modifiedDate", columnDefinition = "DATE", nullable = true)
	private LocalDate modifiedDate;


}
