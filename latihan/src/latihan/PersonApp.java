package latihan;

//class
public class PersonApp {
	public static void main(String[] args) {
		// menggunakan constructor
		var person1 = new Person("Julhen", "kijang");

		System.out.println(person1.name);
		System.out.println(person1.address);
		System.out.println(person1.country);

		// memanggil method
		// nama variable/dari objek titik nama method
//		person1.sayHello("budi");
//
//		var person2 = new Person("joko", "jakarta");
//		person2.sayHello("budii");
	}
}
