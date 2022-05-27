package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.EmployeeLogin;


@Controller
public class MainController {

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.POST)
	public String addPersonSave(Model model, //
			@ModelAttribute("personForm") EmployeeLogin empLogin) {

		String userName = empLogin.getUserName();
		String passWord = empLogin.getPassWord();

		if (userName != null && userName.length() > 0 //
				&& passWord != null && passWord.length() > 0) {
			
			return "homepage";
//			Person newPerson = new Person(firstName, lastName);
//			persons.add(newPerson);
//
//			return "redirect:/index";
		}
		String error = "User Name & Password is required!";
		model.addAttribute("errorMessage", error);
		return "index";
	}

}
