package newcomer_trials;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.*;
public class ConcurrentHashMapDemo {

	private static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
	public static void main(String[] args) {
		ConcurrentHashMapDemo tChild = new ConcurrentHashMapDemo();
		map.put(1, "Iman");
		map.put(2, "Siri");
		map.put(3, "Alexa");
		map.put(4, "Mia");
		tChild.run();
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry entry = itr.next();
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
 	}
	public void run() {
		try {
			Thread.sleep(100);
		} catch(Exception e) {
			e.printStackTrace();
		}
		map.put(5, "Peta");
	}
}
