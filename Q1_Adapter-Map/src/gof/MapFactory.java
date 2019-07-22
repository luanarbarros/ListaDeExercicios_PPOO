package gof;

public class MapFactory {
	public static Map getMap(Type map) {
		switch (map) {
		case HASHMAP:
			return new HashAdapter();
		case TREEMAP:
			return new TreeAdapter();
		default:
			return null;
		}
	}
}
