 
import javax.swing.JFileChooser;
import java.io.File;
import java.util.Scanner;

public class DirectorySize {
  public static void main(String[] args) {
    // Prompt the user to enter a directory:
   // System.out.print("Enter a directory or a file: ");    
    //Scanner input = new Scanner(System.in);
    //String directory = input.nextLine();
    
    // Display the size
    //System.out.println(getSize(new File(directory)) + " bytes");
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    fileChooser.showOpenDialog(null);
    File directory = fileChooser.getSelectedFile(); 
    System.out.println(getSize(directory) + " bytes");
  }

  public static long getSize(File file) {
    long size = 0; // Store the total size of all files

    if (file.isDirectory()) {
      File[] files = file.listFiles(); // All files and subdirectories
      for (int i = 0; i < files.length; i++) {
        size += getSize(files[i]); // Recursive call
      }
    }
    else { // Base case
      size += file.length();
    }

    return size;
  }
}
