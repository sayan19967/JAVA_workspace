package com.tcs.ilp;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Practice> al = new ArrayList<Practice>();
		Practice p1 = new Practice();
		Practice p2 = new Practice();
		al.add(p1);
		al.add(p2);
		
		ArrayList<Practice> al1 = new ArrayList<Practice>();
		Practice p3 = new Practice();
		Practice p4 = new Practice();
		al1.add(p1);
		al1.add(p2);
		
		System.out.println(al.equals(al1));
		System.out.println(al.contains("sayan"));
		
		/*TreeSet<Practice> ts = new TreeSet<Practice>(al);
		for(Practice ob:ts) {
			System.out.println(ob);
		}*/
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("sayan");
		al2.add("soham");
		for (String str : al2) {
			System.out.println(str);
		}
		al2.add(0, "aritra");
		System.out.println(al2);
		
		LinkedList<String> al3 = new LinkedList<String>();
		
		al3.add("sayan");
		al3.add("soham");
		for (String str : al3) {
			System.out.println(str);
		}
		al3.add(0, "aritra");
		System.out.println(al3);
		
		for (int i = 0;i < al3.size(); i++) {
			System.out.println(al3.get(i));
		}
		Iterator itr = al3.iterator();
		itr.remove();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
