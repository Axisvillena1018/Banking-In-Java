package com.mycompany.midtermproject;
import java.io.*;

public class SimpleBankingItp 
{
    public static void main(String args[]) throws IOException
        {
        BufferedReader coms = new BufferedReader(new InputStreamReader(System.in));
        int user;
        //balance = 0 if have a I/O
        
        System.out.println("=====[JavaBank]=====");
        System.out.println("Greeting Sir/Ma'am");
        System.out.println("[1] - New User");
        System.out.println("[2] - Existing User");
        System.out.println("---");
        System.out.print ("Command: ");
        user = Integer.parseInt(coms.readLine());
        System.out.println(" ");
        switch (user)
        {
            case 1:
                String fname;
                String mname;
                String lname;
                long naccno;
                int npinno;
                int vpin1;
                System.out.println(" >> [SIGN UP] << ");
                System.out.print ("First Name : ");
                fname = coms.readLine();
                System.out.print ("Middle Name: ");
                mname = coms.readLine();
                System.out.print ("Last Name  : ");
                lname = coms.readLine();
                System.out.println (" ");
                System.out.println(" >> [SECURITY] << ");
                System.out.print ("8 Digits Account No.: ");
                naccno = Long.parseLong(coms.readLine());
                System.out.print ("6 Digits PIN No.    : ");
                npinno = Integer.parseInt(coms.readLine());
                System.out.println(" ");
                System.out.println(" >> [PIN VERIFICATION] <<");
                System.out.println("Verify your new PIN no.");
                System.out.println("---");
                for (int i = 1; i<= 3; i++)
                {
                  System.out.print("PIN no.: ");
                  vpin1 = Integer.parseInt(coms.readLine());
                  System.out.println (" ");
                  if (vpin1 == npinno)
                  {
                      System.out.println(" >> [SUCCESS] <<");
                      System.out.println("Your Pin Number is correct");
                      System.out.println(" ");
                      System.out.println(" >> [CONFIRMATION] <<");
                      System.out.println("---");
                      System.out.println("Account Name  : " + fname + " " + mname.charAt(0)+ ". " + lname);
                      System.out.println("Account Number: " + naccno);
                      System.out.println("PIN Number    : " + npinno);
                      System.out.println("---");
                      System.out.println("Status: Your Account has been Created");
                      System.out.println("Thank you for using this Services");
                      //Print File
                      break;
                  }
                  else
                  {
                      System.out.println(" >> [ERROR] << ");
                      System.out.println("Wrong PIN No.");
                      System.out.println(" ");
                      if (i == 3)
                      {
                          System.out.println(" >> [TERMINATED] << ");
                          System.out.println("Account Creation has been Terminated");
                          System.out.println("---");
                          System.out.println("Reason: Attempt Limit has been Reached");
                          System.out.println("Thank you for using this Services");
                          break;
                      }
                      else
                      {
                          System.out.println ("Please Try Again");
                          System.out.println ("Attempts: " + i + "/3");
                          System.out.println (" ");
                      }
                  }
                }
                break;
            case 2:
                int epinno;
                int mypin = 101802;
                long myaccno = 10182002;
                String myfname = "Axis";
                // Note: Blank all the declared variables when I using I/O file
                // Also may enter their account number
                System.out.println(" >> [SIGN IN] << ");
                System.out.println("Please Enter your 6 Digit Pin No.");
                System.out.println("---");
                for (int j = 1; j <= 3; j++)
                {
                    System.out.print("Pin No.: ");
                    epinno = Integer.parseInt(coms.readLine());
                    System.out.println(" ");
                    if (epinno == mypin)
                    {
                        int services;
                        System.out.println(" >> [SIGN IN SUCCESS] << ");
                        System.out.println("Welcome Back: " + myfname);
                        System.out.println("Account Number: " + myaccno);
                        System.out.println("---");
                        System.out.println(" ===[Services]=== ");
                        System.out.println("[1] - Deposit");
                        System.out.println("[2] - Withdraw");
                        System.out.println("[3] - Balance");
                        System.out.println("[4] - Trasfer Fund");
                        System.out.println("[5] - Payments");
                        System.out.println("[6] - PIN Change");
                        System.out.println("[7] - Sign Out");
                        System.out.println("---");
                        System.out.print("Command: ");
                        services = Integer.parseInt(coms.readLine());
                        System.out.println(" ");
                        double bal = 10000.00;
                        double nbal;
                        switch(services)
                        {
                            case 1:
                                double depamt;
                                System.out.println(" >> [DEPOSIT] << ");
                                System.out.println("Please enter the amount");
                                System.out.println("---");
                                System.out.print("Amount: ");
                                depamt = Double.parseDouble(coms.readLine());
                                System.out.println(" ");
                                nbal = bal + depamt;
                                System.out.println(" >> [SUCCESS] << ");
                                System.out.println("You deposited the amount of PHP " + depamt);
                                System.out.println("---");
                                System.out.println("New Balance: " + nbal);
                                //Save File
                                System.out.println(" ");
                                System.out.println("Thank you for using this Services");
                                break;
                            case 2:
                                double witamt;
                                System.out.println(" >> [WITHDRAW] << ");
                                System.out.println("Please enter the amount");
                                System.out.println("---");
                                System.out.print("Amount: ");
                                witamt = Double.parseDouble(coms.readLine());
                                System.out.println(" ");
                                if (bal < witamt)
                                {
                                    System.out.println(" >> [TERMINATED] <<");
                                    System.out.println("Services has been Terminated");
                                    System.out.println("---");
                                    System.out.println("Reason: Not Enough Balance");
                                    //Save File
                                }
                                else
                                {
                                    nbal = bal - witamt;
                                    System.out.println(" >> [SUCCESS] << ");
                                    System.out.println("You withdrawn the amount of PHP " + witamt);
                                    System.out.println("---");
                                    System.out.println("New Balance: " + nbal);
                                    //Save File
                                }
                                System.out.println(" ");
                                System.out.println("Thank you for using this Services");
                                break;
                            case 3:
                                System.out.println(" >> [BALANCE INQUIRY] <<");
                                System.out.println("Current Balance: " + bal);
                                System.out.println(" ");
                                System.out.println("Thank you for using this Services");
                                break;
                            case 4:
                                //It must open the other's account number
                                long othaccno;
                                double traamt;
                                System.out.println(" >> [FUND TRANSFER] <<");
                                System.out.println("Enter your recepient's Account Number");
                                System.out.println("And their Transfer Amount");
                                System.out.println("---");
                                System.out.print ("Account Number: ");
                                othaccno = Long.parseLong(coms.readLine());
                                System.out.print ("Amount        : ");
                                traamt = Double.parseDouble(coms.readLine());
                                System.out.println(" ");
                                if (bal < traamt)
                                {
                                    System.out.println(" >> [TERMINATED] <<");
                                    System.out.println("Services has been Terminated");
                                    System.out.println("---");
                                    System.out.println("Reason: Not Enough Balance");
                                    //Save File
                                }
                                else
                                {
                                    nbal = bal - traamt;
                                    System.out.println(" >> [SUCCESS] << ");
                                    System.out.println("You transfered the amount of PHP " + traamt);
                                    System.out.println("---");
                                    System.out.println("To   : " + othaccno);
                                    System.out.println("From : " + myaccno);
                                    System.out.println("---");
                                    System.out.println("New Balance: " + nbal);
                                    //Save File
                                }
                                System.out.println(" ");
                                System.out.println("Thank you for using this Services");
                                break;
                            case 5:
                                int paycomms;
                                String compname;
                                String paypurpose;
                                double payamt;
                                System.out.println(" >> [PAYMENTS] <<");
                                System.out.println("You can pay the following purposes");
                                System.out.println("---");
                                System.out.println(" ===[Purposes]=== ");
                                System.out.println("[1] - Utilities");
                                System.out.println("[2] - Pay Bills");
                                System.out.println("[3] - Pay Loans");
                                System.out.println("---");
                                System.out.print("Command: ");
                                paycomms = Integer.parseInt(coms.readLine());
                                System.out.println(" ");
                                switch (paycomms)
                                {
                                    case 1:
                                        int utilp;
                                        System.out.println(" >> [PAYMENTS: UTILITIES] <<");
                                        System.out.println(" ===[Utilities Services]=== ");
                                        System.out.println("[1] - Electrcity");
                                        System.out.println("[2] - Water");
                                        System.out.println("[3] - Internet");
                                        System.out.println("---");
                                        System.out.print("Command: ");
                                        utilp = Integer.parseInt(coms.readLine());
                                        System.out.println(" ");
                                        switch(utilp)
                                        {
                                            case 1:
                                                System.out.println(" >> [UTILITIES: Electricity] <<");
                                                System.out.println("Please enter the company name and amount of paymant");
                                                System.out.println("Please enter the specific purposes for paymant");
                                                System.out.println("---");
                                                System.out.print("Company: ");
                                                compname = coms.readLine();
                                                System.out.print("Purpose: ");
                                                paypurpose = coms.readLine();
                                                System.out.print("Amount : ");
                                                payamt = Double.parseDouble(coms.readLine());
                                                System.out.println(" ");
                                                if (bal < payamt)
                                                {
                                                    System.out.println(" >> [TERMINATED] <<");
                                                    System.out.println("Services has been Terminated");
                                                    System.out.println("---");
                                                    System.out.println("Reason: Not Enough Balance");
                                                    //Save File
                                                }
                                                else
                                                {
                                                    nbal = bal - payamt;
                                                    System.out.println(" >> [SUCCESS] << ");
                                                    System.out.println("You paid the amount of PHP " + payamt + " for electricity");
                                                    System.out.println("---");
                                                    System.out.println("Company: " + compname);
                                                    System.out.println("Purpose: " + paypurpose);
                                                    System.out.println("Amount : " + payamt);
                                                    System.out.println("---");
                                                    System.out.println("New Balance: " + nbal);
                                                    //Save File
                                                }
                                                break;
                                            case 2:
                                                System.out.println(" >> [UTILITIES: Water] <<");
                                                System.out.println("Please enter the company name and amount of paymant");
                                                System.out.println("Please enter the specific purposes for paymant");
                                                System.out.println("---");
                                                System.out.print("Company: ");
                                                compname = coms.readLine();
                                                System.out.print("Purpose: ");
                                                paypurpose = coms.readLine();
                                                System.out.print("Amount : ");
                                                payamt = Double.parseDouble(coms.readLine());
                                                System.out.println(" ");
                                                if (bal < payamt)
                                                {
                                                    System.out.println(" >> [TERMINATED] <<");
                                                    System.out.println("Services has been Terminated");
                                                    System.out.println("---");
                                                    System.out.println("Reason: Not Enough Balance");
                                                    //Save File
                                                }
                                                else
                                                {
                                                    nbal = bal - payamt;
                                                    System.out.println(" >> [SUCCESS] << ");
                                                    System.out.println("You paid the amount of PHP " + payamt + " for water");
                                                    System.out.println("---");
                                                    System.out.println("Company: " + compname);
                                                    System.out.println("Purpose: " + paypurpose);
                                                    System.out.println("Amount : " + payamt);
                                                    System.out.println("---");
                                                    System.out.println("New Balance: " + nbal);
                                                    //Save File
                                                }
                                                break;
                                            case 3:
                                                System.out.println(" >> [UTILITIES: Internet] <<");
                                                System.out.println("Please enter the company name and amount of paymant");
                                                System.out.println("Please enter the specific purposes for paymant");
                                                System.out.println("---");
                                                System.out.print("Company: ");
                                                compname = coms.readLine();
                                                System.out.print("Purpose: ");
                                                paypurpose = coms.readLine();
                                                System.out.print("Amount : ");
                                                payamt = Double.parseDouble(coms.readLine());
                                                System.out.println(" ");
                                                if (bal < payamt)
                                                {
                                                    System.out.println(" >> [TERMINATED] <<");
                                                    System.out.println("Services has been Terminated");
                                                    System.out.println("---");
                                                    System.out.println("Reason: Not Enough Balance");
                                                    //Save File
                                                }
                                                else
                                                {
                                                    nbal = bal - payamt;
                                                    System.out.println(" >> [SUCCESS] << ");
                                                    System.out.println("You paid the amount of PHP " + payamt + " for internet");
                                                    System.out.println("---");
                                                    System.out.println("Company: " + compname);
                                                    System.out.println("Purpose: " + paypurpose);
                                                    System.out.println("Amount : " + payamt);
                                                    System.out.println("---");
                                                    System.out.println("New Balance: " + nbal);
                                                    //Save File
                                                }
                                                break;
                                            default:
                                                System.out.println(" >> [TERMINATED] <<");
                                                System.out.println("Services has been Terminated");
                                                System.out.println("---");
                                                System.out.println("Reason: Invalid Input");
                                                //save file
                                        }
                                        break;
                                    case 2:
                                        int paycat;
                                        System.out.println(" >> [PAYMENTS: PAY BILLS] <<");
                                        System.out.println(" ===[Services]=== ");
                                        System.out.println("[1] - School");
                                        System.out.println("[2] - Government");
                                        System.out.println("[3] - Insurance ");
                                        System.out.println("---");
                                        System.out.print("Command: ");
                                        paycat = Integer.parseInt(coms.readLine());
                                        System.out.println(" ");
                                        switch(paycat)
                                        {
                                            case 1:
                                                String School;
                                                long studID;
                                                System.out.println(" >> [PAY BILLS: School] <<");
                                                System.out.println("Please enter the school name and amount of paymant");
                                                System.out.println("Please enter the specific purposes for paymant");
                                                System.out.println("---");
                                                System.out.print("School    : ");
                                                School = coms.readLine();
                                                System.out.print("Student ID: ");
                                                studID = Long.parseLong(coms.readLine());
                                                System.out.print("Purpose   : ");
                                                paypurpose = coms.readLine();
                                                System.out.print("Amount    : ");
                                                payamt = Double.parseDouble(coms.readLine());
                                                System.out.println(" ");
                                                if (bal < payamt)
                                                {
                                                    System.out.println(" >> [TERMINATED] <<");
                                                    System.out.println("Services has been Terminated");
                                                    System.out.println("---");
                                                    System.out.println("Reason: Not Enough Balance");
                                                    //Save File
                                                }
                                                else
                                                {
                                                    nbal = bal - payamt;
                                                    System.out.println(" >> [SUCCESS] << ");
                                                    System.out.println("You paid the amount of PHP " + payamt + " for " + paypurpose);
                                                    System.out.println("---");
                                                    System.out.println("Company   : " + School);
                                                    System.out.println("Student ID: " + studID);
                                                    System.out.println("Purpose   : " + paypurpose);
                                                    System.out.println("Amount    : " + payamt);
                                                    System.out.println("---");
                                                    System.out.println("New Balance: " + nbal);
                                                    //Save File
                                                }
                                                break;
                                            case 2:
                                                String place;
                                                String province;
                                                System.out.println(" >> [PAY BILLS: Government] <<");
                                                System.out.println("Please enter the municipal/city, province and amount of paymant");
                                                System.out.println("Please enter the specific purposes for paymant");
                                                System.out.println("---");
                                                System.out.print("City/Province: ");
                                                place = coms.readLine();
                                                System.out.print("Province     : ");
                                                province = coms.readLine();
                                                System.out.print("Purpose      : ");
                                                paypurpose = coms.readLine();
                                                System.out.print("Amount       : ");
                                                payamt = Double.parseDouble(coms.readLine());
                                                System.out.println(" ");
                                                if (bal < payamt)
                                                {
                                                    System.out.println(" >> [TERMINATED] <<");
                                                    System.out.println("Services has been Terminated");
                                                    System.out.println("---");
                                                    System.out.println("Reason: Not Enough Balance");
                                                    //Save File
                                                }
                                                else
                                                {
                                                    nbal = bal - payamt;
                                                    System.out.println(" >> [SUCCESS] << ");
                                                    System.out.println("You paid the amount of PHP " + payamt + " for " + paypurpose);
                                                    System.out.println("---");
                                                    System.out.println("Government: " + place + ", " + province);
                                                    System.out.println("Purpose   : " + paypurpose);
                                                    System.out.println("Amount    : " + payamt);
                                                    System.out.println("---");
                                                    System.out.println("New Balance: " + nbal);
                                                    //Save File
                                                }
                                                break;
                                            case 3:
                                                System.out.println(" >> [PAY BILLS: Insurance] <<");
                                                System.out.println("Please enter the insurance company, province and amount of paymant");
                                                System.out.println("Please enter the specific purposes for paymant");
                                                System.out.println("---");
                                                System.out.print("Insurance Name: ");
                                                compname = coms.readLine();
                                                System.out.print("Purpose       : ");
                                                paypurpose = coms.readLine();
                                                System.out.print("Amount        : ");
                                                payamt = Double.parseDouble(coms.readLine());
                                                System.out.println(" ");
                                                if (bal < payamt)
                                                {
                                                    System.out.println(" >> [TERMINATED] <<");
                                                    System.out.println("Services has been Terminated");
                                                    System.out.println("---");
                                                    System.out.println("Reason: Not Enough Balance");
                                                    //Save File
                                                }
                                                else
                                                {
                                                    nbal = bal - payamt;
                                                    System.out.println(" >> [SUCCESS] << ");
                                                    System.out.println("You paid the amount of PHP " + payamt + " for " + paypurpose);
                                                    System.out.println("---");
                                                    System.out.println("Insurance Name: " + compname);
                                                    System.out.println("Purpose       : " + paypurpose);
                                                    System.out.println("Amount        : " + payamt);
                                                    System.out.println("---");
                                                    System.out.println("New Balance: " + nbal);
                                                    //Save File
                                                }
                                                break;
                                            default:
                                                System.out.println(" >> [TERMINATED] <<");
                                                System.out.println("Services has been Terminated");
                                                System.out.println("---");
                                                System.out.println("Reason: Invalid Input");
                                                 //save file  
                                        }
                                        break;
                                    case 3:
                                        System.out.println(" >> [PAYMENTS: LOANS] <<");
                                        System.out.println("Please enter the loan company name and amount of paymant");
                                        System.out.println("Please enter the specific purposes for paymant");
                                        System.out.println("---");
                                        System.out.print("Loan Company: ");
                                        compname = coms.readLine();
                                        System.out.print("Purpose     : ");
                                        paypurpose = coms.readLine();
                                        System.out.print("Amount      : ");
                                        payamt = Double.parseDouble(coms.readLine());
                                        System.out.println(" ");
                                        if (bal < payamt)
                                        {
                                            System.out.println(" >> [TERMINATED] <<");
                                            System.out.println("Services has been Terminated");
                                            System.out.println("---");
                                            System.out.println("Reason: Not Enough Balance");
                                            //Save File
                                        }
                                        else
                                        {
                                            nbal = bal - payamt;
                                            System.out.println(" >> [SUCCESS] << ");
                                            System.out.println("You paid the amount of PHP " + payamt + " for internet");
                                            System.out.println("---");
                                            System.out.println("Loan Company: " + compname);
                                            System.out.println("Purpose     : " + paypurpose);
                                            System.out.println("Amount      : " + payamt);
                                            System.out.println("---");
                                            System.out.println("New Balance: " + nbal);
                                            //Save File
                                        }
                                        break;
                                    default:
                                        System.out.println(" >> [TERMINATED] <<");
                                        System.out.println("Services has been Terminated");
                                        System.out.println("---");
                                        System.out.println("Reason: Invalid Input");
                                        //save file
                                }
                                System.out.println(" ");
                                System.out.println("Thank you for using this Services");
                                break;
                            case 6:
                                int opinv;
                                int npinno2;
                                int nppinv;
                                System.out.println(" >> [PIN CHANGE] <<");
                                System.out.println("Please Enter Your Old Pin no.");
                                for (int k = 1; k <=3; k++)
                                {
                                    System.out.println("---");
                                    System.out.print("PIN No.: ");
                                    opinv = Integer.parseInt(coms.readLine());
                                    System.out.println(" ");
                                    if (opinv == mypin)
                                    {
                                        System.out.println("Please Enter your new PIN no.");
                                        System.out.println("---");
                                        System.out.print("PIN no.: ");
                                        npinno2 = Integer.parseInt(coms.readLine());
                                        System.out.println(" ");
                                        System.out.println(" >> [PIN VERIFICATION] <<");
                                        System.out.println("Please verify your new PIN no.");
                                        System.out.println("---");
                                        for (int l = 1; l <= 3; l++)
                                        {
                                            System.out.print("PIN no.: ");
                                            nppinv = Integer.parseInt(coms.readLine());
                                            System.out.println(" ");
                                            if (nppinv == npinno2)
                                            {
                                                System.out.println(" >> [SUCCESS] <<");
                                                System.out.println("Your PIN No. has been changed");
                                                //Save File
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println(" >> [ERROR] << ");
                                                System.out.println("Wrong PIN No.");
                                                System.out.println(" ");
                                                if (l == 3)
                                                {
                                                    System.out.println(" >> [TERMINATED] << ");
                                                    System.out.println("PIN Change has been Terminated");
                                                    System.out.println("---");
                                                    System.out.println("Reason: Attempt Limit has been Reached");
                                                    System.out.println("Thank you for using this Services");
                                                    break;
                                                }
                                                else
                                                {
                                                    System.out.println ("Please Try Again");
                                                    System.out.println ("Attempts: " + l + "/3");
                                                    System.out.println (" ");
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println(" >> [DENIED] << ");
                                        System.out.println("Wrong PIN No.");
                                        System.out.println(" ");
                                        if (k == 3)
                                        {
                                            System.out.println(" >> [TERMINATED] <<");
                                            System.out.println("Sign In has been Terminated");
                                            System.out.println("---");
                                            System.out.println("Invalid PIN Number and maximum attempt limit has reached");
                                            System.out.println("Thank you for using this Services");
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("Please Try Again");
                                            System.out.println("Attempts: " + k + "/3");
                                            System.out.println(" ");
                                        } 
                                    }
                                }
                                break;
                            case 7:
                                System.out.println(" >> [SIGN OUT] <<");
                                System.out.println("Thank you for using this Services");
                                break;
                            default:
                                System.out.println(" >> [ERROR 404] << ");
                                System.out.println("Thank you for using this Services");
                                break;
                        }
                        break;
                    }
                    else
                    {
                        System.out.println(" >> [DENIED] << ");
                        System.out.println("Wrong PIN No.");
                        System.out.println(" ");
                        if (j == 3)
                        {
                            System.out.println(" >> [TERMINATED] <<");
                            System.out.println("Sign In has been Terminated");
                            System.out.println("---");
                            System.out.println("Invalid PIN Number and maximum attempt limit has reached");
                            System.out.println("Thank you for using this Services");
                            break;
                            
                        }
                        else
                        {
                            System.out.println("Please Try Again");
                            System.out.println("Attempts: " + j + "/3");
                            System.out.println(" ");
                        }
                    }
                }
                break;
            default:
                System.out.println(" >> [TERMINATED] <<");
                System.out.println("Services has been Terminated");
                System.out.println("---");
                System.out.println("Reason: Invalid Input");
                System.out.println(" ");
                System.out.println("Thank you for using this Services");
        }
    }
}
