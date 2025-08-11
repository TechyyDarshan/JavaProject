package com.darshan;
import java.util.*;
import java.util.List;
import java.util.HashMap;
public class SimpleGraph {

	public static void main(String[] args) {
		Map<String,List<String>> graph = new HashMap<>();
		graph.put("CityA",Arrays.asList("City B","City C"));
		graph.put("CityB",Arrays.asList("CityA","CityD"));
		graph.put("CityC",Arrays.asList("CityA"));
		graph.put("CityD",Arrays.asList("CityB"));
		List<String> cities = new ArrayList<>(graph.keySet());
		
		for(int i=0; i<cities.size();i++) {
			String city=  cities.get(i);
			System.out.println(city+" is connected to"+ graph.get(city));
		}
		
		
		

	}

}
