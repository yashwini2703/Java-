package dsa;

import java.util.Scanner;
public class queue {
	    public static void main(String args[])   
	    {   
	    	Scanner obj=new Scanner(System.in);
	    System.out.println("Enter First number");
	     int a=obj.nextInt();
	     System.out.println("Enter Second number");
	     int b=obj.nextInt();
	     int c=obj.nextInt();
	   int res= (a>b)?((a>c)?a:c):(b>c)?b:c;
	    System.out.println(res);
	      }
	    }




