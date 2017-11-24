import java.util.ArrayList;
import java.util.List;

interface Map<K,V>{
	
}

class CustomMap<K,V> implements Map<K,V>{
	
	List<K> key;
	List<V> value;
	
	
	void setKV(K k, V v)
	{
		key.add(k);
		value.add(v);
		
	}
	
	K getKey(V v)
	{
		return key.get(value.indexOf(v));
	}
	
	V getValue(K k)
	{
		return value.get(key.indexOf(k));
	}
}

public class ImplementMap {

	public static void main(String[] args) {

		CustomMap<Integer,String> map = new CustomMap<>();
		
		map.setKV(new Integer(1), new String("A"));
		System.out.println("Value is " + map.getValue(new Integer(1)));
		
	}
}
