package com.singworld.test;

public class test {
	public static void main(String[] args){
		Operation oper;
		oper = OperationFactory.createOperate("+");	
		System.out.println(oper.getResult(1, 2));
	}
}
