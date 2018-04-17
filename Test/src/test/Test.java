package test;

import java.util.Random;

public class Test {
	

	public static void main(String[] args) {
		Dog d= new Dog("dog1", "wangwang");
		Dog d2=d;
		Dog d3= new Dog("dog1","wangwang");
		System.out.println(d==d2);
		System.out.println(d==d3);
		System.out.println(d.equals(d3));
		String name= new String("123");
		String name1=new String("123");
		System.out.println(name.equals(name1));
		System.out.println(name==name1);
		System.out.println(Integer.toBinaryString(0x14));//16进制
		System.out.println(Integer.toBinaryString(014));//8进制
		System.out.println(Integer.toBinaryString(14));//十进制
	}
	
	
}
class Dog{
	public String name;
	public String says;
	public Dog(String name, String says) {
		this.name = name;
		this.says = says;
	}
	//复写equals方法
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Dog) {
			Dog objdog= (Dog)obj;
//			这样的写法不好，不利于性能提升
//			boolean n1= objdog.name.equals(this.name);
//			boolean n2= objdog.says.equals(this.says);
			//这样会有短路的现象出现，有助于提升性能
			if(objdog.name.equals(this.name) && objdog.says.equals(this.says)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
}