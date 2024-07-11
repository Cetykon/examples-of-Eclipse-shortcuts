package examplesOfEclipseShortcuts;

// CTRL + Shift + F  : Your code will be formatted automatically by the IDE.
// CTRL + L : Opens a menu where you can type the number of a code line that you want to jump to.  
// CTRL + Shift + Down-arrow : This jumps you down to the next method in the code line.  

public class User {

	private int id;
	// Double click on Variable then ALT + Shift + R : This will allow you to rename a variable while updating all instances where it is used.  
	private String newName;

	// CTRL + Space : It brings up a menu where you can select a class constructor.
	public User() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * On the menu bar select “Source>Generate Constructor using Fields...” : A menu
	 * will pop up with the current class variables that you can then select to
	 * generate a constructor
	 */
	public User(int id, String name) {
		super();
		this.id = id;
		this.newName = name;
	}

	/*
	 * On the menu bar select “Source>Generate Getters/Setters” : A menu will pop up
	 * with the current class variables that you can then select to generate getters
	 * and setters.
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return newName;
	}

	public void setName(String name) {
		this.newName = name;
	}

}
