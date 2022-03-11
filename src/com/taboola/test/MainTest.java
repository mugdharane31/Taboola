package com.taboola.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @author - Mugdha R
 */
public class MainTest {
	
	private static List<String> list1 = new ArrayList<String>();
	
	private static List<String> list2 = new ArrayList<String>();
	
	public static void main(String args[]) {
		
		MainTest mainTest = new MainTest();
		
		list1.add("123");
		list1.add("-124");
		list1.add("1");
		list1.add("0");
		
		for(String str : list1) {
			System.out.println(mainTest.convertStrtoInt(str));
		}
		
		
		list2.add("mugdha1rane");
		list2.add("mugdharane");
		list2.add(" ");
		list2.add("");
		
		for(String str : list2) {
			System.out.println(mainTest.detectInt(str));
		}
	}

	/*
	 *  Write a Java program that take a string input and convert it to an integer without
		using the build-in parse function.
		Example: input value “123”, convert it to an integer type with value 123
	 */
	private int convertStrtoInt(String intstr) {
		int result = 0;
		int lenstr = intstr.length();
		
		boolean isNegative = false;
		int i = 0;
		//check the number to be negative
		if(intstr.charAt(0) == '-') {
			isNegative = true;
			i = 1;
		}
		while(i<lenstr) {
			//move the number by one place
			result = result * 10;
			//System.out.println(intstr.charAt(i));
			result += intstr.charAt(i) - '0';
			i++;
		}
		
		if(isNegative) {
			result = -result;
		}
		return result;
	}
	
	
	/*
	 *  Write a Java program that take a input and detect whether there’s integer in
		there.
		Example: input value “45222” return true, input value “This Is A Test4me” return
		true, input value “IAMGOOD” return false	
	 */
	
	private boolean detectInt(String str) {
		/*
		 *  The ASCII value of the uppercase alphabets range from 65 - 90,
			lowercase alphabets range from 97 - 122
			the digits range from 48 - 57.
		 */
		boolean containsNum = false;
		
		
		str = str.replaceAll("\\s", "");
		int lenStr = str.length();
		if(lenStr == 0) {
			return containsNum;
		}
		for(int i = 0; i < lenStr; i++) {
			char ch = str.charAt(i);
			
			int chAscii = (int) ch;
			
			if(chAscii > 47 && chAscii < 58) {
				containsNum = true;
				break;
			}else {
				continue;
			}
		}
		return containsNum;
	}
}
