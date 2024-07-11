package examplesOfEclipseShortcuts;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Delete this commit, it is being used to test a pull request

// CTRL + Space + L : A list will pop up with all eclipse hot-keys

public class Main {

	/*
	 * CTRL + Space : It brings up a menu where you can select the Main method for
	 * the file to make it runnable.
	 */
	public static void main(String[] args) {

		// type "Sysout" then hit CTRL + Space : to auto complete System.out.println();
		System.out.println();

		// CTRL + Shift + X : Makes the text upper case
		System.out.println("HELLOWORLD!");

		// CTRL + Shift + Y : Makes the text upper case
		System.out.println("helloworld!"); 
		
		// CTRL + Shift + O : Import statements are added automatically 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * Testing Chosen shortcuts by me: CTRL + Shift + / : Creates a comment block
		 * CTRL + Shift + P : It takes your cursor to the ending bracket of the section
		 * your cursor is currently on. 
		 * CTRL + “+” : Zoom In
		 * CTRL + “-” : Zoom In
		 */

	}
}
