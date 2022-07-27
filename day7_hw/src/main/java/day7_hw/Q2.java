package day7_hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		 2) Write an example for Comparable and Comparator.
		Ostrich o1 = new Ostrich("3",360);
		Ostrich o2 = new Ostrich("1",340);
		Ostrich o3 = new Ostrich("2",348);
		
		List <Ostrich> ostriches = new ArrayList<Ostrich>();
		ostriches.add(o1);
		ostriches.add(o2);
		ostriches.add(o3);
		
		Collections.sort(ostriches);
		
		for(Ostrich o: ostriches) {
			System.out.println(o.getId() + " " + o.getWeight()  );
		}
		
		Collections.sort(ostriches, new WeightComparator());
		
		for(Ostrich o: ostriches) {
			System.out.println(o.getWeight() + " " + o.getId());
		}




	}

}

class Ostrich implements Comparable<Ostrich>{
	

	public Ostrich(String id, int weight) {
		super();
		this.id = id;
		this.weight = weight;
	}


	private String id;
	private int weight;
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int compareTo(Ostrich o) {
		return this.id.compareTo(o.getId());
	}
}

class WeightComparator implements Comparator<Ostrich>{
	@Override
	public int compare(Ostrich o1, Ostrich o2) {
		if(o1.getWeight() > o2.getWeight()) {
			return 1;
		}
		if(o1.getWeight() < o2.getWeight()) {
			return -1;
		}
		return 0;
	}
	
}
