
public class Soldier {
	private String name;
	public static int totalNum;
	
	private int id; //soldier id, doesn't change once initialized
	
	//status values
	private boolean alive;
	private boolean sick;
	private boolean trouble;
	
	
	public Unit currentUnit;
	
	//skill values
	private int combat;
	private int rd;
	private int intel;
	private int medic;
	
	
	
	//custom constructor for testing
	public Soldier(String n, int d, int ndx, boolean a, boolean s, boolean tr, Unit u, int com, int rand, int tel, int med){
		name = n;
		id = d;
		alive = a;
		sick = s;
		trouble = tr;
		currentUnit = u;
		
		combat = com;
		rd = rand;
		intel = tel;
		medic = med;
	}
	
	
	
	
	//"Proper" constructor. When soldiers are ordinarily procured, they will be sent to this one
	public Soldier(String n, Unit u){
		//name will equal name generator method. temp name below
		name = n;
		totalNum++;
		id = totalNum;
		alive = true;
		sick = false;
		trouble = false;
		currentUnit = u;
		this.moveTo(u);
		
		combat = randomStat();
		rd = randomStat();
		intel = randomStat();
		medic = randomStat();
		
		
		//need to figure out how to automatically assign to Waiting room
	}
	
	
	
	
	public void moveTo(Unit u){
		
		//remove this soldier from its current unit
		this.currentUnit.removeSoldier(this);
		
		//add soldier to the arraylist of the new unit
		u.addSoldier(this);
		
		//just change the unit attribute for the soldier
		this.currentUnit = u;
	}
	
	
	public void printInfo(){
		System.out.println("" + name + "\t\tCombat: " + combat + "\tR&D: " + rd +"\t\tIntel: " + intel + "\tMedical: " + medic); 
	}
	
	public int randomStat(){
		return (int) Math.floor((Math.random()*100) + 1);
	}
	
	public void autoAssign(){
		//add something here later
	}
	
	
	
	
	
	//get and set methods
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	
	public int getID(){
		return id;
	}
	public void setID(int i){
		id = i;
	}
	
	
	
}
