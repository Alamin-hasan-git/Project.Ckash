package com.Ckash;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.UUID;

public class admin extends com.Ckash.Main {

    double fee;
    String ref;
    Scanner input = new Scanner(System.in);
    admin (){}
    //constructor
    admin(double amount, long number, int num)
    {
        UUID transaction = UUID.randomUUID();
        LocalTime time = LocalTime.now();
//
        if (num == 3) {
            fee = amount * 0.02;
            amount = amount + fee;
        }

        if (mainBalance> amount) {
            if (num == 1) {
                System.out.print("Enter Reference: ");
                String ref = input.nextLine();
                System.out.println("------------------------------------------------------------------------------------");

                System.out.println("Send To.\n0" + number + "\nAmount: " + amount + " tk." + "\nReference: " + ref);
                System.out.print("Enter Menu Pin to confirm: ");
            }
            if (num==3)
            {
                System.out.println("------------------------------------------------------------------------------------");
                System.out.print("Cash out from: \n0" + number + "\nAmount: " + amount + " tk. including fee\n");
                System.out.print("Enter Menu to confirm: ");
            }

            int Cpin = input.nextInt();
            if (Cpin == pin) {
                mainBalance = mainBalance - amount;
                if (num == 1) {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Send Money Tk " + amount + " Successfull!"+"\nTransaction Id:"+transaction+"\nTime: "+time);
                    System.out.println("After Send Money New Balance is: "+mainBalance+" tk.");
                }
                if (num == 3) {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Cashout tk " + amount + " Succcessfull!"+"\nTransaction Id is: "+transaction+"\nTime: "+time);
                    System.out.println("After Cashout New Balance is: "+mainBalance);
                }
            }
            else
                System.out.println("Please Enter a valid pin!");
        }
        else
            System.out.println("Insufficient Funds!");

    }

    public void numbercheck(long number, int num) {
        if (number > 1300000000 && number< 1999999999) {
            System.out.print("Enter Amount: ");
            double amount = input.nextDouble();
            if (amount<=0)
            {
                System.out.println("invalid digit!");
            }
            else
            {
                admin ad = new admin(amount, number, num);
            }
        }
        else
            System.out.println("Please Enter a valid Number!");
    }

}




