package com.service.model;


public class ChefBean {
	
	 int chefId;
	 int restaurantId;
	 String chefName;
	 String chefMobile;
	 String chefGender;
	
	public ChefBean() {
		super();
	}

	public ChefBean(int chefId, int restaurantId, String chefName, String  chefMobile, String chefGender) {
		super();
		this.chefId = chefId;
		this.restaurantId = restaurantId;
		this.chefName = chefName;
		this.chefMobile = chefMobile;
		this.chefGender = chefGender;
	}

	public int getChefId() {
		return chefId;
	}
	public void setChefId(int chefId) {
		this.chefId = chefId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getChefName() {
		return chefName;
	}
	public void setChefName(String chefName) {
		this.chefName = chefName;
	}
	public String  getChefMobile() {
		return chefMobile;
	}
	public void setChefMobile(String chefMobile) {
		this.chefMobile = chefMobile;
	}
	public String getChefGender() {
		return chefGender;
	}
	public void setChefGender(String chefGender) {
		this.chefGender = chefGender;
	}

	@Override
	public String toString() {
		return "ChefBean [chefId=" + chefId + ", restaurantId=" + restaurantId + ", chefName=" + chefName
				+ ", chefMobile=" + chefMobile + ", chefGender=" + chefGender + "]";
	}
}