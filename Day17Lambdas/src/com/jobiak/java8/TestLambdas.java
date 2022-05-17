package com.jobiak.java8;

interface Test{
	public default void paint() {System.out.println("From default method");};
	public static void method() {System.out.println("from static method");};
	public abstract void print();
}

interface Test2{
	public void add(int a, int b);
}
public class TestLambdas {

	public static void main(String[] args) {
		
		Test test =() -> {
			System.out.println("From abstract method");
			};
		test.print();
		test.paint();
		
		
		Test2 test2 =(int a,int b) -> {
			int c=a+b; 
			System.out.println(c);
			};
		test2.add(20,30);
		
		Runnable r=() ->{
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+i);
			}
		};
		Thread t=new Thread(r);
		t.start();
	}
}
