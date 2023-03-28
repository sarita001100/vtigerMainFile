package Godaddy;

public class SingletonClass {
	
	static SingletonClass st=new SingletonClass();
	private SingletonClass() {
		System.out.println("constructor invoke ");
	}
static	SingletonClass get() {
	System.out.println("hello");
	return st;
}
}

class test{
	public static void main(String[] args) {
		SingletonClass st1=SingletonClass.get();
		System.out.println(st1);
		
	}

}
