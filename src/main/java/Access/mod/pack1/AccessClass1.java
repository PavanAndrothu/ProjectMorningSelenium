package Access.mod.pack1;

public class AccessClass1 {

	public String name = "XYZ";
	
	public void printName() {
		System.out.println(123);
	}
	
	public static void main(String[] args) {
		System.out.println(new AccessClass1().name);
		new AccessClass1().printName();

	}

}
