package convert;

/**
 * 
 * @author Ruba
 *
 */
public class UpperToLower{

	/** 
	 * The first way is to use "toLowerCase" function which is already existing in java
	 */
	public static String way1(String str){
		String str1 = str.toLowerCase();
		return str1;    
	}

	
	/** 
	 * The second way is to add 32 to the char to be lower 
	 */
	public static String way2(String str){
		StringBuffer strLower =new StringBuffer(str); 
		String str2;
		int temp;
		for(int i = 0; i < str.length(); i++) {              
			if(Character.isUpperCase(str.charAt(i))) {    
				temp = ((int) str.charAt(i)) +32;
				strLower.setCharAt(i,(char)temp);   
			}
		}
		str2 = strLower.toString();
		return str2;
	}
}
