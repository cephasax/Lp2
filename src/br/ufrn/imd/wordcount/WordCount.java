package br.ufrn.imd.wordcount;

public class WordCount {

	private String key;
	private int total;

	public WordCount(String key) {
		this.key = key;
		total = 1;
	}
	
	public void increaseTotal() {
		this.total++;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return this.key + " : " + this.total;
	}
	
	

}
