public class Calc{
   public void add(int a, int b){
	return a+b;
   }
   public void minus(int a, int b){
	return a - b;   
   }
   public void multiply(int a, int b){
	return a*b;   
   }
   public void divide(int a, int b){
	return a/b;   
   }
   public static void main(String[] args){
	Calc c = new Calc();   
	c.add(2, 3);
   }
