package newcomer_trials;

import java.util.concurrent.ConcurrentHashMap;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		map.put(0, "Basics");
		map.put(1, "Strong");
		System.out.println(map);
		map.put(0, "Tech");
		System.out.println(map);
		//map.remove(1);
		
		map.putIfAbsent(0, "Hello");
		System.out.println(map);
		map.remove(1, "Strong");
		System.out.println(map);
		map.putIfAbsent(2, "Osman");
		System.out.println(map);
		map.replace(2, "Nuri");
		System.out.println(map);
		map.putIfAbsent(1, "Erdogan");
		System.out.println(map);
		map.replace(2, "Erdogan");
		System.out.println(map);
		map.replace(1, "Nuri");
		System.out.println(map);
		map.replace(0, "Osman");
		System.out.println(map);
	}

}
