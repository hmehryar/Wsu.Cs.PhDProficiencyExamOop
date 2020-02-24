/**
 * 
 */
package fall2004;

/**
 * @author Neda
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargeInt oLargeInt=new LargeInt();
		System.out.println(oLargeInt);
		
		LargeInt oLargeIntPisitive=new LargeInt("+123;");
		System.out.println(oLargeIntPisitive);
		
		LargeInt oLargeIntNegative=new LargeInt("-123;");
		System.out.println(oLargeIntNegative);
		
		LargeInt oLargeIntNoneDigit=new LargeInt("-1hj3;");
		System.out.println(oLargeIntNoneDigit);
		
		
		LargeInt oLargeIntEntered=new LargeInt("-13\n4234\n\n243;");
		System.out.println(oLargeIntEntered);
		
		LargeInt oLargeIntLongString=new LargeInt("-13\n4234\n\n243454564654654654545456476465465646546546546564654654654654654654654665"+
		"7874982378292978279827829782927982798729827829829279872982729827982;");
		System.out.println(oLargeIntLongString);
		
		System.out.println("Adding two positive numbers");
		LargeInt a=new LargeInt("+1234;");
		LargeInt b=new LargeInt("+1234;");
		LargeInt result= LargeInt.sum(a, b);
		System.out.println(result.toString());
		
		System.out.println("Subtract two equal positive numbers");
		result=LargeInt.subtract(a,b);
		System.out.println(result.toString());
		
		System.out.println("Adding two negative numbers");
		 a=new LargeInt("-1234;");
		 b=new LargeInt("-1234;");
		 result= LargeInt.sum(a, b);
		System.out.println(result.toString());
		
		
		
		System.out.println("Subtract two equal negative numbers");
		result=LargeInt.subtract(a,b);
		System.out.println(result.toString());
		
		
		System.out.println("Subtract two number with diffirence sign numbers which they will be added");
		a=new LargeInt("-1235;");
		 b=new LargeInt("1234;");
		result=LargeInt.subtract(a,b);
		System.out.println(result.toString());
		
		System.out.println("Subtract two number with diffirence sign numbers which they will be added");
		a=new LargeInt("1235;");
		 b=new LargeInt("-1234;");
		result=LargeInt.subtract(a,b);
		System.out.println(result.toString());
		
		System.out.println("Subtract two number with diffirence sign numbers which they will be subtracted");
		a=new LargeInt("1235;");
		 b=new LargeInt("1234;");
		result=LargeInt.subtract(a,b);
		System.out.println(result.toString());
		
		System.out.println("Subtract two number with diffirence sign numbers which they will be subtracted");
		a=new LargeInt("-1235;");
		b=new LargeInt("-1234;");
		result=LargeInt.subtract(a,b);
		System.out.println(result.toString());
		
		System.out.println("Add LargeInt with a digit");
		a=new LargeInt("1235;");
		int c=3;
		result=LargeInt.sum(a,c);
		System.out.println(result.toString());
		
		System.out.println("Add LargeInt with a digit");
		
		result=LargeInt.subtract(a,c);
		System.out.println(result.toString());
		
		
		
		
	}

}
