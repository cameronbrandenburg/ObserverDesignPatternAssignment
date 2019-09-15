package csce247.assignments.observer;

/**
 * @author Cameron Brandenburg
 * Observes the subject and updates when a warning is seen
 */
public interface Observer {
	/**
	 * Updates the observer based on a warning
	 * @param warning The type of warning used to update the observer (1 or 2)
	 */
	public void update(int warning);

}
