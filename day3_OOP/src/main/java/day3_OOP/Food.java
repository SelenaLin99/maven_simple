package day3_OOP;

class Food {

	public String name = "Pocky";
	public String countryOrigin = "Japan";
	public String type;
	Food(String type){
		this.type = type;
	}
	public String getDetails() {
		return "name: " + name + " country of origin: " + countryOrigin;
	}

}
class Snack extends Food{
	
	Snack(){
		super("Snack");
	}
	public String getDetails() {
		String foodDetails = super.getDetails();
		
		return foodDetails + " " + super.type;
	}
	
}
