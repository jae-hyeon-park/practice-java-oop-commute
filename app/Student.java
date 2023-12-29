package dev.syntax.app;

public class Student {
	private String name;
	private int budget; //예산
	
	public Student(String name, int budget) {
		super();
		this.name = name;
		this.budget = budget;
	}
	public int getBudget() {
		return budget;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", budget=" + budget + "]";
	}

	public void pay(int cost) {
		budget -= cost;
	}

	
	
}
