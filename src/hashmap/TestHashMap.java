package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> phoneDict = new HashMap<String, Integer>();
		phoneDict.put("SANKET", 100);
		phoneDict.put("HIRKANI", 101);
		
		System.out.println(phoneDict.get("SANKET"));
		
		
		
		
		HashSet<String> hashSet = new HashSet<String>();
		
		String str1 = "SANKYA";
		String str2 = "SANKYA";
		
		String str3 = new String("SANKYA");
		String str4 = new String("SANKYA");
		
		hashSet.add(str3);
		hashSet.add(str4);
		
//		HashSet<Student> hashSet2 = new HashSet<Student>();
//		
//		Student student = new Student("HIRKANI");
//		Student student2 = new Student("HIRKANI");
//		hashSet2.add(student);
//		hashSet2.add(student2);


		
		Iterator<String> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
