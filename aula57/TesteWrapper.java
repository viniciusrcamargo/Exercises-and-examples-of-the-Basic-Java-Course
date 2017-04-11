package com.vinicius.cursojava.aula57;

public class TesteWrapper {

	public static void main(String[] args) {
		
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.555;
		boolean flag = true;
		char a = 'a';
		
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(25);
		Long num10 = new Long(25000000l);
		Float num11 = new Float(3.25);
		Double num12 = new Double(3.14);
		Boolean flag2 = new Boolean(false);
		Character b = new Character('b');
		
		Integer num13 = new Integer("1000");
		Double num14 = new Double(3.555);
		
		System.out.println(num13.intValue());
		System.out.println(num13.longValue());
		
		Long num15 = num13.longValue();
		
		int num16 = Integer.parseInt("1000");
		
		System.out.println(num16);
		
		Double num17 = Double.parseDouble("3.5555");
		System.out.println(num17);
		
		Integer num18 = Integer.valueOf(1343);
		System.out.println(num18);
		
		
		
	}

}
