package com.singworld.test;

public class OperationDiv implements Operation {

	@Override
	public double getResult(double NumberA, double NumberB) {
		if(NumberB==0)
		try {
			throw new Exception("��������Ϊ0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return NumberA / NumberB;  
	}

}
