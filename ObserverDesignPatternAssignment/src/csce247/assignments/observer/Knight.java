package csce247.assignments.observer;

/**
 * @author Cameron Brandenburg
 * A new type of Observer that is a knight
 */
public class Knight implements Observer {
	/**
	 * Creates a private instance of a Subject to observe
	 */
	private Subject watchman;
	
	/**
	 * Constructor that registers Knight to observe Watchman
	 * @param watchman The Subject created above
	 */
	public Knight(Subject watchman) {
		watchman.registerObserver(this);
	}
	
	/**
	 * Prints out the warning based on an int passed in
	 * @param warning The int that decides which warning to give
	 */
	public void update(int warning) {
		if (warning == 1)
			System.out.println("Knight: Helps everyone get home safe");
		else if (warning == 2)
			System.out.println("Knight: Prepares for battle");
	}
}
