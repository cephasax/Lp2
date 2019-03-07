package br.ufrn.imd.wordcount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static String[] words;
	private static ArrayList<WordCount> wc;
	
	public static void main(String[] args) {
		
		System.out.println("Please insert any text");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		
		words = text.split(" ");
		wc = new ArrayList<WordCount>();
		
		for(String s: words) {
			if(!storedWord(s)) {
				wc.add(new WordCount(s));
			}
			else {
				WordCount w = findWordCount(s);
				if(w != null) {
					w.increaseTotal();
				}
			}
		}
		
		System.out.println(wc.toString());
		in.close();
	}
	
	public static boolean storedWord(String key) {
		for(WordCount s: wc) {
			if(s.getKey().equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public static WordCount findWordCount(String key) {
		for(WordCount w: wc) {
			if(w.getKey().equals(key)) {
				return w;
			}
		}
		return null;
	}

}
