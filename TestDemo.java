/* Dynamic loading of classes i.e; at run time 
using reflection*/


import java.lang.reflect.*;
class TestDemo
{

public static void main(String args[])
{
try
{
Class c = Class.forName(args[0]);
Class c1 = Class.forName(args[1]);
Constructor constructor =
        c.getConstructor(new Class[]{String.class});
Object ob = constructor.newInstance("10");
System.out.println("The name of constructor is " + 
                            constructor.getName()); 
  
 constructor =
        c.getConstructor(new Class[]{int.class,int.class});
 ob = constructor.newInstance(10,20);
System.out.println("The name of constructor is " + 
                            constructor.getName()); 
  constructor =
        c.getConstructor(new Class[]{int.class,int.class,String.class});
 ob = constructor.newInstance(10,20,"abc");
System.out.println("The name of constructor is " + 
                            constructor.getName()); 
  


Method[] methods = c.getMethods(); 
for (Method method:methods) 
            System.out.println(method.getName()); 
Method methodcall1 = c.getDeclaredMethod("setValues", 
                                                 String.class); 
methodcall1.invoke(ob, "abc"); 
  
methodcall1 = c.getDeclaredMethod("setValues", int.class,int.class,
                                                 String.class); 
methodcall1.invoke(ob, 10,20,"abc"); 

methodcall1 = c.getDeclaredMethod("setValues", 
                                                 int.class,int.class); 
methodcall1.invoke(ob,10,20);   
  
  Field[] field = c.getDeclaredFields(); 
for(Field f:field){
f.setAccessible(true);
System.out.println(f);
  }
Field f = c.getDeclaredField("a");
f.setAccessible(true);
f.set(ob, 20);
 methodcall1 = c.getDeclaredMethod("printValueOfA"); 
                                               
methodcall1.invoke(ob); 

 f = c.getDeclaredField("b");
f.setAccessible(true);
f.set(ob, 30);
 methodcall1 = c.getDeclaredMethod("printValueOfB"); 
                                               
methodcall1.invoke(ob);

f = c.getDeclaredField("c");
f.setAccessible(true);
f.set(ob,"def");
 methodcall1 = c.getDeclaredMethod("printValueOfC"); 
                                               
methodcall1.invoke(ob);


//Object ob1 = c1.newInstance();


Constructor constructor1 =
        c1.getConstructor(new Class[]{int.class});
Object ob1 = constructor1.newInstance(10);
System.out.println("The name of constructor is " + 
                            constructor1.getName()); 
  
 constructor1 =
        c1.getConstructor(new Class[]{int.class,int.class});
 ob1 = constructor1.newInstance(10,20);
System.out.println("The name of constructor is " + 
                            constructor1.getName()); 
  constructor1 =
        c1.getConstructor(new Class[]{int.class,int.class,int.class});
 ob1 = constructor1.newInstance(10,20,30);
System.out.println("The name of constructor is " + 
                            constructor1.getName()); 
  


Method[] methods1 = c1.getMethods(); 
for (Method method:methods1) 
            System.out.println(method.getName()); 
 methodcall1 = c1.getDeclaredMethod("setValues", 
                                                 int.class); 
methodcall1.invoke(ob1, 20); 
  
methodcall1 = c1.getDeclaredMethod("setValues", int.class,int.class,
                                                 int.class); 
methodcall1.invoke(ob1, 10,20,30); 

methodcall1 = c1.getDeclaredMethod("setValues", 
                                                 int.class,int.class); 
methodcall1.invoke(ob1,10,20);   
  
  Field[] field2 = c1.getDeclaredFields(); 
for(Field f3:field2){
f3.setAccessible(true);
System.out.println(f3);
  }
Field f2 = c1.getDeclaredField("x");
f2.setAccessible(true);
f2.set(ob1, 20);
 methodcall1 = c1.getDeclaredMethod("printX"); 
                                               
methodcall1.invoke(ob1); 

 f2 = c1.getDeclaredField("y");
f2.setAccessible(true);
f2.set(ob1, 30);
 methodcall1 = c1.getDeclaredMethod("printY"); 
                                               
methodcall1.invoke(ob1);

f2 = c1.getDeclaredField("z");
f2.setAccessible(true);
f2.set(ob1,40);
 methodcall1 = c1.getDeclaredMethod("printZ"); 
                                               
methodcall1.invoke(ob1);

}
catch(NoSuchFieldException e)
{

System.out.println(e);
}
catch(NoSuchMethodException e)
{

System.out.println(e);
}
catch(InvocationTargetException e)
{

System.out.println(e);
}
catch(ClassNotFoundException e)
{

System.out.println(e);

}
catch(InstantiationException e)
{

System.out.println(e);

}
catch(ArrayIndexOutOfBoundsException e)
{

System.out.println(e);

}
catch(IllegalAccessException e)
{

System.out.println(e);

}

}



}
