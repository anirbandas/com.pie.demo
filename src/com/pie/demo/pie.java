package com.pie.demo;

public class pie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pie products..");
		
		System.out.println("version 1 pie products : ");
		System.out.println(getOldPieProducts());
		
		System.out.println("version 2 pie products : ");
		System.out.println(getNewR2PieProducts());
		
		System.out.println("My Contacts : " + contacts.getContacts());
	}
	
	public static String getOldPieProducts()
	{
		return "Pie old 1, Pie old 2";
	}
	
	public static String getNewR2PieProducts()
	{
		return "Pie R2 1, Pie R2 2";
	}

}
