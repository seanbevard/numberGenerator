package numberGenerator;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator {

	public  	static void main(String[] args) {
		// TODO Auto-generated method stub
		generateArrayList();
		generateLinkedList();
		generateHashTable();
	}
	
	public static void generateArrayList() {
		ArrayList al = new ArrayList();
		for (int i = 0; i<2000000; i++)
		{
			int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
			al.add(randomNum);
		}
		
		al.clear();
	}
	
	public static void generateLinkedList() {
		LinkedList ll = new LinkedList();
		for (int i = 0; i<2000000; i++)
		{
			int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
			ll.add(randomNum);
		}
		
		ll.clear();
	}
	
	public static void generateHashTable() {
		Hashtable ht = new Hashtable();
		for (int i = 0; i<2000000; i++)
		{
			int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
			ht.put(i, randomNum);
		}
		
		ht.clear();
	}

}
