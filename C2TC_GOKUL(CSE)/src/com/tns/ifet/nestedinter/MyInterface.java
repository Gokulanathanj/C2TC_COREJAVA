package com.tns.ifet.nestedinter;

public interface MyInterface {
	void calculateArea();
    interface MyInnerInterface {
       int  id = 20;
       void print();     
    }
}