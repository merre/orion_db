package se.marten.orion.be.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import se.marten.orion.be.db.DbUtil;
import se.marten.orion.be.pojo.ShoppingList;

	public class ShoppingListService {
	 
	 private Connection connection;

	 public ShoppingListService() {
	  connection = DbUtil.getConnection();
	 }
	  	 
	 public List<ShoppingList> getListByUserId(int userId) {
	  List<ShoppingList> lists = new ArrayList<ShoppingList>();
	  try {
	   PreparedStatement preparedStatement = connection.
	     prepareStatement("select * from shoppinglist where owner=?");
	   preparedStatement.setInt(2, userId);
	   ResultSet rs = preparedStatement.executeQuery();
	   
	   while(rs.next()) {
	    lists.add(new ShoppingList(rs.getInt("id"),
	    rs.getInt("status"),
	    rs.getString("owner"),
	    rs.getString("name")));
	   }
	  } catch (SQLException e) {
	   e.printStackTrace();
	  }
	  return lists;
	 }
}
