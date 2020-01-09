public class Test2 {
	public int x;
	public int y;
	public int z;
	
	public Test2(int x, int y, int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("Three arguments constuctor call"+x +y +z);
	}
	public Test2(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		System.out.println("Two arguments constuctor call" +x +y);
	}
	public Test2(int x) {
		
		this.x = x;
		System.out.println("one arguments constuctor call" +x);
	}
	public void printX() {
		System.out.println(x);
	}
	public void setValues(int x,int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
       System.out.println("Three arguments method call"+x +y +z);
	}
	public void printY() {
		System.out.println(y);
	}
	public void setValues(int y,int z) {
		this.y = y;
		this.z = z;
       System.out.println("Two arguments method call"+ y +z);
	}
	public void printZ() {
		System.out.println(z);
	}
	public void setValues(int z) {
		this.z = z;
        System.out.println("One argument method call"+z);
	
	}
	

}
