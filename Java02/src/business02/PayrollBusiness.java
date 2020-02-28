// Created by: Sheridan Schanaman
// 2/22/20
// Java02 Project: Payroll-on-Demand 


package business02;

public class PayrollBusiness 
{
	//Instance variables
	private int empNumber;
	private String empLastName;
	private String empFirstName;
	private int empSocial;
	private double hoursWorked;
	private double rateOfPay;
	
	//Blank constructor
	public PayrollBusiness()
	{
		empNumber = 0;
		empLastName = "";
		empFirstName = "";
		empSocial = 0;
		hoursWorked = 0.00;
		rateOfPay = 0.00;
		
	}
	//Constructor accepting arguments
	public PayrollBusiness(int empNumber, String empLastName, String empFirstName, int empSocial, double hoursWorked, double rateOfPay) 
	{
		this.empNumber = empNumber;
		this.empLastName = empLastName;
		this.empFirstName = empFirstName;
		this.empSocial = empSocial;
		this.hoursWorked = hoursWorked;
	}
	//Lines 39-88 are get-set methods
	public void setEmpNumber(int empNumber) 
	{
		this.empNumber = empNumber;
	}
	
	public int getEmpNumber() 
	{
		return empNumber;
	}
	public void setEmpLastName(String empLastName) 
	{
		this.empLastName = empLastName;
		
	}
	public String getEmpLastName()
	{
		return empLastName; 
	}
	public void setEmpFirstName(String empFirstName) 
	{
		this.empFirstName = empFirstName;
	}
	public String getEmpFirstName() 
	{
		return empFirstName;
	}
	public void setEmpSocial(int empSocial) 
	{
		this.empSocial = empSocial;
	}
	public int getEmpSocial() 
	{
		return empSocial;
	}
	public void setHoursWorked(double hoursWorked) 
	{
		this.hoursWorked = hoursWorked; 
	}
	public double getHoursWorked() 
	{
		return hoursWorked;
	}
	public void setRateOfPay(double rateOfPay) 
	{
		this.rateOfPay = rateOfPay;
	}
	public double getRateOfPay() 
	{
		return rateOfPay;
	}
	//Method calculating gross pay
	public double calcGrossPay() 
	{	double overtimeHours = 0.00;
		double grossPay = 0.00;
		double overtimePay = 0.00;
		double newGrossPay = 0.00;
		if(hoursWorked <= 40.00) 
		{
			grossPay = hoursWorked * rateOfPay;
			return  grossPay;
			
		} else 
		{	
			grossPay = hoursWorked * rateOfPay;
			overtimeHours = hoursWorked - 40.00;
			overtimePay = (overtimeHours * 1.50) * rateOfPay;
			newGrossPay = overtimePay + grossPay;
			
			return newGrossPay;
		}
		
		
		}
			
	}