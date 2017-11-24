
class Box<T>{
	
	T t;
	
	public void setT(T t)
	{
		this.t = t;
	}
	
	public T getT()
	{
		return t;
	}
	
	public<U extends Number> void inspect(U u)
	{
		System.out.println("T is : " + t.getClass().getName() + " " + t);
		System.out.println("U is : " + u.getClass().getName() + " " + u);
	}
}

public class GenericsExtends {

	public static void main(String[] args) {
		
		Box<Integer> box = new Box<>();
		box.setT(new Integer(13));
		System.out.println(box.getT());
		box.inspect(new Double(46.66));
	}
}
