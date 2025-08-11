package com.darshan;
import java.util.*;
import java.util.List;
import java.util.HashMap;
public class GraphTask {

	public static void main(String[] args) {
		Map<String,List<String>> graph = new HashMap<>();
		graph.put("Pune",Arrays.asList("Mumbai","Delhi"));
		graph.put("Mumbai",Arrays.asList("Pune","Kolkata"));
		graph.put("Delhi",Arrays.asList("Pune"));
		graph.put("Kolkata",Arrays.asList("Mumbai"));
		List<String> cities = new ArrayList<>(graph.keySet());
		
		for(int i=0; i<cities.size();i++) {
			String city=  cities.get(i);
			System.out.println(city+" is connected to"+ graph.get(city));
		}
		
		
		

	}

}
