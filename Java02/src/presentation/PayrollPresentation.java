// Created by: Sheridan Schanaman
// 2/22/20
// Java02 Project: Payroll-on-Demand
package presentation;
import java.util.*;
import business02.PayrollBusiness;
import business02.Validation;



public class PayrollPresentation 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		PayrollBusiness employee1 = new PayrollBusiness();
		String answer = "";
		
		do 
		{
			checkEmpNum(employee1, sc);
			checkEmpLast(employee1, sc);
			checkEmpFirst(employee1, sc);
			checkEmpSocial(employee1, sc);
			checkHoursWorked(employee1, sc);
			checkRateOfPay(employee1, sc);
			calcGrossPay(employee1);
			
			System.out.print("Do you wish to enter another employee? y/n ");
			answer = sc.next();
			sc.nextLine();
			
		}while(answer.equalsIgnoreCase("y"));
	}

	public static void checkEmpNum(PayrollBusiness employee1, Scanner sc) 
	{
		String empNum = "";
		int min = 1;
		int max = 5000;
		boolean errorCheck = false;
		
		do 
		{
			System.out.print("Please enter employee number: ");
			empNum = sc.nextLine();
			errorCheck = Validation.isInteger(empNum, "Employee Number ") &&
						 Validation.isWithinRangeInteger(empNum, min, max, "Employee Number ");
			
		}while(!errorCheck);
		
		employee1.setEmpNumber(Integer.parseInt(empNum));
	}

	public static void checkEmpLast(PayrollBusiness employee1, Scanner sc) 
	{
		String empLastName = "";
		boolean errorCheck = false;
		
		do 
		{
			System.out.print("Please enter the employee's last name: ");
			empLastName = sc.nextLine();
			errorCheck = Validation.isStringPresent(empLastName, "Employee Last Name ");
			
			
		}while(!errorCheck);
		
		employee1.setEmpLastName(empLastName);
	}
	public static void checkEmpFirst(PayrollBusiness employee1, Scanner sc) 
	{
		String empFirstName = "";
		boolean errorCheck = false;
		
		do 
		{
			System.out.print("Please enter the employee's first name: ");
			empFirstName = sc.nextLine();
			errorCheck = Validation.isStringPresent(empFirstName, "Employee First Name ");
			
		}while(!errorCheck);
		
		employee1.setEmpFirstName(empFirstName);	
	}
	public static void checkEmpSocial(PayrollBusiness employee1, Scanner sc) 
	{
		String empSocial = "";
		int min = 111111111;
		int max = 999999999;
		boolean errorCheck = false;
		
		do 
		{
			System.out.print("Please enter the employee SSN: ");
			empSocial = sc.nextLine();
			errorCheck = Validation.isInteger(empSocial, "Employee SSN ") &&
						 Validation.isWithinRangeInteger(empSocial, min, max, "Employee SSN ");
			
		}while(!errorCheck);
		
		 employee1.setEmpSocial(Integer.parseInt(empSocial));
	}
	public static void checkHoursWorked(PayrollBusiness employee1, Scanner sc) 
	{
		String hoursWorked = "";
		double min = 0.25;
		double max = 80.00;
		boolean errorCheck = false;
		
		do 
		{
			System.out.print("Please enter the number of hours worked: ");
			hoursWorked = sc.nextLine();
			errorCheck = Validation.isDouble(hoursWorked, "Hours Worked ") &&
						 Validation.isWithinRangeDouble(hoursWorked, min, max, "Hours Worked ");
			
		}while(!errorCheck);
		
		employee1.setHoursWorked(Double.parseDouble(hoursWorked));
	}	
	public static void checkRateOfPay(PayrollBusiness employee1, Scanner sc) 
	{
		String rateOfPay = "";
		double min = 9.00;
		double max = 25.00;
		boolean errorCheck = false;
		
		do 
		{
			System.out.print("Please enter the rate of pay: ");
			rateOfPay = sc.nextLine();
			errorCheck = Validation.isDouble(rateOfPay, "Rate of pay") &&
						 Validation.isWithinRangeDouble(rateOfPay, min, max, "Rate of pay");
		}while(!errorCheck);
		
		employee1.setRateOfPay(Double.parseDouble(rateOfPay));
	}
	public static void calcGrossPay(PayrollBusiness employee1) 
	{
		System.out.println("Please check information for accuracy." + 
				"\nEmployee Number: " + employee1.getEmpNumber() +
				"\nLast Name: " + employee1.getEmpLastName() + 
				"\nFirst Name: " + employee1.getEmpFirstName() + 
				"\nSocial Security Number: " + employee1.getEmpSocial() + 
				"\nHours Worked: " + employee1.getHoursWorked() + 
				"\nRate of pay: " + employee1.getRateOfPay() + 
				"\nTotal Gross Pay: " + Validation.formatAndRound(employee1.calcGrossPay()));
		
	}
}