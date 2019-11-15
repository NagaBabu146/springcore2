package com.nt.model;

public class Adress {
   private String city;

public Adress() {
	System.out.println("Adress:: 0-param constructor");
}

public Adress(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Adress [city=" + city + "]";
}


   
}
