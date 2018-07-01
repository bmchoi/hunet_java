package com.hunet.java.ch07;

public class Address{
	public static void main(String[] args) {
		AddressList addressList = new AddressList();
		addressList.setName("홍길동");
		addressList.setAddr("서울시");
		addressList.setTel("02-7777-7777");;
		
		System.out.println(addressList.getName() + " " + addressList.getAddr() + " " + addressList.getTel());
		
	}
}

class AddressList {
	private String name;
	private String addr;
	private String tel;
	
	public AddressList() {}
	public AddressList(String name, String addr, String tel) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
