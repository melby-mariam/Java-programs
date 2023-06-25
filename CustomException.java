package lab22;

import java.util.Scanner;
import java.lang.*;
class Account {
int AccountNo;
String Accountname,Accounttype;
double balance;
void showaccount()
{
System.out.println("Account Number : "+AccountNo);
System.out.println("Name : "+Accountname);
System.out.println("Type of Account : "+Accounttype);
System.out.println("Balance : "+balance);
}
void openaccount()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the account details : ");
System.out.println("Enter the Name of Account Holder : ");
Accountname=s.next();
System.out.println("Enter the Account number : ");
AccountNo=s.nextInt();
System.out.println("Enter the type of the account : ");
Accounttype=s.next();
System.out.println("Enter the balance in the account: ");
balance=s.nextDouble();
}
int SearchAccount(int num)
{
if(AccountNo==num)
{
return 1;
}
else
return 0;
}
void DepositAmount()
{
Scanner s=new Scanner(System.in);
try
{
System.out.println("Enter the amount to be deposited : ");
double amount=s.nextDouble();
if(amount<=0)
{
throw new InvalidAmountException("Amount should be greater than zero!!");
}
balance=balance+amount;
System.out.println(amount+" deposited");
System.out.println("Renewed Balance : "+balance);
}
catch(InvalidAmountException e)
{
System.out.println("InvalidAmountException: "+e.getmessage());
}
}
void WithdrawAmount()
{
Scanner s=new Scanner(System.in);
try
{
System.out.println("Enter the amount to withdraw : ");
double amount=s.nextDouble();
if(amount>balance)
{
throw new InsufficientFundsException("Amount greater than Balance!!");
}
if(amount<=0)
{
throw new InvalidAmountException("Amount should be greater than zero!!");
}
balance=balance-amount;
System.out.println(amount+" withdrawn");
System.out.println("Renewed Balance : "+balance);
}
catch(InvalidAmountException e)
{
System.out.println("InvalidAmountException : "+e.getmessage());
}
catch(InsufficientFundsException e)
{
System.out.println("InsufficientFundsException : "+e.getmessage());
}
}
}
public class CustomException {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int choice,num,i,n,flag=0;
System.out.println("Enter the Number of Accounts : ");
n=s.nextInt();
Account[] a=new Account[n];
for(i=0;i<n;i++)
{
a[i]=new Account();
}
while(true)
{
System.out.println("\nEnter your choice : \n1.Create an account\n2.Display all account details\n3.Search by account number\n4.Deposit the amount\n5.Withdraw the amount\n6.exit");
choice=s.nextInt();
switch(choice)
{
case 1 : for(i=0;i<n;i++)
{
a[i].openaccount();
}
break;
case 2 :for(i=0;i<n;i++)
{
a[i].showaccount();
}
break;
case 3 :System.out.println("Enter the account number to be searched : ");
num=s.nextInt();
flag=0;
for(i=0;i<n;i++)
{
if(a[i].SearchAccount(num)==1)
{
System.out.println("Account is Valid");
flag=1;
a[i].showaccount();
break;
}
}
if(flag==0)
System.out.println("Invalid AccountNumber!!");
break;
case 4 :System.out.println("Enter the Account number : ");
num=s.nextInt();
flag=0;
for(i=0;i<n;i++)
{
if(a[i].AccountNo==num)
{
System.out.println("Account is Valid");
flag=1;
a[i].showaccount();
a[i].DepositAmount();
break;
}
}
if(flag==0)
{
System.out.println("Invalid AccountNumber!!");
}
break;
case 5 :System.out.println("Enter the Account number : ");
num=s.nextInt();
flag=0;
for(i=0;i<n;i++)
{
if(a[i].AccountNo==num)
{
System.out.println("Account is Valid");
flag=1;
a[i].showaccount();
a[i].WithdrawAmount();
break;
}
}
if(flag==0)
{
System.out.println("Invalid AccountNumber!!");
}
break;
case 6 : System.exit(0);
break;
default : System.out.println("Wrong choice!!");
break;
}
}
}
}