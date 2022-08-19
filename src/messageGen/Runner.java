package messageGen;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;


public class Runner{
	public static void main(String[] args){
		//variables
		Scanner s = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTimeZone().getDisplayName());
		
		//format the date for the first day(aka Tuesday war)
		System.out.println("All below values should be done for the Tuesday night/Wednesday morning war, the rest will be calculated for you. \nPlease input the month of the Tuesday war.");
		c.set(Calendar.MONTH,s.nextInt()-1);
		System.out.println("Please input the day for the war(i.e. 08 for the 8th of the month)");
		c.set(Calendar.DATE, s.nextInt());
		System.out.println("Please input the year for the war(i.e. 2022)");
		c.set(Calendar.YEAR, s.nextInt());
		System.out.println("Please input the hour of the day the war starts using 24 hour clock(i.e. for 8PM it would be 20)");
		c.set(Calendar.HOUR_OF_DAY, s.nextInt());
		c.set(Calendar.MINUTE, 0);
		Date tue = c.getTime();
		
		//Divide tue.getTime() by 1000 to get the epoch unix timestamp
		long tues = tue.getTime()/1000;
		//86400 added to make 1 days later
		long thurs = tues + (86400*2);
		long sat = thurs + (86400*2);
		
		//output the final message
		System.out.println("<t:"+tues+":F> :white_check_mark: = Attending, :x: = Can't Make it\n\n<t:"+thurs+":F> :white_check_mark: = Attending, :x: = Can't Make it\n\n<t:"+sat+":F> :white_check_mark: = Attending, :x: = Can't Make it");
		  System.out.println("Press Enter To Continue...");
		  
		  //use scanner to pause for copy/pasting things
		  s.nextLine();
		  s.nextLine();
		  s.close();
		
	}
}
	