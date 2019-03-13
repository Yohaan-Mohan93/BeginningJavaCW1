/* Name: Yohaan Mohan
 * Student Number: 160291137
 */

import java.util.Scanner;

public class TaxAdvisor 
{
    static int salary, allowance;
    static String blindString, laundryString, homeString;
    static boolean blind, laundry, workHome;
    static double firstBand,secondBand,thirdBand,totalTaxPaid;
    static String[] answers = new String[] {"Yes", "y", "Y","yes","yeah","Yeah","Yup","yup"};
    
    public static boolean checkIfYes(String wordIn)
    {
        boolean boolIn = false;
        
        for(int i = 0; i < answers.length; i++)
        {
            if(wordIn.equals(answers[i]))
            {
                boolIn = true;
            }
        }
        
        return boolIn;
    }
    
    public static int calculateAllowance()
    {
        int allowanceReturn;
        
        if(salary >= 122000)
            allowanceReturn = 0;
        else
        {
            allowanceReturn = 11000;
            if(blind == true)
                allowanceReturn += 2290;
            if(laundry == true)
                allowanceReturn += 60;
            if(workHome == true)
                allowanceReturn += 200;
        }
        
        return allowanceReturn;
    }
    
    public static double firstTaxBand()
    {
        if(salary > 43000)
        {
            if(allowance > 0)
            {
                return ((43000 - allowance)* 0.2);
            }
            return (43000 * 0.2);
        }
        else
            return (salary - allowance * 0.2);
    }
    
    public static double secondTaxBand()
    {
        if(salary < 43001)
            return 0.0;
        else if(salary > 150000)
            return ((107000) * 0.4);
        else
            return ((salary - 43000 ) * 0.4);
    }
    
    public static double thirdTaxBand()
    {
        if(salary < 150001)
            return 0.0;
        else
            return ((salary - 150000) * 0.45);
    }
    
    public static void TaxAdvisorMain()
    {
        Scanner inputObj = new Scanner(System.in);
        
        System.out.println("How much is your salary?");
        salary = inputObj.nextInt();
        
        System.out.println("Do you recieve blind benefits (Yes/No)?");
        blindString = inputObj.next();
        
        System.out.println("Do you recieve laundry benefits (Yes/No)?");
        laundryString = inputObj.next();
        
        System.out.println("Do you recieve work home benefits (Yes/No)?");
        homeString = inputObj.next();
                        
        workHome = checkIfYes(homeString);
        blind = checkIfYes(blindString);
        laundry = checkIfYes(laundryString);
        
        allowance = calculateAllowance();
        
        firstBand = firstTaxBand();
        
        secondBand = secondTaxBand();
        
        thirdBand = thirdTaxBand();
        
        totalTaxPaid = firstBand + secondBand + thirdBand;
        
        System.out.println("Your salary is " + salary);
        
        System.out.println("Your tax allownance is " + allowance);
        
        System.out.println("You owe " + firstBand + " in the first tax band (20%) paid on taxable income up to 43,000.");
        
        System.out.println("You owe " + secondBand + " in the second tax band (40%) paid on taxable income above 43,000 and upto 150,000.");
        
        System.out.println("You owe " + thirdBand + " in the third tax band (45%) paid on taxable income over 150,000.");
        
        System.out.println("Total tax owed on your salary = " + totalTaxPaid);
        
    }
    public static void main(String[] args)
    {
        TaxAdvisorMain();
    }
}
