package udemyPractices.InnerClasses;

import java.util.Scanner;

import udemyPractices.InnerClasses.Button.OnClickListener;



public class ButtonMain {

	private static Scanner scanner =  new Scanner(System.in);
	private static Button btnPrint = new Button("Print");
	
	
	public static void main(String[] args) {
		
//		class ClickListener implements Button.OnClickListener{
//			public ClickListener() {
//				System.out.println("I've been attached");
//			}
//
//			@Override
//			public void onClick(String title) {
//				System.out.println(title +" was clicked");
//				
//			}
//		}
//		btnPrint.setOnClickLister(new ClickListener());
		
		//for anonymous class
		btnPrint.setOnClickLister(new OnClickListener() {
			
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
				
			}
		});
		
		listen();
	}
	private static void  listen() {
		boolean quit = false;
		while (!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				btnPrint.onClick();
				
				
			default:
				break;
			}
		}
	}

}
