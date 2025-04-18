package com.Ckash;

import java.util.Scanner;

public class Main {
    double mainBalance = 10000;
    int pin = 1234;

    public static void main(String[] args) {
        Chose chose = new Chose();
        boolean exit = true;

        Scanner input = new Scanner(System.in);
        System.out.println("\n---------------------------Welcome to cKash-----------------------------------------------");

        do {
            System.out.println("\nEnter Your Choice: ");
            System.out.println("1.Send Money");
            System.out.println("2.Recharge");
            System.out.println("3.Cash out");
            System.out.println("4.My cKash");
            System.out.println("press 0 for exit program");
            System.out.print("==>:");
            int num = input.nextInt();

            switch (num)
            {
                case 1:
                {
                    chose.sendMoney();
                    break;
                }

                case 2:
                {
                    chose.recharge();
                    break;
                }

                case 3:
                {
                    chose.cashOut();
                    break;
                }
                case 4:
                {
                    chose.myAcc();
                }
                default:
                    if (num==0)
                    {
                        exit =false;

                    }
            }
        }while (exit);
    }
}
