package edu.ejercicio4ED;

import java.util.Scanner;
/*
 * clase principal
 * @author amd-101123
 */
public class ejercicio4ED 
{
	/*
	 * metodo principal
	 * @author amd-101123
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("escribe un double");
		double i = scan.nextDouble();	
		System.out.println("escribe un double");
		double j = scan.nextDouble();	
		System.out.println("escribe un double");
		double k = scan.nextDouble();	
		if (i>=j & i>=k)
        {
            if (j >= k)
            {
            	System.out.println("Orden: " + i + j + k);
            }
            else
            {
            	System.out.println("Orden: " + i + k + j);
            }
        }else if (j>=i & j>=k)
        {
            if (i >= k)
            {
            	System.out.println("Orden: " + j + i + k);
            }
            else
            {
            	System.out.println("Orden: " + j + k + i);
            }
        } else if (k>=i & k>=j)
        {
            if (i >= j)
            {
            	System.out.println("Orden: " + k + i + j);
            }
            else
            {
            	System.out.println("Orden: " +k + j + i);
            }
        }
       	
	}
}
	


