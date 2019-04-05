package com.service.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.service.model.OrdersSummaryOfRestaurantBean;

import jdbcConnection.ConnectionJdbc;
import jdbcConnection.JDBCHelper;
import jdbcConnection.SQLUtility;

public class OrdersOfRestaurantDAO {

	Connection con = null;
	OrdersSummaryOfRestaurantBean restaurantOrders;
	ResultSet res = null;
	PreparedStatement pstmt = null;

	@SuppressWarnings({ "unchecked"})
	public HashMap<String,JSONArray> listRestaurantOrders(int id)
			throws SQLException, JsonParseException, JsonMappingException, IOException{

		String selectQuery = JDBCHelper.selectOrderDetailsOfSpecificRestaurant;
		JSONArray ja = new JSONArray();
		JSONObject json = new JSONObject();
		//List<OrdersSummaryOfRestaurantBean> list = new ArrayList<OrdersSummaryOfRestaurantBean>();
		HashMap<String, JSONArray> menulist  = new HashMap<String, JSONArray>();
		
		try { 
			
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
			
			con = ConnectionJdbc.getConnection();

			pstmt = SQLUtility.getPreparedStatement(selectQuery, con);
			pstmt.setInt(1, id);
			pstmt.setInt(2, id);
			res = SQLUtility.executePreparedQuery(pstmt, con);
		   
			while (res.next()) {
				
				json = new JSONObject();
				
				String str =  res.getString(1);
				
				//json.put("User Name", res.getString(2));
				boolean str1 = ja.add(res.getString(2));
				json.put("User Name", str1);
			    json.put("Menu Items", res.getString(3));
			    json.put("Quantity", res.getInt(4));
			    //json.put("Chef Name", res.getString(5));
			    ja.add(res.getString(5));
			   // json.put("Time", res.getString(6));
			    ja.add(res.getString(6));
			   // json.put("Order Status", res.getString(7));
			    ja.add(res.getString(7));
			    
			    ja.add(json);
				/*restaurantOrders = new OrdersSummaryOfRestaurantBean();
				restaurantOrders.setOrderId(res.getString(1));
				restaurantOrders.setUserName(res.getString(2));
				restaurantOrders.setMenuItemName(res.getString(3));
				restaurantOrders.setQuantity(res.getInt(4));
				restaurantOrders.setChefName(res.getString(5));
				restaurantOrders.setTime(res.getString(6));
				restaurantOrders.setOrderStatus(res.getString(7));*/
			    
			    //list.add(new OrdersSummaryOfRestaurantBean(res.getString(2),res.getString(3),res.getInt(4),res.getString(5),res.getString(6),res.getString(7)));
			    
			    menulist.put(str, ja);
			}		
		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			ConnectionJdbc.closeConnection(con);
		}
		return menulist;
	}
}