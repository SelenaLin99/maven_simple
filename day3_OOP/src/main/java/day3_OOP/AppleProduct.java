package day3_OOP;

interface AppleProduct {
	public void product();
	public void pricing();

}
class Iphone implements AppleProduct{
	public void product() {
		System.out.println("Product is Iphone 13 Pro");
	}

	public void pricing() {
		// TODO Auto-generated method stub
		System.out.println("Pricing is $999");	
	}
}
class Mac implements AppleProduct{
	public void product() {
		System.out.println("Product is MacBook Pro");
	}

	public void pricing() {
		// TODO Auto-generated method stub
		System.out.println("Pricing is $1299");	
	}
}