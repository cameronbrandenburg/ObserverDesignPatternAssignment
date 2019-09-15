package csce247.assignments.observer;

import java.util.ArrayList;

/**
 * @author Cameron Brandenburg
 * Inherits from Subject. Watchman updates observers on threats
 */
public class Watchman implements Subject{
	/**
	 * Private variable to use for the notifyObservers() method
	 * Had to use this to have notifyObservers() with no params and follow the UML
	 */
	private int warning;
	/**
	 * Private instance of an ArrayList to keep track of all observers registered
	 */
	private ArrayList<Observer> observers;
	
	/**
	 * Constructor for Watchman. Creates a new instance of an ArrayList of Observers
	 */
	public Watchman() {
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * Adds a new observer
	 * @param observer The new observer to be added
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * Removes an existing observer
	 * @param observer The observer to be removed
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * Notifies all Observers using the private instance variable warning
	 */
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(warning);
		}
	}
	
	/**
	 * Prints out how many trumpets were played
	 * @param warning Determines how many trumpets are played
	 */
	public void issueWarning(int warning) {
		// Using 2 spaces between warning and message to match with output.txt provided
		if (warning == 1)
			System.out.println("WARNING:  1 trumpet was played!");
		else if (warning == 2)
			System.out.println("WARNING:  2 trumpets were played!");
		this.warning = warning;
		notifyObservers();
	}

}
