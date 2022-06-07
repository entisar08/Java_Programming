package day05_arithmaticOperators;

public class SalaryCaculator {
    public static void main(String[] args) {

        double hourlyRate= 45,
                weeklyHours= 40;
        double stateTaxRate= 6; //implcicit casting
        double fedralTaxRate= 25.5;

        //-----------------------------------------------------------------

        double salarybforeTax= hourlyRate*weeklyHours*52;
        double stateTax= salarybforeTax*stateTaxRate/100;
        double federalTax= salarybforeTax* fedralTaxRate;
        double totalTax= stateTax+federalTax;
        double salaryAfterTax=salarybforeTax-totalTax;

        //---------------------------------------------------
        System.out.println("gross pay is: $" + salarybforeTax);


        //System.out.println("salarybforeTax = " + salarybforeTax);
       // System.out.println( stateTax);





    }
}
/*
1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560
*/