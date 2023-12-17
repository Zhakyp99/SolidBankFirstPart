package com.example.SolidBank;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SolidBankApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
		AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
		printManual();
		Scanner scanner = new Scanner(System.in);
		String clientID = "1";
        while (true){
			System.out.print("> ");
			String number = scanner.nextLine();
			switch (number) {
				case "1" -> accountBasicCLI.getAccounts(clientID);
				case "2" -> accountBasicCLI.createAccountRequest(clientID);
				case "3" -> System.out.println("not finished yet");
				case "4" -> System.out.println("not finished yet");
				case "5" -> System.out.println("not finished yet");
				case "6" -> printManual();
				case "7" -> exit();
				default -> System.out.println("Please enter valid number");
			}

		}
	}
	private static void printManual(){
		try {
			File readFile = new File("src/main/resources/manual.txt");
			Scanner scanner = new Scanner(readFile);
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	private static void exit(){
		System.out.println("Application Closed");
		System.exit(0);
	}

}
