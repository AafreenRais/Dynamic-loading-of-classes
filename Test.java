public class Test
{
int a,b;
String c;
public Test()
{
System.out.println("no arg constructor called");
}
public Test(String c)
{
this.c=c;
System.out.println("1 arg constructor called");
System.out.println(c);
}
public Test(int a,int b)
{
this.a=a;
this.b=b;
System.out.println("2 arg constructor called");
System.out.println(a);
System.out.println(b);
}
public Test(int a,int b,String c)
{
this.a=a;
this.b=b;
this.c=c;
System.out.println("3 arg constructor called");
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
public void setValues(int a,int b,String name)
{

System.out.println("3 arg method called");
this.a = a;
this.b = b;
this.c = name;


}
public void setValues(int a,int b)
{
this.a = a;
this.b = b;

System.out.println("2 arg method called");

}
public void setValues(String name)
{

System.out.println("1 arg methood called");
this.c = name;

}
public void printValueOfA()
{

System.out.println(this.a);



}
public void printValueOfB()
{

System.out.println(this.b);



}
public void printValueOfC()
{

System.out.println(this.c);



}

}
