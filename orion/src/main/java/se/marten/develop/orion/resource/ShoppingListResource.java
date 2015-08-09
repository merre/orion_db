package se.marten.develop.orion.resource;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import se.marten.develop.orion.db.ShoppingList;
import se.marten.develop.orion.db.manager.EntityTransactionManager;

@Path("/shoppinglist")
@Produces("application/json")
public class ShoppingListResource extends ResourceBase<ShoppingList>{

	@Override
	protected List<ShoppingList> getQuery() throws SQLException,
			NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ShoppingList getSingleQuery(int id) throws NamingException {
		EntityTransactionManager em = new EntityTransactionManager();
		ShoppingList sl = (ShoppingList)em.getObjectById(id, "ShoppingList.findById", ShoppingList.class);
		return sl;
	}

	@Override
	protected void createQuery(ShoppingList t) throws SQLException,
			NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void deleteQuery(int id) throws SQLException, NamingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateQuery(ShoppingList t, int id) throws SQLException,
			NamingException {
		// TODO Auto-generated method stub
		
	}

}
