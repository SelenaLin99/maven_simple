package day7_hw;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1) Write a programs for each of below for adding, remove and iteration using Iterator
//
//    ArrayList
		
		List <Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(4);
		num.add(6);
		
		num.remove(0);
		
		Iterator <Integer> numIterator = num.iterator();
		
		while(numIterator.hasNext()) {
			System.out.println(numIterator.next());
		}
		
//    LInkedList
		
		List <String> birds = new LinkedList<String>();
		
		birds.add("ostrich");
		birds.add("emu");
		birds.add("kiwi");
		
		birds.remove(2);
		
		Iterator <String> birdItr = birds.iterator();
		
		while(birdItr.hasNext()) {
			System.out.println(birdItr.next());
		}
			
//    Vector
		
		Vector<Integer> vNum = new Vector();
		vNum.add(6);
		vNum.add(7);
		vNum.add(5);
		
		vNum.remove(0);
		
		Enumeration<Integer> eNum = vNum.elements();
		while(eNum.hasMoreElements()) {
			System.out.println(eNum.nextElement());
		}		
		
//    Stack
		
		Stack <Character> s = new Stack<Character>();
		s.push('o');
		s.push('s');
		s.push('t');
		s.push('r');
		s.push('i');
		s.push('c');
		s.push('h');
		
		s.pop();
		s.pop();
		
		Iterator <Character> sIter = s.iterator();
		
		while(sIter.hasNext()) {
			System.out.println(sIter.next());
		}
		
		
//    HashSet
		
		Set<Integer> hs = new HashSet<Integer>();
		
		hs.add(3);
		hs.add(8);
		hs.add(9);
		hs.add(7);
		hs.add(8);
		
		hs.remove(3);
		
		Iterator<Integer> hsIter = hs.iterator();
		
		while(hsIter.hasNext()) {
			System.out.println(hsIter.next());
		}
//    LinkedHashSet
		
		Set<Integer> ls = new LinkedHashSet<Integer>();
		
		ls.add(3);
		ls.add(8);
		ls.add(9);
		ls.add(7);
		ls.add(8);
		
		ls.remove(3);
		
		Iterator<Integer> lsIter = ls.iterator();
		
		while(lsIter.hasNext()) {
			System.out.println(lsIter.next());
		}
//    TreeSet
		
		Set<Integer> ts = new TreeSet<Integer>();
		
		ts.add(3);
		ts.add(8);
		ts.add(5);
		ts.add(7);
		ts.add(4);
		
		ts.remove(3);
		
		Iterator<Integer> tsIter = ts.iterator();
		
		while(tsIter.hasNext()) {
			System.out.println(tsIter.next());
		}
//
//    HashMap
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(3, "Sara");
		hm.put(1, "Karen");
		hm.put(2, "Emma");
		
		hm.remove(1);
		
		Iterator<Map.Entry<Integer, String>> hmIter = hm.entrySet().iterator();
		while(hmIter.hasNext()) {
			System.out.println(hmIter.next());
		}

//    LinkedHashMap
		
		Map<Integer,String> lm = new LinkedHashMap<Integer,String>();
		lm.put(3, "Sara");
		lm.put(1, "Karen");
		lm.put(2, "Emma");
		lm.put(4, "Anna");
		
		lm.remove(1);
		
		Iterator<Map.Entry<Integer, String>> lmIter = lm.entrySet().iterator();
		while(lmIter.hasNext()) {
			System.out.println(lmIter.next());
		}

//    TreeMap
		
		Map<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(3, "Sara");
		tm.put(1, "Karen");
		tm.put(2, "Emma");
		tm.put(4, "Anna");
		
		tm.remove(1);
		
		Iterator<Map.Entry<Integer, String>> tmIter = tm.entrySet().iterator();
		while(tmIter.hasNext()) {
			System.out.println(tmIter.next());
		}
//

	}

}
