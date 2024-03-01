package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
@RestController
@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/")
	@GetMapping
	public String home() {
		return "<html><body><p>Home con HTML</p></body></html>";
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/new")
	public String newHome() {
		return "Hola mundo";
	}
}
