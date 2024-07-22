package quizPro;
public class MyClass
{
   private static int count = 0;
   private int x;
   
   

   public static int getCount() {
	return count;
}
public static void setCount(int count) {
	MyClass.count = count;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public MyClass(int i)
   {
      x = i;
   }
   public static void incrementCount()
   {
      count++;      
   }

   public void printX()
   {
      System.out.println("Value of x : "  + x);
   }

   public static void printCount()
   {
      System.out.println("Value of count : "  + count);
   }
   
}

