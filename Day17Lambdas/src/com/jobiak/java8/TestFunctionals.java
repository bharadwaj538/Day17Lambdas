package com.jobiak.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFunctionals {
	public static void main(String args[]) {
		Function<String,Integer>lengthFunction=(String str)->{return str.length();};
		
		int result=lengthFunction.apply("Jobiak.com");
		System.out.println(result);
		
		Predicate<Boolean>predicate=(Boolean)->{return 100>45;};
		System.out.println(predicate.test(true));
		
		Consumer<String>consumer=(String str)->{System.out.println(str);};
		consumer.accept("jobiak.ai");
		
		Supplier<Double>supplier=()->Math.random();
		System.out.println(supplier.get());
	}
}
