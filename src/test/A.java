package test;

import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) {

		System.out.println("abc");
		System.out.println("master: edit B");
		System.out.println("develop edit A");
		System.out.println("develop edit A 2");
		System.out.println("dev3: 3");
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MAX_VALUE*2);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		List<String> list=new ArrayList<String>();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		System.out.println(list.subList(0, 3));//0,1,2
	}
	
	private int id;
	private String name;
	private String desc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	
}
