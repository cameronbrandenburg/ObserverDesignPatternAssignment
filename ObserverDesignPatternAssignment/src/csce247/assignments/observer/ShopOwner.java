package csce247.assignments.observer;

/**
 * @author Cameron Brandenburg
 * A new type of Observer that is a shop owner
 */
public class ShopOwner implements Observer{
	/**
	 * Creates a private instance of a Subject to observe
	 */
	private Subject watchman;
	
	/**
	 * Constructor that registers ShopOwner to observe Watchman
	 * @param watchman The Subject created above
	 */
	public ShopOwner(Subject watchman) {
		watchman.registerObserver(this);
	}
	
	/**
	 * Prints out the warning based on an int passed in
	 * @param warning The int that decides which warning to give
	 */
	public void update(int warning) {
		if (warning == 1)
			System.out.println("Shop Owner: Close down shop and head home");
		else if (warning == 2)
			System.out.println("Shop Owner: Drops everything and find nearest hideout");
	}
	
}
