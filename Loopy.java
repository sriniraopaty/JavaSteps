public class Loopy{

public static void main(String[] args){
int x = 1;
int y = 1;
String word = "bottles" ;

System.out.println("before loop x = " + x);
while(x < 5){
	if(x == 1)
{
	System.out.println("You can drink beer if x = " +x);
}
System.out.println("In loop value of x = " + x);
x = x + 1;
}
System.out.println("After loop = " + x);
	if(y == 1)
	{
		word = "bottle";
		System.out.println("has 1 " + word );
	}
while (y < 5)
{

	
	
		word =  "bottles" ;
		System.out.println("Many " + word );
		System.out.println("bottle count " +y);
		y = y + 1;
	}
	


}
}