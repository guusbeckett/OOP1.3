package H20;

import javax.swing.JOptionPane;

public class ex3 
{
	
	  /** Main method */
	  public static void main(String[] args) {
	    // Prompt the user to enter an integer
	    String intStringFirst = JOptionPane.showInputDialog(
	      "Vul het eerste getal in: ");
	    String intStringSecond = JOptionPane.showInputDialog(
	  	  "Vul het tweede getal in: ");

	    // Convert string into integer
	    int n = Integer.parseInt(intStringFirst);
	    int m = Integer.parseInt(intStringSecond);
	    // Display 
	    JOptionPane.showMessageDialog(null,
	      "De grootste gemene deler van " + n + " en " + m + " is " + gcd(n, m));
	  }

	  /** Return the gcd for two specified  numbers*/
	  static int gcd(int m, int n) {
		   if(m == n)
			      return m;
			   else if (m > n)
			      return gcd(m-n, n);
			   else
			      return gcd(m, n-m);
			}
	}