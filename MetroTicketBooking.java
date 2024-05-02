import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
//********color class*******
class Color
{
	static Scanner sc = new Scanner(System.in);
	//colors codes;
	
	static String redbri = "\033[1;91m"; 
	static String reset="\u001B[0m";
	static String bold="\u001B[1m";
	static String blink="\u001B[5m";
	static String red="\u001B[31m";
	static String green="\u001B[32m";
	static String yellow="\u001B[33m";
	static String blue="\u001B[34m";
	static String purple="\u001B[35m";
	static String cyan="\u001B[36m";
	static String white="\u001B[37m";
	static String whitebg="\u001B[47m";
	static String black ="\u001B[30m";
	static String magent = "\u001B[95m";
	static String skblue = "\u001B[36m";

	static final String ital = "\u001B[3m";
	//bright colors;

	static  String redbr = "\033[0;91m";  
    static  String greenbr = "\033[0;92m"; 
    static  String whitebr = "\033[0;97m";
	static String ul = "\u001B[4m";	
}
//**************user class***************
class User
{
	private String UserNameS="java";
	private String PassWordS="133";
	
	void SetterUS(String a)
	{
		this.UserNameS=a;
	}
	String getterUS()
	{
		return UserNameS;
	}
	void SetterPS(String a)
	{
		this.PassWordS=a;
	} 
	String getterPS()
	{
		return PassWordS;
	}
}
//**************Log In*****************
class Login
{
	static Scanner sc = new Scanner(System.in);
	static User obj1 = new User();
	static Color cv=new Color();
	void metrologin(String a)
	{
		switch(a)
		{
			case "1":
				System.out.print(cv.magent+"\n					Please Enter Username : ");
				Login1();
				break;
			case "2":
				SignUp();
				break;
			case "3":
				System.out.print(cv.magent+"\n					Please Enter Username  : ");		
				Reset1();
				break;
			case "4":
				System.exit(0);
			default:
				System.out.println(cv.cyan+"					Invalid Data Re-Enter the following       ");
				System.out.print(cv.red+"					1. Login   2.Signup  3. Reset Password  4. Exit    : ");
				metrologin(sc.next());
				break;
		}
	}
	void Login1()
	{
		if(sc.next().equals(obj1.getterUS()))
		{
			System.out.print(cv.white+"\n					Please Enter Password  : ");
			Login2();
		}
		else
		{
			System.out.print(cv.cyan+"\n					Invalid Username Please Re-Enter : ");
			Login1();
		}	
	}
	void Login2()
	{
		if(sc.next().equals(obj1.getterPS()))
		{
			System.out.println(cv.green+"					Login Successfull \n");
		}
		else
		{
			System.out.print(cv.cyan+"\n					Invalid Password Please Re Enter : ");
			Login2();
		}
	}
	void SignUp()
	{
		System.out.print(cv.skblue+"\n					Please Enter Username  : ");
		obj1.SetterUS(sc.next());
		System.out.print(cv.white+"\n					Please Enter Password : ");
		obj1.SetterPS(sc.next());
		System.out.println(cv.blue+"					Signup Successfull \n");
		System.out.println(cv.blue+"					Please Log In \n ");
		System.out.print(cv.magent+"\n					Please Enter Username : ");		
		Login1();
		
	}
	void Reset1()
	{
		if(sc.next().equals(obj1.getterUS()))
		{
			System.out.print(cv.purple+"\n					Enter Old Password  : ");
			Reset2();
		}
		else
		{
			System.out.print(cv.cyan+"\n					Invalid Username Please Re-Enter : ");
			Reset1();
		}
	}
	void Reset2()
	{
		if(sc.next().equals(obj1.getterPS()))
		{
			System.out.print(cv.red+"\n					Enter New Password : ");
			obj1.SetterPS(sc.next());
			System.out.print("\n					Password Reset Successfully \n");
			System.out.print(cv.blue+"\n					Please Log In  \n");
			System.out.print(cv.magent+"\n					Please Enter Username : ");		
			Login1();
		}
		else
		{
			System.out.print("\n					Invalid Old Password Please Re-Enter : ");
			Reset2();
		}
	}
}
abstract class A
{
	abstract void metro();
	
}
class Display extends A
{ 	
	static int passengers;
	static int rotp;
	static String rotp1;
	static Color cv=new Color();
	static int Source;
	static int dest;
	static int min=1000;
	static int max=9999;
	static String pasNo;
	static Scanner sc=new Scanner(System.in);
	double Amount;
	Date thisDate=new Date();
	SimpleDateFormat dateForm=new SimpleDateFormat("MM/dd/YY  hh:mm a");
	public static void main(String []args)
	{
		Display obj = new Display();
		obj.metro();//metro method calling
		Login obj1 = new Login();
		System.out.println(cv.red+"					Please Enter any one of the following       \n");
		System.out.print(cv.white+"					1. Login   2.Signup  3. Reset Password  4.Exit    : ");
		obj1.metrologin(sc.next());
		System.out.println(cv.skblue+"					Available Metro Stations:                          \n");//log in class
		System.out.println(cv.white+"					1.Miyapur      ");
				System.out.println("					2.JNTU         ");
				System.out.println("					3.KPHB Colony    "); 
				System.out.println("					4.Kukatpally   "); 
				System.out.println("					5.Dr.B.R Ambedkar Balanagar ");
				System.out.println("					6.Moosapet     ");
				System.out.println("					7.Bharat Nagar    ");
				System.out.println("					8.Erragadda    ");
				System.out.println("					9.ESI Hospital    ");
				System.out.println("					10.S.R. Nagar     ");
				System.out.println("					11.Ameerpet     ");
				System.out.println("					12.Punjagutta"); 
				System.out.println("					13.Irrum Manzil   ");
				System.out.println("					14.Khairatabad    ");
				System.out.println("					15.Lakdi-ka-pul    ");
				System.out.println("					16.Assembly   ");
				System.out.println("					17.Nampally   ");
				System.out.println("					18.Gandhi Bhavan    ");
				System.out.println("					19.Osmania Medical College  ");
				System.out.println("					20.MG Bus Station    ");
				System.out.println("					21.Malakpet   ");
				System.out.println("					22.New Market   ");
				System.out.println("					23.Musarambagh    ");
				System.out.println("					24.Dilsuknagar    ");
				System.out.println("					25.Chaitanyapuri   ");
				System.out.println("					26.Victoria Memorial   ");
				System.out.println("					27.LB nagar    ");
		System.out.print(cv.magent+"\n					Enter Number of Passengers(1-6) Or Enter 0 for Exit : ");
		obj.passengers();
		obj.journey();
	}
	//*************exit**************
	void exit()
	{
		System.exit(0);
	}
	//*************metro**********************
	void metro()
	{	
		
		System.out.println(cv.yellow+"			                     ***********************************************************************");
		System.out.println();
		System.out.println(cv.white+cv.blink+"			                         Welcome to the Metro Station Ticket Booking                            "+cv.whitebr);
		System.out.println();
		System.out.println(cv.yellow+"			                     *********************************************************************** \n");
        
        
	}
	//************passengers************************
	void passengers()
	{
		 String a=sc.next();
		if(a.equals("1") || a.equals("2")|| a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6"))
		{
			passengers=Integer.valueOf(a);			
			System.out.print(cv.green+"\n					Enter Source Station Or Enter 0 for Exit: ");
			Source();
		}
		else if(a.equals("0"))
		{
			exit();
		}
			
		else
		{
			System.out.print(cv.skblue+cv.blink+"					Invalid Input Plese Re-Enter Correctly : "+cv.whitebr);
			passengers();
		}
	}
	//*******Source*******
	void Source()
	{
		
		switch(sc.next())
		{
			case "1":
				
				this.Source=1;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
				
			case "2":
				
				this.Source=2;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit:");
				Destination();
				break;
				
			case "3":
				
				this.Source=3;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit :");
				Destination();
				break;
				
			case "4":
				
				this.Source=4;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
				
			case "5":
				
				this.Source=5;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit :  ");
				Destination();
				break;
				
			case "6":
				
				this.Source=6;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
				
			case "7":
				
				this.Source=7;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
				
			case "8":
				
				this.Source=8;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
				
			case "9":
				
				this.Source=9;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
				
			case "10":
				
				this.Source=10;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "11":
				
				this.Source=11;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "12":
				
				this.Source=12;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "13":
				
				this.Source=13;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "14":
				
				this.Source=14;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "15":
				
				this.Source=15;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "16":
				
				this.Source=16;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "17":
				
				this.Source=17;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "18":
				
				this.Source=18;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "19":
				
				this.Source=19;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "20":
				
				this.Source=20;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "21":
				
				this.Source=21;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "22":
				
				this.Source=22;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "23":
				
				this.Source=23;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "24":
				
				this.Source=24;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "25":
				
				this.Source=25;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "26":
				
				this.Source=26;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "27":
				
				this.Source=27;
				System.out.print(cv.white+"\n					Enter Destination Station Or Enter 0 for Exit : ");
				Destination();
				break;
			case "0":
				exit();
				break;
				
			default:
			
				System.out.println("					Invalid Source Station          \n");
				System.out.println("					Available Stations				\n");
				System.out.println("					1.Miyapur      ");
				System.out.println("					2.JNTU         ");
				System.out.println("					3.KPHB Colony    "); 
				System.out.println("					4.Kukatpally   "); 
				System.out.println("					5.Dr.B.R Ambedkar Balanagar ");
				System.out.println("					6.Moosapet     ");
				System.out.println("					7.Bharat Nagar    ");
				System.out.println("					8.Erragadda    ");
				System.out.println("					9.ESI Hospital    ");
				System.out.println("					10.S.R. Nagar     ");
				System.out.println("					11.Ameerpet     ");
				System.out.println("					12.Punjagutta"); 
				System.out.println("					13.Irrum Manzil   ");
				System.out.println("					14.Khairatabad    ");
				System.out.println("					15.Lakdi-ka-pul    ");
				System.out.println("					16.Assembly   ");
				System.out.println("					17.Nampally   ");
				System.out.println("					18.Gandhi Bhavan    ");
				System.out.println("					19.Osmania Medical College  ");
				System.out.println("					20.MG Bus Station    ");
				System.out.println("					21.Malakpet   ");
				System.out.println("					22.New Market   ");
				System.out.println("					23.Musarambagh    ");
				System.out.println("					24.Dilsuknagar    ");
				System.out.println("					25.Chaitanyapuri   ");
				System.out.println("					26.Victoria Memorial   ");
				System.out.println("					27.LB nagar    ");
				System.out.print("					Re-Enter Source Station Number : ");
				
				Source();
		}
	}
	//******Destination *******
	void Destination()
	{
		
		switch(sc.next())
		{
			case "1":
			
				this.dest=1;
				break;
				
			case "2":
			
				this.dest=2;
				break;
				
			case "3":
			
				this.dest=3;
				break;
				
			case "4":
			
				this.dest=4;
				break;
				
			case "5":
			
				this.dest=5;
				break;
				
			case "6":
			
				this.dest=6;
				break;
				
			case "7":
			
				this.dest=7;
				break;
				
			case "8":
			
				this.dest=8;
				break;
				
			case "9":
			
				this.dest=9;
				break;
				
			case "10":
			
				this.dest=10;
				break;
				
			case "11":
			
				this.dest=11;
				break;
				
			case "12":
			
				this.dest=12;
				break;
				
			case "13":
			
				this.dest=13;
				break;
				
			case "14":
			
				this.dest=14;
				break;
				
			case "15":
			
				this.dest=15;
				break;
				
			case "16":
			
				this.dest=16;
				break;
				
			case "17":
			
				this.dest=17;
				break;
				
			case "18":
			
				this.dest=18;
				break;
				
			case "19":
			
				this.dest=19;
				break;
				
			case "20":
			
				this.dest=20;
				break;
				
			case "21":
			
				this.dest=21;
				break;
				
			case "22":
			
				this.dest=22;
				break;
				
			case "23":
			
				this.dest=23;
				break;
				
			case "24":
			
				this.dest=24;
				break;
				
			case "25":
			
				this.dest=25;
				break;
				
			case "26":
			
				this.dest=26;
				break;
				
			case "27":
			
				this.dest=27;
				break;
			case "28":
				exit();
				break;
				
			default:
			
				System.out.println(cv.whitebr+"					Invalid Destination Station :                         \n ");
				System.out.println("					Available Destination Stations:						\n"); 
				System.out.println("					1.Miyapur      ");
				System.out.println("					2.JNTU         ");
				System.out.println("					3.KPHB Colony    "); 
				System.out.println("					4.Kukatpally   "); 
				System.out.println("					5.Dr.B.R Ambedkar Balanagar ");
				System.out.println("					6.Moosapet     ");
				System.out.println("					7.Bharat Nagar    ");
				System.out.println("					8.Erragadda    ");
				System.out.println("					9.ESI Hospital    ");
				System.out.println("					10.S.R. Nagar     ");
				System.out.println("					11.Ameerpet     ");
				System.out.println("					12.Punjagutta"); 
				System.out.println("					13.Irrum Manzil   ");
				System.out.println("					14.Khairatabad    ");
				System.out.println("					15.Lakdi-ka-pul    ");
				System.out.println("					16.Assembly   ");
				System.out.println("					17.Nampally   ");
				System.out.println("					18.Gandhi Bhavan    ");
				System.out.println("					19.Osmania Medical College  ");
				System.out.println("					20.MG Bus Station    ");
				System.out.println("					21.Malakpet   ");
				System.out.println("					22.New Market   ");
				System.out.println("					23.Musarambagh    ");
				System.out.println("					24.Dilsuknagar    ");
				System.out.println("					25.Chaitanyapuri   ");
				System.out.println("					26.Victoria Memorial   ");
				System.out.println("					27.LB nagar    ");
				System.out.print("					Re-Enter Destination Number : ");
				Destination();
		}
		if(Source == dest)
		{
			System.out.println(cv.red+"					Source and Destination should not be same \n");
			System.out.print(cv.blink+cv.skblue+"					Please Re-Enter Correct Destination : "+cv.whitebr);
			Destination();
		
		}
	}	
	//*****Choosing Ticket Type(journey->price)******
	void journey()
	{	System.out.println();
		System.out.println(cv.skblue+"					Choose Ticket Type Or Enter 0 for Exit ");
		System.out.print(cv.white+"\n					0.Exit  1.One Way    2.With Return : ");
		String journey=sc.next();
		
		switch(journey)
		{
			case "1":
			
					price(journey);
					break;
					
			case "2":
			
					price(journey);
					break;
			case "0":
					exit();
					break;
					
			default:
			
					System.out.println(cv.cyan+"					Invalid Ticket Type \n");
					journey();
		}
	}
	//******price calculation (payment,journey confirmation)*****
	
	void price(String journey)
	{	

		int diff=dest-Source;
		if(diff<0)
		{
			diff=-diff;
		}
		if(diff<=10){
		
			Amount =(double)diff*Integer.valueOf(journey)*passengers*10;
			System.out.printf(cv.skblue+"\n					price:  %.2f ",Amount);
			System.out.println();
		}
		else if(diff>10 && diff<=15)
		{
			Amount =90.00*passengers;
			System.out.printf(cv.skblue+"\n					price:  %.2f ",Amount);
			System.out.println();
		}
		else if(diff>15 && diff<=22){
			Amount =120.00*passengers;
			System.out.printf(cv.skblue+"\n					price:  %.2f ",Amount);
			System.out.println();
		}
		else if(diff>22 && diff<=27){
			Amount =140.00*passengers;
			System.out.printf(cv.skblue+"\n					price:  %.2f ",Amount);
			System.out.println();
		}
			
			
		payment(Amount);
		JourneyConfirmation();
		
	}
	//*****payment*******
	
	void payment(double Amount)
	{
		System.out.print(cv.magent+"					Enter 1 for Payment Or Enter 0 for exit :");
					 
		String payment=sc.next();
		
		switch(payment)
		{
					
			case "1":
					 upi();
					 break;
			case "0":
					exit();
					break;
					 
			default:
			
					System.out.println(cv.cyan+"\n					Invalid Payment Option \n");
					payment(Amount);
		}
	}
	//*******(Online Payment Options)(upi())*******	
	void upi()
	{				
					System.out.print("\n					Enter 1-3 for Online Payment Options Or Enter 0 for Exit\n");
					 System.out.println(cv.white+"					1.Gpay\n");
					 System.out.println(cv.white+"					2.PhonePe\n");
					 System.out.println(cv.white+"					3.Paytm\n");
					 System.out.print("					Enter :");
		switch(sc.next())
		{
			case "1":
					System.out.println(cv.blue+"					Redirecting to Gpay"+cv.blink+"......"+cv.whitebr);
					pin();
					break;
			case "2":
					System.out.println(cv.magent+"					Redirecting to PhonePe"+cv.blink+"......"+cv.whitebr);
					pin();
					break;
			case "3":
					System.out.println(cv.green+"					Redirecting to Paytm"+cv.blink+"......"+cv.whitebr);
					pin();
					break;
			case "0":
					exit();
					break;
			default:
					System.out.println(cv.cyan+"					Invalid Option");
					upi();
		}
	}
	//****pin validation******
	void pin()
	{
		System.out.print(cv.red+"\n					Please Enter UPI Pin Or Enter 0 for exit : ");
		String x=sc.next();
		if(new pin().getterpin().equals(x))
		{
			JourneyConfirmation();
		}
		else if(x.equals("0"))
		{
			exit();
		}
			
		else
		{
			System.out.print(cv.green+"\n					Invalid Pin  : ");
			pin();
		}
	}
		
	//***** JourneyConfirmation****ticket number generator****
	void JourneyConfirmation()
	{	
		rotp=(int)(Math.random()*(max-min)+min);
		rotp1=""+rotp;
		ticketdisplay();
		entryyvalidation obj2=new entryyvalidation();
		obj2.m3();
		
	}
	//*****ticketdisplay*********
	void ticketdisplay()
	{
		
		String From="";
		String To="";
		switch(String.valueOf(Source))
		{
			case "1":
					From="Miyapur";
					break;
			case "2":
					From="JNTU College";
					break;
			case "3":
					From="KPHB Colony";
					break;
			case "4":
					From="Kukatpally";
					break;
			case "5":
					From="Dr.B.R.Ambedkar Balanagar";
					break;
					
			case "6":
					From="Moosapet";
					break;
			case "7":
					From="Bharat Nagar";
					break;
			case "8":
					From="Erragadda";
					break;
					
			case "9":
					From="ESI Hospital";
					break;
					
			case "10":
					From="S.R. Nagar";
					break;
					
			case "11":
					From="Ameerpet";
					break;
					
			case "12":
					From="Punjagutta";
					break;
					
			case "13":
					From="Irrum Manzil";
					break;
					
			case "14":
					From="Khairatabad";
					break;
					
			case "15":
					From="Lakdi-ka-pul";
					break;
					
			case "16":
					From="Assembly";
					break;
					
			case "17":
					From="Nampally";
					break;
					
			case "18":
					From="Gandhi Bhavan";
					break;
			
			case "19":
					From="Osmania Medical College";
					break;
					
			case "20":
					From="MG Bus Station";
					break;
					
			case "21":
					From="Malakpet";
					break;
					
			case "22":
					From="New Market";
					break;
					
			case "23":
					From="Musarambagh";
					break;
					
			case "24":
					From="Dilsuknagar";
					break;
					
			case "25":
					From="Chaitanyapuri";
					break;
					
			case "26":
					From="Victoria Memorial";
					break;
					
			case "27":
					From="L.B Nagar";
					break;
		}
		switch(String.valueOf(dest))
		{
			case "1":
					To="Miyapur";
					break;
			case "2":
					To="JNTU College";
					break;
			case "3":
					To="KPHB Colony";
					break;
			case "4":
					To="Kukatpally";
					break;
			case "5":
					To="Dr.B.R.Ambedkar Balanagar";
					break;
					
			case "6":
					To="Moosapet";
					break;
			case "7":
					To="Bharat Nagar";
					break;
			case "8":
					To="Erragadda";
					break;
					
			case "9":
					To="ESI Hospital";
					break;
					
			case "10":
					To="S.R. Nagar";
					break;
					
			case "11":
					To="Ameerpet";
					break;
					
			case "12":
					To="Punjagutta";
					break;
					
			case "13":
					To="Irrum Manzil";
					break;
					
			case "14":
					To="Khairatabad";
					break;
					
			case "15":
					To="Lakdi-ka-pul";
					break;
					
			case "16":
					To="Assembly";
					break;
					
			case "17":
					To="Nampally";
					break;
					
			case "18":
					To="Gandhi Bhavan";
					break;
			
			case "19":
					To="Osmania Medical College";
					break;
					
			case "20":
					To="MG Bus Station";
					break;
					
			case "21":
					To="Malakpet";
					break;
					
			case "22":
					To="New Market";
					break;
					
			case "23":
					To="Musarambagh";
					break;
					
			case "24":
					To="Dilsuknagar";
					break;
					
			case "25":
					To="Chaitanyapuri";
					break;
					
			case "26":
					To="Victoria Memorial";
					break;
					
			case "27":
					To="L.B Nagar";
					break;
					
		}
				//*******Ticket Printing*****
		System.out.println(cv.yellow+"					--------------------------------------");
		System.out.println(cv.white+"						Hyderabad Metro-Ticket    ");
		System.out.println(cv.yellow+"					--------------------------------------");
		System.out.println(cv.white+"					Date/Time	:"+dateForm.format(thisDate));
		System.out.println(cv.white+"					From		: "+From+" ("+Source+")");
		System.out.println(cv.white+"					To		: "+To+" ("+dest+")");
		System.out.println(cv.white+"					No of Passengers: "+passengers);
		System.out.println(cv.white+"					Price		: "+Amount+"/-");
		System.out.println(cv.yellow+"					--------------------------------------");
		System.out.println(cv.white+"					Ticket No		: "+rotp1);
		System.out.println(cv.yellow+"					--------------------------------------");
		System.out.println(cv.white+"					Please Retain Till the end of Journey! ");
		System.out.println(cv.yellow+"					--------------------------------------");
	
	}
}
//***** Entry Validation*******;
interface entryValidation
{
	void EntryValidation();
}
							
class entryyvalidation extends Display implements entryValidation
{
	void m3()
	{
		System.out.println(cv.yellow+"						*** Entry Validation *** \n");
		EntryValidation();
	}
	
