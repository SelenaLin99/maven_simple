package day3_OOP;

abstract class SocialPlatform {
	
	public void avaliablity() {
		System.out.println("It is avaliable on web, Ios, and Android");
	}
	public abstract void icon();

}
class Facebook extends SocialPlatform{
	public void icon() {
		System.out.println("Facebook icon has a letter f");
	}
}
