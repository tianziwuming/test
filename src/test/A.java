package test;

public class A {

	public static void main(String[] args) {

		System.out.println("abc");
		System.out.println("master: edit B");
		System.out.println("develop edit A");
		System.out.println("develop edit A 2");
		System.out.println("dev3: 3");
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
