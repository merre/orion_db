package main.java.se.marten.orionbe.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.java.se.marten.orionbe.pojo.ShoppingList;
import main.java.se.marten.orionbe.service.ShoppingListService;

	@RestController
	@RequestMapping("/shoppinglist")
	public class ShoppingListController {
	 
	 ShoppingListService slService = new ShoppingListService();
	           
	 @RequestMapping(value = "/{userid}", method = RequestMethod.GET,headers="Accept=application/json")
	 public List<ShoppingList> getShoppingsListForUser(@PathVariable int userid) {
		 List<ShoppingList> list = slService.getListByUserId(userid,0);
		 return list;
	 }
	 
	 @RequestMapping(value = "/{userid}/{listid}", method = RequestMethod.GET,headers="Accept=application/json")
	 public List<ShoppingList> getShoppingsListForUser(@PathVariable int userid,@PathVariable int listid) {
		 List<ShoppingList> list = slService.getListByUserId(userid,listid);
		 return list;
	 }
	 
//	 @RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
//	 public List<User> getAllUsers() {
//	  List<User> users=userService.getAllUsers();
//	  return users;
//	 } 
//	}
}
