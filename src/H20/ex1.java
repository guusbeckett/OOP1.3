package H20;


import java.math.BigInteger;

import javax.swing.JOptionPane;

public class ex1 
{
	
	 /** Main method */
	  public static void main(String[] args) {
	    // Prompt the user to enter an integer
	    String intString = JOptionPane.showInputDialog(
	      "Vul een positief getal in:");

	    // Convert string into integer
	    BigInteger n = new BigInteger(intString);
	    
	    
	    // Display factorial
	    JOptionPane.showMessageDialog(null,
	      "De factorial van " + n + " is " + factorial(n));
	  }

	  /** Return the factorial for a specified index */
	  static BigInteger factorial(BigInteger n) {
	    if (n == BigInteger.ZERO) // Stopping condition
	      return BigInteger.ONE;
	    else
	      return n.multiply(factorial(n.subtract(BigInteger.ONE)) ); // Call factorial recursively
	  }
}