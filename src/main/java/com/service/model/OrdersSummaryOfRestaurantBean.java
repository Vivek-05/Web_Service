package com.service.model;

public class OrdersSummaryOfRestaurantBean {

	//String orderId;
	String userName;
	String menuItemName;
	int quantity;
	String chefName;
	String time;
	String orderStatus;
	
	public OrdersSummaryOfRestaurantBean(String userName, String menuItemName, int quantity, String chefName,
			String time, String orderStatus) {
		super();
		this.userName = userName;
		this.menuItemName = menuItemName;
		this.quantity = quantity;
		this.chefName = chefName;
		this.time = time;
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the orderId
	 */
	/*public String getOrderId() {
		return orderId;
	}

	*//**
	 * @param orderId the orderId to set
	 *//*
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}*/

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the menuItemName
	 */
	public String getMenuItemName() {
		return menuItemName;
	}

	/**
	 * @param menuItemName the menuItemName to set
	 */
	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the chefName
	 */
	public String getChefName() {
		return chefName;
	}

	/**
	 * @param chefName the chefName to set
	 */
	public void setChefName(String chefName) {
		this.chefName = chefName;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
