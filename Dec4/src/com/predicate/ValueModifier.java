package com.predicate;

import java.util.function.Consumer;

public class ValueModifier
{
	public static void  modifyValue(int value, Consumer<Integer>Consumer)
	{
		Consumer.accept(value);
    }
	public static void main(String[] args)
	{
		Consumer<Integer> doubleValue = val -> System.out.println("After doubling the value: " + (val * 2));
        Consumer<Integer> incrementBy = val -> 
        {
            int increment = 3; 
            System.out.println("After incrementing the value by 3: " + (val + increment));
        };
        Consumer<Integer> squareValue = val -> System.out.println("After squaring the value: " + (val * val));
		

	int sampleValue = 5;
	
    System.out.println("Original value: " + sampleValue);
    modifyValue(sampleValue, doubleValue);
    modifyValue(sampleValue, incrementBy);
    modifyValue(sampleValue, squareValue);
	}

}
