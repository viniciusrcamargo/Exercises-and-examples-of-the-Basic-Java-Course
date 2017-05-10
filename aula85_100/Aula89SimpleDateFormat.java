package com.vinicius.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.vinicius.cursojava.aula44.Cachorro;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/y HH:mm:ss Z");
		
		Calendar data = new GregorianCalendar(2010, 2, 20, 14, 32, 25);
		
		System.out.println(sdf.format(data.getTime()));
		
		Date hoje = new Date();
		
		System.out.println(sdf.format(hoje));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/y");
		String minhaData = "20/02/2017";
		
		try {
			Date minhaDataEmdate = sdf1.parse(minhaData);
			System.out.println(minhaDataEmdate);
			System.out.println(sdf.format(minhaDataEmdate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
