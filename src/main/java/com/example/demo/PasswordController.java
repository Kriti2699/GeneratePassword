
		package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/password")
public class PasswordController {

	private final PasswordGeneratorWithParameter passwordGenerator =
			new PasswordGeneratorWithParameter();

	@GetMapping("/generate")
	public String generatePassword(
			@RequestParam int length,
			@RequestParam boolean upper,
			@RequestParam boolean lower,
			@RequestParam boolean special,
			@RequestParam boolean digit) {

		return passwordGenerator.generateRandomPassword(
				length, upper, lower, special, digit);
	}
}
