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

		//Fix production bug
		System.out.println("Fixing production defect for v1.1");

		//Implementation of Contact Page
		System.out.println("List of Contacts");
		System.out.println(contact_page.getContactUs());
		
		System.out.println("version 2 pie products : ");
		System.out.println(getNewR2PieProducts());
		
		System.out.println("My Contacts : " + contacts.getContacts());
		
		//Implement Index page
		System.out.println(index_page.getIndexPageContent());
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
