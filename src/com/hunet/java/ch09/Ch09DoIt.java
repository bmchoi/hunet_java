package com.hunet.java.ch09;

public class Ch09DoIt {
	String salary;
	float money;
	float allowance;
	float tax;
	float wages;
	String grade;
	public Ch09DoIt(String salary, float money, String grade) {
		super();
		this.salary = salary;
		this.money = money;
		this.grade = grade;
		setAllowance();
		setTax();
		setWages();
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public float getAllowance() {
		return allowance;
	}
	public void setAllowance() {
		this.allowance = (float) (money*0.15);
	}
	public float getTax() {
		return tax;
	}
	public void setTax() {
		this.tax = (float) (money*0.20);
	}
	public float getWages() {
		return wages;
	}
	public void setWages() {
		this.wages = money+getAllowance()-getTax();
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Ch09DoIt [salary=" + salary + ", money=" + money + ", allowance=" + allowance + ", tax=" + tax
				+ ", wages=" + wages + ", grade=" + grade + "]";
	}
	public static void main(String[] args) {
		Ch09DoIt salary[] = new Ch09DoIt[3];
		salary[0] = new Ch09DoIt("A11",780000,"관리자");
		salary[1] = new Ch09DoIt("B11",450000,"영업");
		salary[2] = new Ch09DoIt("C11",270000,"영업");
		
		System.out.println(salary[0].toString());
		System.out.println(salary[1].toString());
		System.out.println(salary[2].toString());
	}

}
