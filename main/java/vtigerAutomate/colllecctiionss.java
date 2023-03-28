package vtigerAutomate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class colllecctiionss {

	public static void main(String[] args) {
//		ArrayList bc = new ArrayList();
//
//		bc.add("aman");
//		bc.add('c');
//		bc.add(123);
//		bc.add("sufiya");
//		
//		bc.add("sarita");
		Set abc = new HashSet();
		abc.add("aman");
		abc.add('c');
		abc.add(123);
		abc.add("sufiya");
      //  System.out.println(abc);

      Iterator it=  abc.iterator();
      while(it.hasNext());{
    //  it.remove();
      System.out.println(it.next()+" ");
      }
	}

}
