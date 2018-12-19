package com.atguigu.jdbc;


public class Tere {
	public static void main(String[] args) throws InterruptedException {
		
		/*new Thread(){
			public void run() {

					for(int i=0;i<10000;i++) {
						System.out.println("aa"+i);
					}

			};
		}.start();*/
		Tst a1=new Tst();
		a1.start();
		a1.join();
		for(int i=0;i<1000;i++) {
			System.out.println("aa"+i);
		}
	}
	
}
