/**
 * @author Arsalan
 * This code is partially uses GeeksForGeeks implementation example of 
 * large number calculation, and modified to solve the problem
 */
package fall2004;


public class LargeInt {
	private String value;
	private boolean IsNegative;
	public LargeInt() {
		setValue("0;");
	}
	/**
	 * @param value
	 */
	public LargeInt(String value) {
		super();
		
		if( value.charAt(0)=='-') {
			setIsNegative(true);
			value=value.substring(1);
		}else {
			setIsNegative(false);
			if(value.charAt(0)=='+') {
				value=value.substring(1);
			}
		}
		setValue(value);
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		if(!value.endsWith(";")) {
			 System.err.println("Developer Exception: The value should have trailing semicolon");
			  return;
		}
		value=value.replace(";","");
		if(value==null || value.isEmpty() ) {
			  System.err.println("Developer Exception: The value can not be null or empty");
			  return;
			 //new Exception("Developer Exception: The value can not be null or empty");
		}
		
		value=value.trim();
		value=value.replaceAll("\n", "");
		for(int index=0;index<value.length();index++) {
			if(index==0 && (value.charAt(index)=='-') || value.charAt(index)=='+') {
				index++;
			}
			if( !(value.charAt(index)>='0' && value.charAt(index)<='9')) {
				System.err.println("Developer Exception: Digit should be between 0 to 9");
				//new Exception("Developer Exception: Digit should be between 0 to 9");
				return;
			}	
		}
		
		
		this.value = value;
	}
	@Override
	public String toString() {
		
		String displayStr="";
		String tempValue=value!=null?value:"";
		while (!(tempValue.isEmpty())) {
			if(tempValue.length()<60) {
				displayStr=displayStr+ tempValue+"\n";
				tempValue= "";
			}else {
				displayStr=displayStr+ tempValue.substring(0, 59)+"\n";
				tempValue= tempValue.substring(60,tempValue.length());	
			}
			
		}
		if(IsNegative==true) {
			displayStr="-"+displayStr;
		}else {
			displayStr="+"+displayStr;
		}
		return "LargeInt [value=" + displayStr + "]";
	}
	public LargeInt addDigit(int input) {
		for(int index=value.length()-1;index>=0;index--) {
			char currentDigitChar= value.charAt(index);
			//Integer.getInteger(new String (currentDigitChar));
		}
		return new LargeInt();
	}
	public static LargeInt sum(LargeInt a,int c ) {
		String bValue=c+";";
		LargeInt b=new LargeInt(bValue);
		LargeInt result= sum(a,b);
		return result;
	}
	public static LargeInt sum(LargeInt a,LargeInt b ) {

		if (a.value.length()>b.value.length()) {
			LargeInt temp;
			temp=a;
			a=b;
			b=temp;
		}
		String result="";
		
	    // Calculate length of both input LargeInt
		int aLength=a.value.length(),bLength=b.value.length();
		int diff=bLength-aLength;
		// Initially take carry zero  
	    int carry = 0;  
	 // Traverse from end of both Strings  
	    for (int i = aLength - 1; i>=0; i--)  
	    {  
	        // Do school mathematics, compute sum of  
	        // current digits and carry  
	        int sum = ((int)(a.value.charAt(i)-'0') +  
	            (int)(b.value.charAt(i+diff)-'0') + carry);  
	        result += (char)(sum % 10 + '0');  
	        carry = sum / 10;  
	    } 
	 // Add remaining digits of str2[]  
	    for (int i = bLength - aLength - 1; i >= 0; i--)  
	    {  
	        int sum = ((int)(b.value.charAt(i) - '0') + carry);  
	        result += (char)(sum % 10 + '0');  
	        carry = sum / 10;  
	    }  
	 // Add remaining carry  
	    if (carry > 0)  
	        result += (char)(carry + '0');  
	  
	    // reverse resultant String
	    LargeInt resultLargeInt=new LargeInt();
	    
	    resultLargeInt.setValue(new StringBuilder(result).reverse().toString()+";");
	    if(a.IsNegative==true) {
	    	resultLargeInt.setIsNegative(true);
	    }else {
	    	resultLargeInt.setIsNegative(false);
	    }
	    return  resultLargeInt;
	}
	/**
	 * @return the isNegative
	 */
	public boolean isIsNegative() {
		return IsNegative;
	}
	/**
	 * @param isNegative the isNegative to set
	 */
	public void setIsNegative(boolean isNegative) {
		IsNegative = isNegative;
	}
	// Returns true if str1 is smaller than str2. 
	static boolean isSmaller(String str1, String str2) 
	{ 
	    // Calculate lengths of both string 
	    int n1 = str1.length(), n2 = str2.length(); 
	    if (n1 < n2) 
	        return true; 
	    if (n2 < n1) 
	        return false; 
	      
	    for (int i = 0; i < n1; i++) 
	    if (str1.charAt(i) < str2.charAt(i)) 
	        return true; 
	    else if (str1.charAt(i) > str2.charAt(i)) 
	        return false; 
	  
	    return false; 
	} 
	  
