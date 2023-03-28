package vtigerAutomate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorsss {

	public static void main(String[] args) {

		List ss = new ArrayList();
		ss.add("ad");
		ss.add("fad");
		ss.add("sad");
		ss.add("ooad");
		ss.add("mad");
		ss.add("sky");
		
//		Iterator it= ss.iterator();
//		while(it.hasNext()) {
//			it.next();
//			System.out.println(it.next());
//		}
//			
//		while(it.hasNext()) {
//			Object a= it.next();
//		if(a.equals("sad")) {
//			
//			System.out.println(a);
//		}
//		//System.out.println(a);
//		}
//		
		for(int i=0;i<ss.size();i++) {
			//System.out.println(ss.get(i));
			if(ss.get(i).equals("sky")||ss.get(i).equals("mad")) {
				System.out.println(ss.get(i)); 
			}
		}

		
		
	}
}
