package com.atguigu.jdbc;

public class Tst extends Thread{
	public void run() {
		for(int j=0;j<1000;j++) {
			System.out.println("bb"+j);
		}	
	}
}