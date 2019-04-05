package com.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.service.model.ChefBean;
import jdbcConnection.ConnectionJdbc;
import jdbcConnection.JDBCHelper;
import jdbcConnection.SQLUtility;

public class ChefDAO {

	Connection con = null;
	ChefBean chef;
	PreparedStatement pstmt = null;

	public List<ChefBean> listChef() throws SQLException {

		String selectQuery = JDBCHelper.selectChef;
		List<ChefBean> list = new ArrayList<ChefBean>();
		try {

			con = ConnectionJdbc.getConnection();
			pstmt = SQLUtility.getPreparedStatement(selectQuery, con);
			ResultSet res = SQLUtility.executePreparedQuery(pstmt, con);
			System.out.println(res);
			while (res.next()) {

				chef = new ChefBean();
				chef.setChefId(res.getInt(1));
				chef.setRestaurantId(res.getInt(2));
				chef.setChefName(res.getString(3));
				chef.setChefGender(res.getString(4));
				chef.setChefMobile(res.getString(5));

				list.add(chef);
				System.out.println(list.toString());
			}
		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			ConnectionJdbc.closeConnection(con);
		}
		return list;
	}

	public ChefBean selectChef(int id) throws SQLException {

		try {

			con = ConnectionJdbc.getConnection();
			String selectQuery = JDBCHelper.selectChefById;
			pstmt = SQLUtility.getPreparedStatement(selectQuery, con);
			ResultSet res = SQLUtility.executePreparedQuery(pstmt, con);
			while (res.next()) {
				chef = new ChefBean();
				chef.setChefId(res.getInt(1));
				chef.setRestaurantId(res.getInt(2));
				chef.setChefName(res.getString(3));
				chef.setChefGender(res.getString(4));
				chef.setChefMobile(res.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			ConnectionJdbc.closeConnection(con);
		}
		return chef;
	}

	public ChefBean insertChef(ChefBean chefBean) throws SQLException {

		try {
			con = ConnectionJdbc.getConnection();

			String insertQuery = JDBCHelper.insertChef;

			System.out.println(insertQuery);

			pstmt = SQLUtility.getPreparedStatement(insertQuery, con);
			pstmt.setInt(1, chefBean.getRestaurantId());
			pstmt.setString(2, chefBean.getChefName());
			pstmt.setString(3, chefBean.getChefGender());
			pstmt.setString(4, chefBean.getChefMobile());

			@SuppressWarnings("unused")
			int count = SQLUtility.executeUpdatePreparedQuery(pstmt, con);
		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			ConnectionJdbc.closeConnection(con);
		}
		return chefBean;
	}

	public ChefBean deleteChef(int id) throws SQLException {

		try {
			con = ConnectionJdbc.getConnection();
			chef = new ChefBean();
			String deleteQuery = JDBCHelper.deleteChefById;
			pstmt = SQLUtility.getPreparedStatement(deleteQuery, con);
			
			@SuppressWarnings("unused")
			int count = SQLUtility.executeUpdatePreparedQuery(pstmt, con);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			ConnectionJdbc.closeConnection(con);
		}
		return chef;
	}
}