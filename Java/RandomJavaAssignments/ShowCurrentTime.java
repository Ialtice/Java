/*
 * @author Isaac Altice
 * @version 9/4/18
 * Desciption:A program that uses the currentTimeMillis method in the system class to determine the current time from the milliseconds elapsed 
 * since midnight, Jan. 1 1970 GMT.
 * 
 * How do you obtain the current second, minute, hour?
 * You get the current second , minute, hour by invoking the "System.currentTimemillis()" command to get the total numbers of milliseconds 
 * elapsed from midnight jan 1, 1970. Then you perform calculations to get the remainders of the last 24 hour set of hours,minutes, and seconds in
 *  time to display as the current time.
 * 
 * 
 * 
*/
public class ShowCurrentTime {
	public static void main(String[] args) {
		System.out.println("ID001");
		//obtain the total milliseconds since midnight, jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		//obtain the total seconds since midnight, jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		//compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		//obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		//obtain the total hours
		long totalHours = totalMinutes / 60;
		
		//compute current hour
		long currentHour = totalHours % 24;
		
		//display results
		System.out.println("Current time is " + currentHour + ":"
				+ currentMinute + ":" + currentSecond + " GMT");
	}

}
