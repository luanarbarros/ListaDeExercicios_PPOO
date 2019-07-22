package gof;

public class Client {

	public static void main(String[] args) {
		
		String[][] map = new String[][] {
										{"a1", "a2"},
										{"b1", "b2"},
										{"c1", "c2"},
										{"e1", "e2"},
										{"d1", "d2"}
										};
		
		MapFactory.getMap(Type.HASHMAP).create(map);
		MapFactory.getMap(Type.TREEMAP).create(map);
	}
	
}
