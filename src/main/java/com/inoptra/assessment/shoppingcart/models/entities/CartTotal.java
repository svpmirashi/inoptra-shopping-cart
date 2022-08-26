package com.inoptra.assessment.shoppingcart.models.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CartTotal implements Serializable {

	private double grossTotalAmount;
	
	private double totalDiscountAmount;
	
	private double netPayableAmount;
	
}
