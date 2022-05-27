package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Student;
// for annotation use
@Configuration
public class StudentConfig {
	@Bean
	public Student student() {
		return new Student();
	}

}
