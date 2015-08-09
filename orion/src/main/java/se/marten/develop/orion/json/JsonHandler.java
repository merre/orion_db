package se.marten.develop.orion.json;

import se.marten.develop.orion.db.ShoppingList;
import se.marten.develop.orion.db.manager.EntityTransactionManager;

import com.google.gson.Gson;

public class JsonHandler {

	public static String getShoppingListById(long id){
		EntityTransactionManager em = new EntityTransactionManager();
		ShoppingList sl = (ShoppingList)em.getObjectById(id, "ShoppingList.findById", ShoppingList.class);
		Gson gson = new Gson();
		System.out.println(gson.toJson(sl));
		return gson.toJson(sl);
	}
}
