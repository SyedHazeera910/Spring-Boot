package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;

@SpringBootApplication
public class DempApplication implements CommandLineRunner{
	@Autowired
	private StudentServive studentservive;

	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(DemoApplication.class);

	public class DemoApplication {

		public static void main(String[] args) {
			SpringApplication.run(DemoApplication.class, args);
		}

	}
	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("My program is started....");
		try(Scanner sc=new Scanner(System.in)){
			int regno=sc.nextInt();
			System.out.println(StudentService.studentservice(regno));
		}catch(InputMismatchException){
			LOGGER.error("invalid student RegNo");
		}
		LOGGER.info("My program is Ended....");

	}
}

