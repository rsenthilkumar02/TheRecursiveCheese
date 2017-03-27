import java.util.ArrayList;

/**
 * The Child class uses child name, number of points, an arraylist of chores,
 * and an arraylist of the rewards the child can unlock.
 */
public class Child {
	// Data
	String childName;
	int points;
	public ArrayList<Chore> chores = new ArrayList<Chore>();
	public ArrayList<Reward> rewards = new ArrayList<Reward>();

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
	public Child(String Name, int Points) {
		childName = Name;
		points = Points;
		chores = new ArrayList<Chore>();
		rewards = new ArrayList<Reward>();
		/**
		 * Creates a child with a name, number of point, and an arraylist of
		 * chores
		 */
	}
	public Child(){
		/**
		 * Creates a child with
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
		return chores;
		/**
		 * @return the list of chores assigned to the child
		 */
	}
	public ArrayList getRewards() {
		return rewards;
		/**
		 * @return the list of chores the child can unlock
		 */}
	

	public void setName(String name) {
		childName = name;
		/**
		 * Updates the child's name
		 */
	}
}
