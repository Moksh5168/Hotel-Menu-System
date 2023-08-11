package btechinternship;
import java.util.Scanner;
public class Main {
        
	
	private static String EXIT;

	public static void main(String[] args) {
		float totalPrice;
		Scanner obj =new Scanner(System.in);
		System.out.println("1---------South Indian");
		System.out.println("2---------Punjabi");
		System.out.println("3---------Gujarati");
		System.out.println("4---------Italian");
		System.out.println("5---------EXIT");
		System.out.println("Enter the choice");
		int key = obj.nextInt();
		switch(key) {
		case 1:
			  System.out.println("you have selected South");
			  System.out.println("1----------------DOSA");
			  System.out.println("2----------------IDLI");
			  System.out.println("3----------------UTTAPAA");
			  System.out.println("4----------------VADA");
			  System.out.println("Enter the choice of south you want");
			int choiceDosa=obj.nextInt();
			 switch(choiceDosa) {
			 case 1:System.out.println("You have selectd MASALA DOSA in DOSA Option under South");
			         System.out.println("Enter the number of plates");
			         int qtyDosa=obj.nextInt();
			         totalPrice=qtyDosa*40;
			         System.out.println("The total price of"+qtyDosa+"is"+totalPrice);
			         break;
			      
			 case 2:System.out.println("You have selectd RAVA DOSA in DOSA Option under South");
			         System.out.println("Enter the number of plates");
			         int qtyDosa1=obj.nextInt();
			         totalPrice=qtyDosa1*60;
			         System.out.println("The total price of"+qtyDosa1+"is"+totalPrice);
			         break;
			         
			 case 3:System.out.println("You have selectd GRILL DOSA in DOSA Option under South");
	                System.out.println("Enter the number of plates");
	                int qtyDosa2=obj.nextInt();
	                totalPrice=qtyDosa2*70;
	                System.out.println("The total price of"+qtyDosa2+"is"+totalPrice);
	                break;	 
			 }
			 
		case 2: System.out.println("you have selected Punjabi");
		        System.out.println("1----------------Fix Thali");
		        System.out.println("2----------------Paneer Masala Tika");
		        System.out.println("3----------------Paneer Masla Bhurji");
		        System.out.println("4----------------Mix veg");
		        System.out.println("Enter the chooce of Punjabi you want");
				int choicePunjabi=obj.nextInt();
				 switch(choicePunjabi) {
				 
	     case 1:System.out.println("You have selectd Fixthali in Punjabi Option under Punjab");
		        System.out.println("Enter the number of plates");
		         int qtyPunjabi=obj.nextInt();
		         totalPrice=qtyPunjabi*110;
		         System.out.println("The total price of"+qtyPunjabi+"is"+totalPrice);
		         break;
		      
		 case 2:System.out.println("You have selectd Paneer tika masala in Punjabi Option under South");
		         System.out.println("Enter the number of plates");
		         int qtyPunjabi1=obj.nextInt();
		         totalPrice=qtyPunjabi1*200;
		         System.out.println("The total price of"+qtyPunjabi1+"is"+totalPrice);
		         break;
		         
		 case 3:System.out.println("You have selectd Paneer masala bhurji in Punjabi Option under South");
                System.out.println("Enter the number of plates");
                int qtyPunjabi2=obj.nextInt();
                totalPrice=qtyPunjabi2*150;
                System.out.println("The total price of"+qtyPunjabi2+"is"+totalPrice);
                break;
		 
		 case 4:System.out.println("You have selectd Mix Veg in Punjabi Option under Punjabi");
                System.out.println("Enter the number of plates");
                int qtyPunjabi3=obj.nextInt();
                totalPrice=qtyPunjabi3*250;
                System.out.println("The total price of"+qtyPunjabi3+"is"+totalPrice);
	            break;
         
				 }
		
		case 3: System.out.println("you have selected Gujarti");
        System.out.println("1----------------56 BHOG Gujarati Special Thali");
        System.out.println("2----------------Kathiyavadi Thali");
        System.out.println("3----------------Festive Gujrati Thali");
        System.out.println("4----------------Ras Puri");
        System.out.println("Enter the choice of Gujarati Thali you want");
		int choiceGujarati=obj.nextInt();
		 switch(choiceGujarati) {
		 
     case 1: System.out.println("You have selectd 56 BHOG Gujrati Thali in Gujarati Option under Gujarati");
	         System.out.println("Enter the number of plates");
	         int qtyGujarati=obj.nextInt();
	         totalPrice=qtyGujarati*1000;
	         System.out.println("The total price of"+qtyGujarati+"is"+totalPrice);
	         break;
	      
	 case 2: System.out.println("You have selectd Kathiyavadi Thali in Gujarati Option under Gujarati");
	         System.out.println("Enter the number of plates");
	         int qtyGujarati1=obj.nextInt();
	         totalPrice=qtyGujarati1*400;
	         System.out.println("The total price of"+qtyGujarati1+"is"+totalPrice);
	         break;
	         
	 case 3:System.out.println("You have selectd Festive Gujarati Thali in Gujarati Option under Gujarati");
            System.out.println("Enter the number of plates");
            int qtyGujarati2=obj.nextInt();
            totalPrice=qtyGujarati2*750;
            System.out.println("The total price of"+qtyGujarati2+"is"+totalPrice);
            break;
	 
	 case 4:System.out.println("You have selectd Ras Puri in Gujarati Option under Gujarati");
            System.out.println("Enter the number of plates");
            int qtyGujarati3=obj.nextInt();
            totalPrice=qtyGujarati3*500;
            System.out.println("The total price of"+qtyGujarati3+"is"+totalPrice);
            break;
    
			 }
		
	
		 
    case 4: System.out.println("you have selected Italian");
            System.out.println("1----------------Italian Pizza");
            System.out.println("2----------------Italian Pasta");
            System.out.println("3----------------Festive Italian");
            System.out.println("4----------------Italian Noodels");
            System.out.println("Enter the choice of Italian Thali you want");
		int choiceItalian=obj.nextInt();
		 switch(choiceItalian) {
		 
     case 1: System.out.println("You have selectd Italian Pizza in Italian Option under Italian");
	         System.out.println("Enter the number of plates");
	         int qtyItalian=obj.nextInt();
	         totalPrice=qtyItalian*1000;
	         System.out.println("The total price of"+qtyItalian+"is"+totalPrice);
	         break;
	      
	 case 2: System.out.println("You have selectd Italian Pasta in Italian Option under Italian");
	         System.out.println("Enter the number of plates");
	         int qtyItalian1=obj.nextInt();
	         totalPrice=qtyItalian1*400;
	         System.out.println("The total price of"+qtyItalian1+"is"+totalPrice);
	         break;
	         
	 case 3:System.out.println("You have selectd Festive Festive Italian in Italian Option under Italian");
            System.out.println("Enter the number of plates");
            int qtyItalian2=obj.nextInt();
            totalPrice=qtyItalian2*750;
            System.out.println("The total price of"+qtyItalian2+"is"+totalPrice);
            break;
	 
	 case 4:System.out.println("You have selectd Italian Noodels in Italian Option under Italian");
            System.out.println("Enter the number of plates");
            int qtyItalian3=obj.nextInt();
            totalPrice=qtyItalian3*500;
            System.out.println("The total price of"+qtyItalian3+"is"+totalPrice);
            break;
    
			 }
			 
		 
		
	case 5:System.exit(0);
	
	default:System.out.println("Invaliid choice");

	}
	}
}

		



		
	  
	 
	

