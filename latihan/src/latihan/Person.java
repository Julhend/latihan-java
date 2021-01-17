package latihan;
//object

public class Person {
	// field
	String name;
	String address;
	final String country = "indonesia";

	// constructor - method yang akan dipanggil ketika objek pertama kali dibuat
	// nama harus sama dengan class
	Person(String paramName, String paramAddress) {
		name = paramName;
		address = paramAddress;
	}

	// constructor overloading
	Person(String paramName) {
		name = paramName;
	}

	// constructor overloading
	Person() {

	}

	// method
	// menggunakan void karena tidak mengembalikan data apapun
	void sayHello(String paramName) {
		System.out.println("Hello " + paramName + " My name is " + name);
	}
}
