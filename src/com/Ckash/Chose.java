package com.Ckash;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.UUID;

public class Chose extends com.Ckash.Main {
    Scanner input = new Scanner(System.in);
    com.Ckash.admin obj = new admin();
    UUID transaction = UUID.randomUUID();
    LocalTime time = LocalTime.now();

    public void sendMoney() {
        System.out.print("Enter Receiver Number: +880");
        long number = input.nextLong();
        obj.numbercheck(number, 1);
    }

    public void cashOut() {
        System.out.println("Cashout fee 2%");
        System.out.print("Enter Agent number: +880");
        long number = input.nextLong();
        obj.numbercheck(number, 3);
    }

    public void recharge() {
        System.out.println("Enter Your Operator: ");
        System.out.println("1.Robi");
        System.out.println("2.Airtel");
        System.out.println("3.Grameenphone");
        System.out.println("4.Banglalink");
        int n = input.nextInt();

        switch (n) {
            case 1: {
                System.out.print("Enter Your Robi Number: +880");
                long robi = input.nextLong();

                if (robi >= 1800000000 && robi <= 1899999999)
                {
                    rechargeAmount(robi);
                }
                else
                {
                    System.out.println("please enter a valid Robi Number!");
                }

                break;
            }

            case 2: {
                System.out.print("Enter Your Airtel Number: +880");
                long airtel = input.nextLong();

                if (airtel >= 1600000000 && airtel <= 1699999999)
                {
                    rechargeAmount(airtel);
                }
                else
                {
                    System.out.println("please enter a valid Airtel Number!");
                }
                break;
            }

            case 3: {
                System.out.print("Enter Your GP Number: +880");
                long gp = input.nextLong();

                if (gp >= 1300000000 && gp <= 1399999999 || gp >= 1700000000 && gp <= 1799999999)
                {
                    rechargeAmount(gp);
                }
                else
                {
                    System.out.println("please enter a valid GP Number!");
                }
                break;

            }
            case 4: {
                System.out.print("Enter Your Banglalink Number: +880");
                long bal = input.nextLong();

                if (bal >= 1400000000 && bal <= 1499999999 || bal >= 1900000000 && bal <= 1999999999)
                {
                    rechargeAmount(bal);
                }
                else
                {
                    System.out.println("please enter a valid Banglalink Number!");
                }
                break;
            }
        }
    }

    public void rechargeAmount(long number) {
        System.out.print("Enter Amount: ");
        float amount = input.nextFloat();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("\nMobile Recharge\nTo: 0" + number + "\nAmount: Tk " + amount + "\nTo Know if the amount is for recharge\noffer, contact mobile operator.\nEnter Menu PIN to Confirm: ");
        int cpin = input.nextInt();


        if (cpin == pin) {
            if (mainBalance > amount) {
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("Your cKash Mobile Recharge Request \n0f Tk " + amount + " for " + number + " was successful.");
                System.out.println("Transaction Id:"+transaction+"\nTime : " +time);

            } else
                System.out.println("insufficient funds!");
        } else
            System.out.println("please enter Correct pin!");
    }

    public void myAcc()
    {
        System.out.println("------------------------Send Instructions---------------------------------------------------");
        System.out.println("cKash");
        System.out.println("1.Check Balance ");
        System.out.print("2.Change pin "+"\n ==>:");
        int num = input.nextInt();

        switch (num)
        {
            case 1:
            {
                checkBalance();
                break;
            }
            case 2:
            {
                changePin();
                break;
            }

        }

    }

    void checkBalance()
    {
        System.out.print("Enter Pin: ");
        int bpin = input.nextInt();

        if (bpin==pin)
        {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("cKash\nCurrent balance Tk "+ mainBalance);
        }
        else
            System.out.println("The mobile pin is invalid");
    }

    void changePin()
    {
        System.out.print("Enter Old pin: ");
        int bpin = input.nextInt();

        if (bpin == pin)
        {
            System.out.print("Enter a 4 digit new pin : ");
            int newpin = input.nextInt();
            System.out.println("pin change successfully!");
            newpin(newpin);
        }
        else
            System.out.println("Incorrect password");
    }

    public void newpin(int npin)
    {
        pin = npin;

    }


}


