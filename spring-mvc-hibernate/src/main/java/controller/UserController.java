package controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
@RestController
public class UserController {

	@RequestMapping("/home")
	 public String display()  
    {  
		System.out.println("this is home url");
        return "index";  
    } 
}