	public void EntryValidation()
	{	
	
		System.out.println(cv.skblue+"					Please Validate Your TicketNumber \n");
		System.out.print(cv.green+"					Enter Your Ticket Number : ");
		entryticketvalidation();
		
	}
	void entryticketvalidation()
	{
		String ticket_No=sc.next();
		
		if(ticket_No.equals(rotp1))
		{ 	System.out.println(cv.red+cv.blink+"					Entry for Only "+passengers+" Members \n"+cv.whitebr);
			for(int i=1;i<=passengers;i++)
			 {
				
				if(i==1)
					System.out.println(cv.yellow+"\n					"+i+"st Member Entered Succesfully  ");
				else if(i==2)
					System.out.println(cv.yellow+"\n					"+i+"nd Member Entered Succesfully ");
				else if(i==3)
					System.out.println(cv.yellow+"\n					"+i+"rd Member Entered Succesfully  ");
				else
					System.out.println(cv.yellow+"\n					"+i+"th Member Entered Succesfully ");
			 }
			
			System.out.println(cv.skblue+"\n					Board the Train:Proceed to the platform, and wait for the train\n");
			exittvalidation obj3=new exittvalidation();
			obj3.m2(); 
		}
		else
		{
			System.out.println(cv.cyan+cv.blink+"\n					Invalid Please Enter Valid Ticket Number \n"+cv.whitebr);
			System.out.print(cv.green+"					Enter Your Ticket Number :");
			entryticketvalidation();
		}
	}
}
	//*****Exit Validation********
interface exitValidation
{
	void ExitValidation();
	
}
					
class exittvalidation extends Display implements exitValidation
{
	static int location1;
	void m2()
	{
		System.out.println(cv.yellow+"						*** Exit Validation ***\n");
		ExitValidation();
	}
	
