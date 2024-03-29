package main.java.se.marten.orionbe.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.se.marten.orionbe.db.DbUtil;
import main.java.se.marten.orionbe.pojo.ShoppingList;


public class ShoppingListService {

	private Connection connection;

	public ShoppingListService() {
		connection = DbUtil.getConnection();
	}

	public List<ShoppingList> getListByUserId(int userId, int listId) {
		List<ShoppingList> lists = new ArrayList<ShoppingList>();
		try {
			PreparedStatement preparedStatement = null;
			StringBuilder sb = new StringBuilder();
			sb.append("select * from shoppinglist where owner=?");
			if (listId > 0) {
				sb.append(" and id=?");
				preparedStatement = connection.prepareStatement(sb.toString());
				preparedStatement.setInt(1, userId);
				preparedStatement.setInt(2, listId);
			}
			else{
				preparedStatement = connection.prepareStatement(sb.toString());
				preparedStatement.setInt(1, userId);
			}
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				lists.add(new ShoppingList(rs.getInt("id"),
						rs.getInt("status"), rs.getString("owner"), rs
								.getString("name")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lists;
	}
}
