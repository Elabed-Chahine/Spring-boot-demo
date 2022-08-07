package com.release_notes_demo.automatic_release_notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AutomaticReleaseNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomaticReleaseNotesApplication.class, args);
	}

	@GetMapping("/demo")
	public String demo(@RequestParam(value="name", defaultValue="world") String name){
		return String.format("hello %s!",name);

	}


	
}
