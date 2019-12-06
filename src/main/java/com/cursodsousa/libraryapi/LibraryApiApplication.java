package com.cursodsousa.libraryapi;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class LibraryApiApplication {

	@Autowired
	private JavaMailSender mailSender;

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

//	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setFrom("library@mail.com");
			mailMessage.setSubject("Test");
			mailMessage.setText("text");
			mailMessage.setTo("dougllasfps@gmail.com");
			mailSender.send(mailMessage);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(LibraryApiApplication.class, args);
	}

}
