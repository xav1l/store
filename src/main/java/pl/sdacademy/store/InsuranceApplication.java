package pl.sdacademy.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.sdacademy.store.components.MyPlainClass;

@SpringBootApplication
public class InsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceApplication.class, args);
	}

	@Bean
	public MyPlainClass myPlainClass(){
		return new MyPlainClass();
	}
}