	public void ExitValidation()
	{	
		//System.out.println("Exit Metro");
		System.out.println(cv.red+"					Please Validate Your TicketNumber \n");
		System.out.print(cv.green+"					Enter Your Ticket Number : ");
		exitticketvalidation();
	}
	void exitticketvalidation()
	
	{
		String ticket_No=sc.next();
		if(ticket_No.equals(rotp1)){
		System.out.print(cv.skblue+"\n					Enter your destination station number : ");
		destiny();
		String  spin=""+rotp;
		
		if(ticket_No.equals(rotp1))
		{
			
			if(location1==dest)
			{
				System.out.println(cv.red+cv.blink+"\n					Exit for Only "+passengers+" Members \n"+cv.whitebr);
			 
			 for(int i=1;i<=passengers;i++)
			 {
				if(i==1)
					System.out.println(cv.yellow+"\n					"+i+"st Member Exited Succesfully ");
				else if(i==2)
					System.out.println(cv.yellow+"\n					"+i+"nd Member Exited Succesfully ");
				else if(i==3)
					System.out.println(cv.yellow+"\n					"+i+"rd Member Exited Succesfully ");
				else
					System.out.println(cv.yellow+"\n					"+i+"th Member Exited Succesfully ");
			 }
			 System.out.println(cv.green+cv.blink+"\n					THANK YOU VISIT AGAIN..."+cv.whitebr);
			 System.exit(0);
				
			}
			else if(location1>dest)
			{
				System.out.println(cv.blue+cv.blink+"					INVALID DESTINATION \n"+cv.whitebr);
				System.out.println(cv.red+"					PLEASE CONTACT METRO ENQUIRY \n");
				System.exit(0);
				
			}
				
			else if(location1<dest)
			{
				System.out.println(cv.blue+"					Invalid Destination \n" );
				System.out.println(cv.red+"					PLEASE CONTACT METRO ENQUIRY \n");
				System.exit(0);
				
			}
			else if(location1>27)
			{
				System.out.println(cv.blue+"					Invalid Destination \n");
				exitticketvalidation();
			}	 
		}
		else
		{
			
			System.out.println(cv.yellow+"					Please Enter Valid Ticket Number");
			exitticketvalidation();
		}
		}
		else
		{
			System.out.print(cv.blue+cv.blink+"					Invalid Please Enter Valid Ticket Number : "+cv.whitebr);
			exitticketvalidation();
		}
	}
	void destiny()
	{
		
		switch(sc.next())
		{
			case "1":
			
				this.location1=1;
				break;
				
			case "2":
			
				this.location1=2;
				break;
				
			case "3":
			
				this.location1=3;
				break;
				
			case "4":
			
				this.location1=4;
				break;
				
			case "5":
			
				this.location1=5;
				break;
				
			case "6":
			
				this.location1=6;
				break;
				
			case "7":
			
				this.location1=7;
				break;
				
			case "8":
			
				this.location1=8;
				break;
				
			case "9":
			
				this.location1=9;
				break;
				
			case "10":
			
				this.location1=10;
				break;
				
			case "11":
			
				this.location1=11;
				break;
				
			case "12":
			
				this.location1=12;
				break;
				
			case "13":
			
				this.location1=13;
				break;
				
			case "14":
			
				this.location1=14;
				break;
				
			case "15":
			
				this.location1=15;
				break;
				
			case "16":
			
				this.location1=16;
				break;
				
			case "17":
			
				this.location1=17;
				break;
				
			case "18":
			
				this.location1=18;
				break;
				
			case "19":
			
				this.location1=19;
				break;
				
			case "20":
			
				this.location1=20;
				break;
				
			case "21":
			
				this.location1=21;
				break;
				
			case "22":
			
				this.location1=22;
				break;
				
			case "23":
			
				this.location1=23;
				break;
				
			case "24":
			
				this.location1=24;
				break;
				
			case "25":
			
				this.location1=25;
				break;
				
			case "26":
			
				this.location1=26;
				break;
				
			case "27":
			
				this.location1=27;
				break;
				
			default:
			
				System.out.print(cv.whitebr+"					Invalid Destination Station Please Re-Enter:                         \n ");
				destiny();
		}
	}
}
//***********upi class*****
class pin
{
	private String  pin="4321";
	String getterpin()
	{
		return pin;
	}
}