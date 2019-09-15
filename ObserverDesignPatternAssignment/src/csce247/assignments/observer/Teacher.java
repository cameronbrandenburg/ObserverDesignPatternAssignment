package csce247.assignments.observer;

/**
 * @author Cameron Brandenburg
 * A new type of Observer that is a teacher
 */
public class Teacher implements Observer {
	/**
	 * Creates a private instance of a Subject to observe
	 */
	private Subject watchman;
	
	/**
	 * Constructor that registers Teacher to observe Watchman
	 * @param watchman The Subject created above
	 */
	public Teacher(Subject watchman) {
		watchman.registerObserver(this);
	}
	
	/**
	 * Prints out the warning based on an int passed in
	 * @param warning The int that decides which warning to give
	 */
	public void update(int warning) {
		if (warning == 1)
			System.out.println("Teacher: Helps get every kid home safe");
		else if (warning == 2)
			System.out.println("Teacher: Brings all students to the underground shelter");
	}
}
