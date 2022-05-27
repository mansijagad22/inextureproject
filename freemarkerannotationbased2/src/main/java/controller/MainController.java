package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import form.PersonForm;
import model.Person;

@Controller
public class MainController {

//    private static List<Person> persons = new ArrayList<Person>();
//
//    static {
//        persons.add(new Person("Bill", "Gates"));
//        persons.add(new Person("Steve", "Jobs"));
//    }

//    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
//    public String index(Model model) {
//
//        model.addAttribute("persons", persons);
//
//        return "index";
//    }

//    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.GET)
//    public String addPersonForm(Model model) {
//
//        PersonForm personForm = new PersonForm();
//        model.addAttribute("personForm", personForm);
//
//        return "addPerson";
//    }

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String addPersonSave(Model model, //
			@ModelAttribute("personForm") PersonForm personForm) {

		String userName = personForm.getUserName();
		String passWord = personForm.getPassWord();

		if (userName != null && userName.length() > 0 //
				&& passWord != null && passWord.length() > 0) {
			Person newPerson = new Person(userName, passWord);
//            persons.add(newPerson);

			return "homepage";
		}
		String error = "First Name & Last Name is required!";
		model.addAttribute("errorMessage", error);
		return "index";
	}

	@RequestMapping("/reset-password")
	public String forgetPassword(Model model) {
		return "reset-password";
	}

	@RequestMapping("/register")
	public String register(Model model) {
		return "register";
	}
	@RequestMapping("/repeater")
	public String repeater(Model model) {
		return "repeater";
	}
	

}
