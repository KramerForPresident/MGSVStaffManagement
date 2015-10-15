import java.util.ArrayList;


public class StaffManagement {

	/**
	 * Class tests Unit and Soldier objects
	 */
	public static void main(String[] args) {
		Soldier.totalNum = 0;
	//	ArrayList<Soldier>allSoldiers = new ArrayList<Soldier>();
		
		
		
		Unit u1 = new Unit("Waiting Room");
		Unit u2 = new Unit("Combat Unit");
		Unit u3 = new Unit("R&D Team");
		Unit u4 = new Unit("Intel Team");
		Unit u5 = new Unit("Medical Team");
		Unit u6 = new Unit("Sickbay");
		Unit u7 = new Unit("Brig");
		
		Soldier s1 = new Soldier("Slapjack Tuna", u1);
		Soldier s2 = new Soldier("Bastard Bunny", u1);
		Soldier s3 = new Soldier("Plaid Panther", u1);
		Soldier s4 = new Soldier("Raging Cow", u1);
		Soldier s5 = new Soldier("Lonely Raptor", u1);
		Soldier s6 = new Soldier("Strange Toucan", u1);
		
		
		s1.moveTo(u2);
	
		
		u1.printSoldiers();
		System.out.println("\n\n\n");
		u2.printSoldiers();


		
	}

}
