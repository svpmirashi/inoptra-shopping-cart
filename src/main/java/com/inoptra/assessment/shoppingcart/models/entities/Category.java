package com.inoptra.assessment.shoppingcart.models.entities;

public enum Category {
    
    MOBILE_AND_ACCESSORIES("MOBILE_AND_ACCESSORIES"),

    COMPUTERS_LAPTOPS_AND_ACCESSORIES("COMPUTERS_LAPTOPS_AND_ACCESSORIES"),

    ELECTRONICS("ELECTRONICS"),

    HEALTH_BEAUTY_GROOMING("HEALTH_BEAUTY_GROOMING"),
    MEN_FASHION("MEN_FASHION"),
    WOMEN_FASHION("WOMEN_FASHION"),

    BOOKS("BOOKS"),

    HOME_KITCHEN("HOME_KITCHEN"),

    GROCERY("GROCERY"),

    SPORTS_FITNESS("SPORTS_FITNESS");
	
	
	private final String category;
	
	
	private Category(String category) {
		this.category = category;
	}
	
	
	public final String getCategory() {
		return this.category;
	}
	
}
