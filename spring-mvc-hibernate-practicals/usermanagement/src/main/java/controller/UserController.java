package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.User;
import service.UserService;

@Controller
public class UserController {

	private UserService userService;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("listUsers", this.userService.getAllUser());
		return "user";
	}
	
	
	@RequestMapping(value = "/user/add",method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User u) {
		if(u.getId()==0) {
			this.userService.addUser(u);
		}
		else {
			this.userService.updateUser(u);
		}
		return "redirect:/users";
	}
	
	@RequestMapping("/remove/{id}")
	public String removeUser(@PathVariable("id") int id, Model model) {
		this.userService.delete(id);
		return "redirect:/users";
	}
	
	@RequestMapping("/edit/{id}")
	public String editUser(@PathVariable("id") int id, Model model) {
		model.addAttribute("user",this.userService.getUserById(id));
		model.addAttribute("listUsers",this.userService.getAllUser());
		return "user";
	}
	
}
