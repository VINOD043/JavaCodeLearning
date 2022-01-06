package com.general;
import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "vinod");
		map.put(2, "nitu");
		map.put(3, "sadhana");
		map.put(4, "poonam");
		map.put(5, "naren");
		
		loopMapNormalWay(map);
		
		loopMapUsingJava8(map);
		
		int keyToBeRemoved = 1;
		removeEntryFromMap(map, keyToBeRemoved);
	}
	
	private static void removeEntryFromMap(Map<Integer, String> map, int keyToBeRemoved) {
		System.out.println("remove key from map : ");
		map.entrySet()
			.removeIf(
					entry -> (keyToBeRemoved == entry.getKey()));
		map.forEach((k,v) -> System.out.println("key : "+k+" value : "+v));
	}

	private static void loopMapUsingJava8(Map<Integer, String> map) {
		System.out.println("using java 8");
		map.forEach((k,v) -> System.out.println("key : "+k+" value : "+v));
	}

	private static void loopMapNormalWay(Map<Integer, String> map) {
		System.out.println("Classic way");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
		}
	}

}
