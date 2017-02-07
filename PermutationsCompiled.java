package com.fuji;

import java.util.ArrayList;
import java.util.List;

public class PermutationsCompiled {

	static List<String>list;

	static List<String> allPerms(String input){

		list = new ArrayList<String>();
		getPermutations("",input);	
		return list;
	}

	static void getPermutations(String a, String rest){
		int len = rest.length();
		if(len == 0){
			list.add( a);
		}
		else{
			for(int index = 0 ; index < len ; index++){
				char temp = rest.charAt(index);
				//a += temp;
				//rest = rest.substring(0,index)+rest.substring(index+1,len);
				getPermutations(a + temp,rest.substring(0,index)+rest.substring(index+1,len));
				}
			}
	}
	
	public static void main(String...strings){
		List<String> output = allPerms("jay");
		for(String s: output){
			System.out.println(s);
		}
	}
}
