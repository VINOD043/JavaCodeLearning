package com.general;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Sort a map based on the values.
 * 
 * @author Vinod Yadav
 *
 */
public class IterateMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("alex", 3);
        unsortMap.put("david", 4);
        unsortMap.put("elle", 5);
        unsortMap.put("charles", 1);
        unsortMap.put("brian", 2);
        
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        unsortMap.entrySet().stream()
        	.sorted(Map.Entry.comparingByValue())
        	.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        
        System.out.println("sorted map : "+sortedMap);
	}

}
