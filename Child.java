class GrandParent
{
	String grandFatherName, grandMotherName;
	GrandParent(String a, String b)
	{
	grandFatherName=a;
	grandMotherName=b;
	System.out.println("grandFatherName: " +grandFatherName);
	System.out.println("grandMotherName: " +grandMotherName);
	}
	
}
class Parent extends GrandParent
{
	String FatherName, MotherName;
	Parent(String a, String b)
	{
	FatherName=c;
	MotherName=d;
	System.out.println("FatherName: " +FatherName);
	System.out.println("MotherName: " +MotherName);
	}
	
}
class Child extends Parent
{
	Child(String c, String d, String a, String b)
	{
		super(c,d,a,b);
	}
	public static void main(String args[])
	Child child=new Child("Shankar","Devi","Vijay","Geeta");
}