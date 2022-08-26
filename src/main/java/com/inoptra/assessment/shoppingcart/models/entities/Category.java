package com.inoptra.assessment.shoppingcart.models.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Category {
    @JsonProperty("MOBILE_AND_ACCESSORIES")
    MOBILE_AND_ACCESSORIES("MOBILE_AND_ACCESSORIES"),

    @JsonProperty("COMPUTERS_LAPTOPS_AND_ACCESSORIES")
    COMPUTERS_LAPTOPS_AND_ACCESSORIES("COMPUTERS_LAPTOPS_AND_ACCESSORIES"),
    
    @JsonProperty("ELECTRONICS")
    ELECTRONICS("ELECTRONICS"),

    @JsonProperty("HEALTH_BEAUTY_GROOMING")
    HEALTH_BEAUTY_GROOMING("HEALTH_BEAUTY_GROOMING"),
    
    @JsonProperty("MEN_FASHION")
    MEN_FASHION("MEN_FASHION"),
    
    @JsonProperty("WOMEN_FASHION")
    WOMEN_FASHION("WOMEN_FASHION"),

    @JsonProperty("BOOKS")
    BOOKS("BOOKS"),

    @JsonProperty("HOME_KITCHEN")
    HOME_KITCHEN("HOME_KITCHEN"),

    @JsonProperty("GROCERY")
    GROCERY("GROCERY"),

    @JsonProperty("SPORTS_AND_FITNESS")
    SPORTS_AND_FITNESS("SPORTS_AND_FITNESS");
	
	
	private final String category;
	
	
	private Category(String category) {
		this.category = category;
	}
	
	
	public final String getCategory() {
		return this.category;
	}
	
}
