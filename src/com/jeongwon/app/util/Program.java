package com.jeongwon.app.util;

public class Program {

	public static void main(String[] args) {
		GList<Integer> list = new GList<>();
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		
		
		
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d,", list.get(i));
		}
	//	num = (Integer)list.get(1);
		
		
	}

}
