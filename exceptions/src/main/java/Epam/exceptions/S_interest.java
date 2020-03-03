package Epam.exceptions;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S_interest {
	private static final Logger LOGGER = LogManager.getLogger(S_interest.class);
	public static void calculateInterest() {
		Scanner scan = new Scanner(System.in);
		LOGGER.error("Enter principle amount: ");
		try {
		double principleAmount = scan.nextDouble();
		LOGGER.error("Enter time period: ");
		double time = scan.nextDouble();
		LOGGER.error("Enter rate of Interest: ");
		double interest = scan.nextDouble();
		double simpleInt = (principleAmount * time * interest) / 100;
		double compoundInt = (principleAmount * Math.pow(1 + (interest / 100), time)) - principleAmount;
		LOGGER.error("simple interest = "+ simpleInt + "Rs" );
		LOGGER.error("compound interest = " + compoundInt+"Rs");
	
		} catch (Exception e) {
		LOGGER.error("enter a valid input!");
	
		}
		
	
	
		}

}
