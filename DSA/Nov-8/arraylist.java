import java.util.*;
public class arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer>list2=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(2,120);
		
		System.out.println(list);
		list2=list;
		list2.set(2, 240);
		System.out.println(list2);
		Collections.sort(list2);
		Collections.reverse(list2);
		System.out.println(list2);
		
		

	}

}