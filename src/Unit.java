import java.util.ArrayList;




public class Unit {
	private static int numUnits;
	private String name;
	private int max;
	private int size;
	private int level;
	private boolean active;
	private ArrayList<Soldier>soldiers = new ArrayList<Soldier>();
	
	
	
	//constructors
	
	public Unit(){
		name = null;
		max = 0;
		size = 0;
		level = 0;
		numUnits++;
		active = false;
	}
	
	//accepts parameters
	public Unit(String nm, int m, int n, int l, boolean a){
		name = nm;
		max = m;
		size = n;
		level = l;
		numUnits++;
		active = a;
	}
	
	//use this constructor
	
	public Unit(String nm){
		name = nm;
		max = 100;
		size = 0;
		level = 1;
		numUnits++;
		active = true;
	}
	
	
	
	//below are our add and remove methods, integral for the moveUnit method
	
	
	//add soldier method
	public void addSoldier(Soldier s){
		//easy. just add parameter soldier to this arraylist
		soldiers.add(s);
	}
	
	//remove soldier method. 
	public void removeSoldier(Soldier s){
		//a little trickier. we need to find the index of the parameter soldier,
		//first ensure that the soldier belongs to this unit
		int ind;
		if(s.currentUnit != this){
			return;
		}
		else{
			ind = getIndex(s);
			if(ind == -1){
				//error, no soldier in that list
				return;
			}
			else{
				//found index, now remove selected soldier from list
				soldiers.remove(ind);
			}
		}
		
		
	}
	
	//interior method. should only be called from remove soldier function from within class
	private int getIndex(Soldier s){
		if(s.currentUnit != this){
			return -1; //invalid
		}
		else{
			for(int i = 0; i < soldiers.size(); i++){
				if(s.getID() == soldiers.get(i).getID()){
					//ids match, must be same soldier. return index
					return i;
				}
			}
			return -1;
		}
	}
	
	public void printSoldiers(){
		size = soldiers.size();
		System.out.print(name + "    " + size + "/" + max + "\n---------------------------------------------------------------------------------------\n" );
		for(int i = 0; i < size; i++){
			soldiers.get(i).printInfo();
		}
		System.out.println("---------------------------------------------------------------------------------------");
		
	}
	
	
	//public void calcLevel
	
	
	
	//get and set methods
	
	public String getName(){
		return name;
	}
	
	public void setName(String s){
		name = s;
	}
	
	
	public int getMax(){
		return max;
	}
	
	public void setMax(int s){
		max = s;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int s){
		size = s;
	}
	
	public int getLeve(){
		return level;
	}
	
	public void setLevel(int s){
		level = s ;
	}
	
	public boolean getActive(){
		return active;
	}
	
	public void setActive(boolean s){
		active = s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
