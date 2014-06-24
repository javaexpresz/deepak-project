package com.p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

/**
* @param args
*/
public static void main(String[] args) {
List<String> names = new ArrayList<String>();
names.add("Ranga");
names.add("Reddy");
names.add("Vasu");
names.add("Raja");
names.add("Reddy");
names.add("Ranga");

System.out.println("Avoiding the duplicates using HashSet");
Set<String> withOutDuplicateNamesUsingSet = new HashSet<String>(names);
System.out.println(withOutDuplicateNamesUsingSet+"\n");

System.out.println("Avoiding the duplicates using contains() method of ArrayList");
List<String> withOutDuplicateNamesUsingList = new ArrayList<String>();
for (String name : names) {
if(!withOutDuplicateNamesUsingList.contains(name)) {
withOutDuplicateNamesUsingList.add(name);
}
}
System.out.println(withOutDuplicateNamesUsingList +"\n");

System.out.println("Avoiding the duplicates using Map");
Map<String, String> withOutDuplicateNamesUsingMap = new HashMap<String, String>();

for (String name : names) {
if(withOutDuplicateNamesUsingMap.get(name) == null) {
withOutDuplicateNamesUsingMap.put(name, name);
}
}
System.out.println(withOutDuplicateNamesUsingMap); 

}
}
