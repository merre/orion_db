package se.marten.orionbe.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import se.marten.orionbe.db.DbUtil;
import se.marten.orionbe.pojo.ShoppingList;

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
	   preparedStatement.setInt(1, userId);
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
