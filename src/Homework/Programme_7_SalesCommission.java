package Homework;

import java.util.Scanner;

/**
 *  Write a java program input seller id, sellers name, sales amount, and basic salary
 *   then fined this sales
 *   Commission
 *   Sales amount &gt;= 50,000 35%
 *   Sales amount &gt;= 30,000 20%
 *   &gt;= 20,000 10%
 *   &gt;= 10,000 5%
 *   &lt; 10,000 2%
 *
 *
 */

public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller Name:");
        String name = scanner.nextLine();
        System.out.println("Enter seller Id:");
        int sellerId = scanner.nextInt();
        System.out.println("Enter sales Amount:");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter basic salary:");
        int basicSalary = scanner.nextInt();
        // creating object to call instance method
        Programme_7_SalesCommission salesCommission = new Programme_7_SalesCommission();
        int grossSalary = basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println("seller name is           :"+name);
        System.out.println("seller id is             :"+sellerId);
        System.out.println("seller's sales amount    :"+salesAmount);
        System.out.println("seller's gross salary    :"+grossSalary);
        //Closing scanner object
        scanner.close();
    }
    //calculating the sales commission
    public int calculateCommission(int salesamount){
        int commission;
        if(salesamount>= 50000){
            commission = (salesamount * 35/100);
            System.out.println("sales commission is"+ commission);
        } else if (salesamount>=30000) {
            commission = (salesamount * 20 / 100);
            System.out.println("sales commission is" + commission);
        } else if (salesamount>=20000) {
            commission =(salesamount * 10/100);
            System.out.println("sales commission is " +commission);
        } else if (salesamount>=10000) {
            commission = (salesamount * 5/100);
            System.out.println("sales commission is"+ commission);
        } else  {
            commission = (salesamount * 2);
            System.out.println("sales commission is" +commission);
        }
        return commission;
    }
    }

