/*class Person {
	String name;
	int number;

	void speak() {
		System.out.println("sfioasdfo;iads");
	}

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "kalyan";
		p1.number = 25;
		p1.speak();
		System.out.println(p1.name);
		Person p2 = new Person();

		p2.name = "pavan";
		p2.number = 20;
		System.out.println(p2.name);
		System.out.println(p2.number);
	}

}*/

/*class Person {
	String name;
	int value;

	void speak() {
		System.out.println("Myname is :" + name);
	}

	
	int getValue() {
		return value;
		
	}
}

class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "raman";
		p1.value = 20;
		p1.speak();
		
		
	int kalyan	=p1.getValue();
		System.out.println(kalyan);
	}
	
}*/
 
class Robot{
	void spek(String text){
		System.out.println(text);
	}
	
	public void jumping (int height){
		System.out.println("ncknadkladk: "+ height);
	}
	
	public void move(String direction,double distance){
		System.out.println("djkjdf " + direction + " "+ distance);
	}
}

public class App{
	
	public static void main(String[] args) {
		Robot r = new Robot();
		r.spek("Hello");
		r.jumping(7);
		r.move("west",12.00);	
	}
}
