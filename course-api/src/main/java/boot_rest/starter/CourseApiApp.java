package boot_rest.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("boot_rest.*")
public class CourseApiApp {

	
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class,args);

	}

}
