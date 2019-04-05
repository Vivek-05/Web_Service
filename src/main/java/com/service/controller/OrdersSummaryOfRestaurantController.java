package com.service.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONArray;

import com.service.dao.OrdersOfRestaurantDAO;
import com.service.model.OrdersSummaryOfRestaurantBean;

@Path("/restaurantOrder")
public class OrdersSummaryOfRestaurantController {

	OrdersSummaryOfRestaurantBean restaurantOrders;
	OrdersOfRestaurantDAO restaurantOrderDao = new OrdersOfRestaurantDAO();

	@GET
	@Path("/restaurantOrderSummary/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public HashMap<String,JSONArray> getresturantOrderSummary(@PathParam("id") int id)
			throws SQLException, IOException {
		System.out.println("in controller");
		return restaurantOrderDao.listRestaurantOrders(id);
	}
}