package bergerson.FACTORY;

//Import necessary modules
import java.util.TreeMap;

import bergerson.DROID.SentryDroid_B;

//Sentry_BFactory class (subclass, extends DroidFactory)
public class Sentry_BFactory extends DroidFactory {
	
	//Data fields
	public static int buildCount = 0;
	
	//Constructor
	public Sentry_BFactory(String iDNumber) {
		super(iDNumber, "Alpha Droids");	
	}

	//Implemented methods (DroidFactory)
	//name: displayInfo
	//method: displays iDNumber and type
	//input: none
	//output: void
	@Override
	public void displayInfo() {
		System.out.println("Droid Factory ID: "+this.getiDNumber());
		System.out.println("Droid Factory Builds: "+this.getBuildType());
		
	}
	
	//Behaviors: instance methods
	//name: buildDroids_A
	//method: builds specified number of Sentry Droid As
	//input: int (number to build)
	//output: TreeMap<String, SentryDroid_A> (all built droids)
	public TreeMap<String, SentryDroid_B> buildDroids_B(int count){		
		//initialize map to hold new droids
		TreeMap<String, SentryDroid_B> droidMap = new TreeMap<String, SentryDroid_B>();
		//build new droids until count reaches zero
		String droidID;
		while (count > 0) {	
			buildCount++;
			count--;
			droidID = "B"+buildCount;
			//add each new droid with iD to map
			droidMap.put(droidID, new SentryDroid_B(droidID));
		}	
		//return map with all droids
		return droidMap;
			
	}

	//Accessors and mutators
	public static int getBuildCount() {
		return buildCount;
	}

	public static void setBuildCount(int buildCount) {
		Sentry_AFactory.buildCount = buildCount;
	}	

}