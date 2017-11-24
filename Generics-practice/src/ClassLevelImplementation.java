

import java.util.Arrays;
import java.util.List;

class Util1<T,E,A,B> {

	public void printItems(List<T> list) {

	}

	
	public E reflect(E e) {
		return e;
	}

	public B m(A a, B b) {
		return b;
	}

}

public class ClassLevelImplementation {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello", "hey");
		Util1<String, String, String,Integer> util = new Util1<>();
		util.printItems(list);

		System.out.println(util.reflect("hello"));
		//System.out.println(util.reflect(123));

		System.out.println(util.m("hello", 123));
		//System.out.println(util.m(123, "hello"));
	}

}