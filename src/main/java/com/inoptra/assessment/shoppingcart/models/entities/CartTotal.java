package com.inoptra.assessment.shoppingcart.models.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class CartTotal implements Serializable {

	private double grossTotalAmount;
	
	private double totalDiscountAmount;
	
	private double netPayableAmount;
}
