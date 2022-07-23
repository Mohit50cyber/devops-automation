package com.example67.devopsautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsautomationApplication {

	@GetMapping("/qwerty123")
	public String qwerty(){
		return "Relax QWERTY !!!!!!!!!!!!!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsautomationApplication.class, args);
	}

}
