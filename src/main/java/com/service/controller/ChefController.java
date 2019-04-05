package com.service.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.service.dao.ChefDAO;
import com.service.model.ChefBean;

@Path("/chef")
public class ChefController {

	ChefBean chef = new ChefBean();
	ChefDAO chefdao = new ChefDAO();

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ChefBean> cheflist()
			throws SQLException, ClassNotFoundException, JsonGenerationException, JsonMappingException, IOException {

		List<ChefBean> getList = chefdao.listChef();

		return getList;
	}

	@GET
	@Path("/selectchefbyid/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ChefBean getChefData(@PathParam("id") int id) throws SQLException {

		return chefdao.selectChef(id);
	}

	@POST
	@Path("/addchef")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ChefBean addChef(ChefBean chefBean) throws SQLException {
		System.out.println("Chef Inserted...");

		return chefdao.insertChef(chefBean);

	}

	@DELETE
	@Path("/deletechef/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ChefBean removeChef(@PathParam("id") int id) throws SQLException {
		return chefdao.deleteChef(id);

	}
}