	// Function for find difference of larger numbers 
	static String findDiff(String str1, String str2)
	{ 
	    // Before proceeding further, make sure str1 
	    // is not smaller 
	    if (isSmaller(str1, str2)) 
	    { 
	        String t = str1; 
	        str1 = str2; 
	        str2 = t; 
	    } 
	  
	    // Take an empty string for storing result 
	    String str = ""; 
	  
	    // Calculate length of both string 
	    int n1 = str1.length(), n2 = str2.length(); 
	  
	    // Reverse both of strings 
	    str1 = new StringBuilder(str1).reverse().toString(); 
	    str2 = new StringBuilder(str2).reverse().toString(); 
	      
	    int carry = 0; 
	  
	    // Run loop till small string length 
	    // and subtract digit of str1 to str2 
	    for (int i = 0; i < n2; i++) 
	    { 
	        // Do school mathematics, compute difference of 
	        // current digits 
	        int sub = ((int)(str1.charAt(i)-'0') -  
	                   (int)(str2.charAt(i)-'0')-carry); 
	          
	        // If subtraction is less then zero 
	        // we add then we add 10 into sub and 
	        // take carry as 1 for calculating next step 
	        if (sub < 0) 
	        { 
	            sub = sub + 10; 
	            carry = 1; 
	        } 
	        else
	            carry = 0; 
	  
	        str += (char)(sub + '0'); 
	    } 
	  
	    // subtract remaining digits of larger number 
	    for (int i = n2; i < n1; i++) 
	    { 
	        int sub = ((int)(str1.charAt(i) - '0') - carry); 
	          
	        // if the sub value is -ve, then make it positive 
	        if (sub < 0) 
	        { 
	            sub = sub + 10; 
	            carry = 1; 
	        } 
	        else
	            carry = 0; 
	              
	        str += (char)(sub + '0'); 
	    } 
	  
	    // reverse resultant string 
	    return new StringBuilder(str).reverse().toString(); 
	}
	public static LargeInt subtract(LargeInt a,int c ) {
		String bValue=c+";";
		LargeInt b=new LargeInt(bValue);
		LargeInt result= subtract(a,b);
		return result;
	} 
	
	public static LargeInt subtract(LargeInt a, LargeInt b) {
		LargeInt result;
		String resultValue="";
		if((a.IsNegative && b.IsNegative) || (!a.IsNegative && !b.IsNegative)){
			resultValue= findDiff(a.value, b.value);
			Boolean resultIsNegative=false;
			if(isSmaller(a.value, b.value) ) {
				resultIsNegative=b.IsNegative;
			}else {
				resultIsNegative=b.IsNegative;
			}
			result=new LargeInt();
			result.setIsNegative(resultIsNegative);
			result.setValue(resultValue+";");
			
		}else {
			result=sum(a, b);
		}
		
		return result;
	}
}
