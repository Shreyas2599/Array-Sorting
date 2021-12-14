package ArraySorting;

abstract class Demo {

	int id;
	String s;
	
	public Demo(int id, String s) {
		super();
		this.id = id;
		this.s = s;
	}
	
	
	
}
class Demo1 extends Demo{


	
	public Demo1(int id, String s) {
		super(id, s);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		Demo1 d=new Demo1(2,"Shreyas");
		System.out.println();
	}
	
	
}
