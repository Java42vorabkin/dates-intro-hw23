package telran.util.time;

// It is the example of possible pattern Factory implementation
public class AbcExample {
	private static int currentInstanceNumber = 0;
	public final static int max_instance_number = 4; 
	// It is allowed to create not more than 5 instances
	private int instanceNumber;
	private String instanceNames[] = {"First", "Second", "Third", "Forth", "Fifth"};
	
	public static AbcExample createNewInxtance() {
		if(currentInstanceNumber > max_instance_number) {
			// If allowed amount of instances is already created
			// then null is returned
			return null;
		}
		return new AbcExample();
	}
	private AbcExample() {
		instanceNumber = currentInstanceNumber++;
	} 
	public String getInstanceName() {
		return instanceNames[instanceNumber];
	}
	public int getInstanceNumber() {
		return instanceNumber;
	}
}
