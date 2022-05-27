package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

	@RequestMapping("/home")
	public String display() {
		System.out.println("this is home url");
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("Model and view implementation page...");
		ModelAndView mv = new ModelAndView();
		
		// setting data
		mv.addObject("name", "kutta");
		mv.addObject("rollnumber",234567);
		
		
		// marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(34);
		list.add(56);
		list.add(278);
		list.add(89);
		list.add(200000);
		mv.addObject("marks",list);
		
		// setting view name
		mv.setViewName("help");
		return mv;
		
	}
}
