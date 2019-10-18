package Cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CacheHuyen {
	private static Huyen huyen = new Huyen();
	private static CacheHuyen _instance = null;
	private ArrayList<String> cachetinhgannhat = new ArrayList<>();
	private ArrayList<ArrayList<Huyen>> listHuyen = new ArrayList<>();

	private CacheHuyen() {

	}

	public static CacheHuyen getInstance() {
		if (_instance == null) {
			_instance = new CacheHuyen();
		}
		return _instance;
	}

	public void add(String matinh, ArrayList<Huyen> arrayListHuyen) {
		if (cachetinhgannhat.size() > 5) {
			removeFirstAccess();
		}
		cachetinhgannhat.add(matinh);
		listHuyen.add(arrayListHuyen);
	}

	public ArrayList<Huyen> get(String maTinh) {
		int pos = 6;
		ArrayList<Huyen> temp = new ArrayList<>();
		for (int i = 0; i < cachetinhgannhat.size(); i++) {
			if (cachetinhgannhat.get(i).equals(maTinh)) {
				pos = i;
				break;
			}
		}
		if (pos != 6)
			return temp = listHuyen.get(pos);
		else
			return null;

	}

	public int currentSizeCache() {
		return listHuyen.size();
	}

	public void removeFirstAccess() {
		cachetinhgannhat.remove(0);
		listHuyen.remove(0);
	}

	// public ArrayList<Huyen> getAll(){
	// ArrayList<Huyen> listhuyen = new ArrayList<>();
	// cachetinhgannhat.forEach((key, value)->{
	// listhuyen.add(value);
	// });
	// return listhuyen;
	// }

	// public void clear(String cacheKey) {
	// cachetinhgannhat.put(cacheKey, null);
	// }

	// public void clear() {
	// cachehuyen.clear();
	// }
}
