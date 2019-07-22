package gof;

import java.util.TreeMap;

public class TreeAdapter implements Map{

	private TreeMap<String, String> map;

	public TreeAdapter() {
		this.map = new TreeMap<String, String>();
	}
	
	@Override
	public void create(String[][] map) {
	
		for (int i = 0; i < map.length; i++) {
			this.map.put(map[i][0], map[i][1]);
		}
		
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		String text = "";
		text = "My Tree Map = ";
		
        for (String key : this.map.keySet()) {
        	
            String value = this.map.get(key);
            text = text + "{" + key + " = " + value + "} ";
        }

		return text;		
	}

}
