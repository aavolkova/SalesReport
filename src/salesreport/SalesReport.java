package salesreport;

import java.util.Scanner;

public class SalesReport {

	public static void main(String[] args) {
		//Declare variables:
		String customerNumber; 
		String customerName;
		double salesAmount;
		int taxCode;
		double salesTax = 0;
		double totalAmountDue = 0;
		
		//Create a scanner:
		Scanner scan = new Scanner (System.in);
		
		//Prompt the user what the program will do:
		System.out.println("This program will read a file of sales records and produce a sales report");
		
		//Read the file/get user's input
		System.out.println("Please enter the customer number");
		customerNumber = scan.nextLine();
		System.out.println("Please enter the customer name");
		customerName = scan.nextLine();
		System.out.println("Please enter the sales amount");
		salesAmount = scan.nextDouble();
		System.out.println("Please enter the tax code (0/1/2)");
		taxCode = scan.nextInt();
		
		while (!(taxCode == 0 || taxCode == 1 || taxCode == 2))
		{
			System.out.println("You entered invalid tax code");
			System.out.println("Please enter the tax code (0/1/2)");
			taxCode = scan.nextInt();
		}
		System.out.println();
		
		//Process the file/user's input:
		//Calculate the sales tax:
		if (taxCode == 1)
		{
			salesTax = salesAmount * 0.03;
		}
		else if (taxCode == 2)
		{
			salesTax = salesAmount * 0.05;
		}
		else
		{
			salesTax = 0;
		}
		
		//Calculate the total amount due:
		totalAmountDue = salesAmount + salesTax;
				
		//Print Sales Report:
		System.out.println("Sales Report:");
		System.out.println("*************");
		System.out.println("Customer Number: " + customerNumber);
		System.out.println("Customer Name: " + customerName);
		System.out.printf("Sales Amount: $%.2f%n", salesAmount);
		System.out.printf("Sales Tax: $%.2f%n", salesTax);	
		System.out.printf("The total amount due: $%.2f%n", totalAmountDue);				
				
	}

}


/*
Output test case 1:
This program will read a file of sales records and produce a sales report
Please enter the customer number
112233
Please enter the customer name
Sam Kim
Please enter the sales amount
100.00
Please enter the tax code (0/1/2)
2

Sales Report:
*************
Customer Number: 112233
Customer Name: Sam Kim
Sales Amount: $100.00
Sales Tax: $5.00
The total amount due: $105.00

-------------------------------------------
Output test case 2:
This program will read a file of sales records and produce a sales report
Please enter the customer number
10-000888999
Please enter the customer name
Lisa S. Foster
Please enter the sales amount
1000.1
Please enter the tax code (0/1/2)
99
You entered invalid tax code
Please enter the tax code (0/1/2)
1

Sales Report:
*************
Customer Number: 10-000888999
Customer Name: Lisa S. Foster
Sales Amount: $1000.10
Sales Tax: $30.00
The total amount due: $1030.10

*/