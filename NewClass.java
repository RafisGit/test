
package Shawon;

import java.util.Scanner;

public class AccountHolder {

    static void checkAmount(double a) throws NegativeAmountException{
        if(a<0) throw new NegativeAmountException(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount;
        System.out.println("What do you want to do: \n1. Deposit\n2. Withdraw\nEnter your choice(1/2): ");
        int a = sc.nextInt();
        if(a==1) {
            System.out.print("Enter your deposit amount: ");
            amount = sc.nextDouble();
        }
        else {
            System.out.printf("Enter your withdraw amount: ");
            amount = sc.nextDouble();
        }

        try{
            checkAmount(amount);
            System.out.print("Your Transaction is successful!");
        }
        catch (Exception e){
            System.out.print(e);
        }

    }
}package Shawon;

public class NegativeAmountException extends Exception{
    private double amount;
    public NegativeAmountException(double amount){
        this.amount = amount;
    }

    public String toString(){
        return "NegativeAmountException: "+amount;
    }
}
