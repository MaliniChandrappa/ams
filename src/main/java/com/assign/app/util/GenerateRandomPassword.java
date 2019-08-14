package com.assign.app.util;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class GenerateRandomPassword {

	public GenerateRandomPassword() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * public UUID generatePassword() {
	 * 
	 * UUID uuid1 = Generators.timeBasedGenerator().generate(); return uuid1; }
	 */

	public String generatePassword() {
		int len = 6;
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";
		String values = Capital_chars + Small_chars + symbols+numbers ;

		Random rndm_method = new Random();
		char[] pwd = new char[len];
		for (int i = 0; i < len; i++) {
			pwd[i] = values.charAt(rndm_method.nextInt(values.length()));

		}
		String password = new String(pwd);
		return password;
	}
	
}
