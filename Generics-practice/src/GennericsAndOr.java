
interface Animal{
	
}

interface Mammal{
	
}

class Dog implements Animal, Mammal{
	
}

class Cat implements Animal{
	
}

class Test<T extends Animal & Mammal>{

	private T t;
	
	void setT(T t)
	{
		this.t= t;
	}
	
	T getT()
	{
		return t;
	}
	
}

public class GennericsAndOr {
	
	public static void main(String[] args) {

		Test<Dog> test = new Test<>();
		test.setT(new Dog());
		System.out.println(test.getT());
		
//		Test<Cat> test = new Test<>();
//		test.setT(new Cat());
//		System.out.println(test.getT());
	}

}
