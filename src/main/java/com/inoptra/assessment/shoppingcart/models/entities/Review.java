package com.inoptra.assessment.shoppingcart.models.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.inoptra.assessment.shoppingcart.models.Constants;

import lombok.Data;

@Data
@Entity
@Table(name = "review")
@IdClass(ReviewFK.class)
public class Review implements Serializable {
	@Id
	private long productId;

	@Id
	private long reviewId;
	
	private String author;
	
	private String subject;
	
	private String content;
}
