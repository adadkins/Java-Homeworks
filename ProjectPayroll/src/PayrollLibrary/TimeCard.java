/*
Author: Jordan Adkins
Abstract: This class contains data for storing the clock in and clock out times of an employee for two weeks. The clock in and out times
will be imported via a string and then converted to the decimal forms in the program. There is also a method that can be called that can
can calculate the elapsed times for the two week time card.
Date: 3/20/18
 */
package PayrollLibrary;

/**
 *
 * @author jordanadkins
 */
public class TimeCard implements DisplayObject, Parser {
    private int empNum;                                 //All variables needed for the time card class
    private final String sclockIn[] = new String[14];
    private final String sclockOut[] = new String[14];
    private final float fclockIn[] = new float[14];
    private final float fclockOut[] = new float[14];
    private final float fElapsedTimes[] = new float[14];
    
    public TimeCard(){              //Timecard constructor no params
        
    }
    
    public TimeCard(int empNum){     //TimeCard constructor & assignment of input param.
        this.empNum = empNum; 
    }
    
    public int getempNumber(){      //empNumber accessor
        return empNum;
    }
    public String getsclockIn(int day){ // sclockIn accessor
        if (day >= 0 && day<14)
            return sclockIn[day];
        System.out.print("Invalid Entry. Day must be between 0 and 13.");
        return null;
    }
    
    public String getsclockOut(int day){        //sclockOut accessor
        if (day >= 0 && day<14)
            return sclockOut[day];
        System.out.print("Invalid Entry. Day must be between 0 and 13.");
        return null;
    }
    
    public void setsclockIn(int day, String time){ // sclockIn mutator
        if (day >=0 && day < 14){
            if ((PRLib.getHours(time)>=0 && PRLib.getHours(time) < 24) && (PRLib.getMinutes(time) >=0 && PRLib.getMinutes(time) <60)){
            sclockIn[day] = time;
            fclockIn[day] = PRLib.convAndRoundTime(time);
                }else 
                System.out.print("Invalid time Entry. Time must be between 00:00 and 23:59");

        }else 
            System.out.print("Invalid Entry. Day must be between 0 and 13.");
        calculateElapsedTimes();
    }
    
    public void setsclockOut(int day, String time){         //sclockOut mutator
        if (day >=0 && day < 14){
            if ((PRLib.getHours(time)>=0 && PRLib.getHours(time) < 24) && (PRLib.getMinutes(time) >=0 && PRLib.getMinutes(time) <60)){
            sclockOut[day] = time;
            fclockOut[day] = PRLib.convAndRoundTime(time);                                  
                }else 
                System.out.print("Invalid time Entry. Time must be between 00:00 and 23:59");

        }else 
            System.out.print("Invalid Entry. Day must be between 0 and 13.");
        calculateElapsedTimes();
    }
    
    public float getfclockIn(int day){          // fclockIn accessor
        if (day >= 0 && day < 14)
            return fclockIn[day];
        System.out.print("Invalid Entry. Day must be between 0 and 13.");
        return 0;
    }
    
    public float getfclockOut(int day){         // fclockOut accessor
        if (day >= 0 && day < 14)
            return fclockOut[day];
        System.out.print("Invalid Entry. Day must be between 0 and 13.");
        return 0;
    }
    
    public float getElapsedTime(int day){           // ElapsedTime accessor
        if (day >= 0 && day < 14)
            return fElapsedTimes[day];
        System.out.print("Invalid Entry. Day must be between 0 and 13.");
        return 0;
    }
    
    
    public void setempNumber(int num){         // empNum mutator
        if (num> 0)
            empNum = num;
        
    }


    public void calculateElapsedTimes(){                // method to point fElapsedTimes to calculateElapsedTime
        for (int day = 0; day <14; day++)
            fElapsedTimes[day] = PRLib.calculateElapsedTime(day, fclockIn, fclockOut);
    
    }
    
    
    @Override
    public String displayData(){            // method to display data as a string
        String display = getempNumber() +"\n\nDay\tsClock-In\tsClock-Out\tfClock-In\tfClock-Out\tElapsed Time";
        for (int day = 0; day<14; day++){
            display = display + "\nDay " + (day + 1) + ": " + getsclockIn(day) + "\t\t" + getsclockOut(day) + "\t\t" + getfclockIn(day) + "\t\t" + getfclockOut(day) + "\t\t" + getElapsedTime(day);
        }
      return display;          
    }
    
    public String dataWriter(){  // method to display data as a comma delimited string
        String display = "" + getempNumber();
        for (int day = 0; day<14; day++)
            display = display + "," + sclockIn[day] + "," + sclockOut[day] ;
      return display;          
    }
    
    /*
 *   This method calculates shiftHours.  The method accepts the shift
 *   start and endTimes and the employees clockIn and out times and
 *   returns the number of hours worked in the shift.
 */
public static float calculateShift(float startTime, float endTime,
    float clockIn, float clockOut, int shift)
{   
    if (shift ==1 && (clockOut<clockIn)){
        clockOut = clockOut + 24.00f;
    }
    //  Declare variables.
    float shiftHours;
    boolean overnightClock = false;
    boolean overnightShift = false;


    //  If the shift endTime is less than the shift startTime, 
    //  add 24 hours to the shift endTime.
    if (endTime < startTime)
    {
        endTime += 24.00;
        overnightShift = true;
    }

    //  If the clockOut time is less than the clockIn time, 
    //  add 24 hours to the clockOut time.
    if (clockOut < clockIn)
    {
        clockOut += 24.00;
        overnightClock = true;
    }


    //  If not overnight shift, but overnight clock, 
    //  subtract 24.0 hours from both the clock in and clock out.
    if (!overnightShift)
    {
        if (overnightClock)
        {
            clockIn -= 24.0;
            clockOut -= 24.0;
        }
    }

    //  If the clockIn time is before the shift startTime, 
    //  set the clockIn time to the startTime.
    if (clockIn < startTime)
    {
        clockIn = startTime;
    }

    //  If the clockOut time exceeds the shift endTime, 
    //  set the clockOut time to the endTime.
    if (clockOut > endTime)
    {
        clockOut = endTime;
    }
     //  ShiftHours is the difference between clockOut and clockIn.
    shiftHours = clockOut - clockIn;

    //  if the shiftHours are negative, set shiftHours to zero.
    if (shiftHours < 0)
    {
        shiftHours = 0;
    }

    //  Return the shiftHours.
    return shiftHours;
}


    @Override
    public void parse(String input) {               //will parse a comma delimited input string
       String splitFields[];
       splitFields = input.split(",");
       setempNumber(Integer.parseInt(splitFields[0]));
       for (int a = 0; a<14; a++)
           setsclockIn(a, splitFields[(2*a+1)]);
       
       for (int a = 0; a<14; a++)
           setsclockOut(a, splitFields[2 * (a+1)]);
    }
}
