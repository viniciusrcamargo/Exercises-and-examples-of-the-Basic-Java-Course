package com.vinicius.cursojava.aula58;

public class TesteAutoBoxing {

	public static void main(String[] args) {
		
		//autoboxing
		Short num7 =  1;
		Byte num8 = 10;
		Integer num9 = 25;
		Long num10 = 25000000l;
		Float num11 = 3.25f;
		Double num12 = 2.555;//new Double(3.14);
		Boolean flag2 = true;//new Boolean(false);
		Character b = 'V';//new Character('b');
		
		//auto un-boxing
		int num13 = num9; //num9.intValue();
		
		//autoboxing em expressões
		num9++;
		
		System.out.println(num9);
		
		//auto unboxing num9 -> autoboxing num13/num9 -> num14
		Integer num14 = num13 / num9;
		
		//mau uso
		
		Double a, d, c;
		a = 10.2;
		d = 12.3;
		c = 25.5;
		
		Double media = (a+b+c)/3;
		System.out.println(media);
		
	}

}
