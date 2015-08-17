package se.marten.orion.be.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import se.marten.orion.be.pojo.ShoppingList;
import se.marten.orion.be.service.ShoppingListService;



	@RestController
	@RequestMapping("/orionbe/shoppinglist/")
	public class ShoppingListController {
	 
	 ShoppingListService slService = new ShoppingListService();
	           
	 @RequestMapping(value = "/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	 public List<ShoppingList> getShoppingListForUser(@PathVariable int id) {
		 List<ShoppingList> list = slService.getListByUserId(id);
		 return list;
	 }
	 
//	 @RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
//	 public List<User> getAllUsers() {
//	  List<User> users=userService.getAllUsers();
//	  return users;
//	 } 
//	}
}
