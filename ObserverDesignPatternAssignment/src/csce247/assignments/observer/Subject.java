package csce247.assignments.observer;

/**
 * @author Cameron Brandenburg
 * Subject that is observed by the Observer
 */
public interface Subject {
	/**
	 * Creates a new observer
	 * @param observer The new observer to be created
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * Removes an existing observer
	 * @param observer The observer to be removed
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * Notifies all observers of an event
	 */
	public void notifyObservers();
}
