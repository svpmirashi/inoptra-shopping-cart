package com.inoptra.assessment.shoppingcart.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.inoptra.assessment.shoppingcart.models.Constants;

import lombok.Data;

@Data
@Entity
@Table(name = "recommendation")
public class Recommendation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "recommendation_id")
	private long id;
	
	@Version
	private int version;
	
	private Long productId;
	private String author;
	private int rate;
	private String content;
}
