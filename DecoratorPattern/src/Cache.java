
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cache {

	private static Tinh tinh = new Tinh();
	private static Cache _instance = null;
	private Map<String, Tinh> cacheTinh = new HashMap<String, Tinh>();

	private Cache() {

	}

	public static Cache getInstance() {
		if (_instance == null) {
			_instance = new Cache();
		}
		return _instance;
	}

	public void put(String cacheKey, Tinh tinh) {
		cacheTinh.put(cacheKey, tinh);
	}

	public Tinh get(String cacheKey) {
		return cacheTinh.get(cacheKey);
	}
	
	public ArrayList<Tinh> getAll(){
		ArrayList<Tinh> listTinh = new ArrayList<>();
		 cacheTinh.forEach((key, value)->{
			 listTinh.add(value);
		 });
		 return listTinh;
	}

	public void clear(String cacheKey) {
		cacheTinh.put(cacheKey, null);
	}

	public void clear() {
		cacheTinh.clear();
	}

}
