package vtigerAutomate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class srj {
public static void main(String[] args) {
	
	ArrayList abc = new ArrayList();
	abc.add("aman");
	abc.add('c');
	abc.add(123);
	abc.add("sufiya");
  //  System.out.println(abc);

  Iterator it=  abc.iterator();
  while(it.hasNext());{
  it.remove();
  System.out.println(it.next());
  }
	
}
}
