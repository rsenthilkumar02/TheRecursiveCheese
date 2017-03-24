import java.util.ArrayList;

/**
 * The Child class uses child name, number of points, an arraylist of chores,
 * and an arraylist of the rewards the child can unlock.
 */
public class Child {
	// Data
	String childName;
	int points;
	ArrayList chore;
	ArrayList reward;

	/**
	 * 
	 * @param string value
	 *            of the child's name
	 * @param integer value
	 *            of points
	 * @param arraylist
	 *            of chores
	 * @param arraylist
	 *            of rewards
	 */
	// Constructor
	public Child(String Name, int Points, ArrayList Chore, ArrayList Reward) {
		childName = Name;
		points = Points;
		chore = Chore;
		reward = Reward;
		/**
		 * Creates a child with a name, number of point, and an arraylist of
		 * chores
		 */
	}
	public Child(){
		/**
		 * Creates a child with no parameters
		 */
	}


	public String getName() {
		return childName;
		/**
		 * @return the child's name
		 */
	}

	public int getPoints() {
		return points;
		/**
		 * @return the amount of points the child has
		 */
	}

	public ArrayList getChores() {
		return chore;
		/**
		 * @return the list of chores assigned to the child
		 */
	}

	public ArrayList getRewards() {
		return reward;
		/**
		 * @return the list of chores the child can unlock
		 */
	}

	public void setName(String name) {
		childName = name;
		/**
		 * Updates the child's name
		 */
	}
}
