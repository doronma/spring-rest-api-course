package boot_rest.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	public HelloController() {
		System.out.println("Hello Conctroller Constructor");
	}
	
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi";
	}

}
