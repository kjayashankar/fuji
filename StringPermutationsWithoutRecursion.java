package com.fuji;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationsWithoutRecursion {

	public static void main(String...strings) {
		String input = "jay";
		List<String> perms = allPerms(input);
		for(String word:perms){
			System.out.println(word);
		}
	}
	
	static List<String> allPerms(String input){
		List<String> words = new ArrayList<String>();
		words.add(input.charAt(0)+"");
		
		List<String> wordsTemp = new ArrayList<String>();
		for(int index=1; index < input.length(); index++) {
			int wordIndex = 0;
			while(wordIndex < words.size()) {
				wordsTemp.addAll(combine(input.charAt(index),words.get(wordIndex)));
				wordIndex++;
			}
			words.removeAll(words);
			words.addAll(wordsTemp);
			wordsTemp.removeAll(wordsTemp);
		}
		
		return words;
		
	}
	
	static List combine(char temp,String string){
		List<String> list = new ArrayList<String>();
		int length = string.length();
		
		for(int index = 0; index <= length ; index ++){
			list.add(string.substring(0,index)+temp +
					string.substring(index,length));
		}
		
		return list;
	}
}
