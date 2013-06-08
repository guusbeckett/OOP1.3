package H20;

import javax.swing.JOptionPane;

public class ex11
{
	/** Main method */
	  public static void main(String[] args) {
	    // Prompt the user to enter an integer
	    String intString = JOptionPane.showInputDialog(
	      "Vul een positief getal in: ");

	    // Convert string into integer
	    int n = Integer.parseInt(intString);
	    // Display 
	    JOptionPane.showMessageDialog(null,
	      "Als alle cijfers uit het getal " + n + " bijelkaar opgeteld worden krijg je: " + sum(n));
	  }

	  /** Return the sum of the digits for a specified number */
	  static int sum(int n) {
		  return n == 0 ? 0 : n % 10 + sum(n/10);
			}
}