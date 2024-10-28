import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.print("Enter a year. (any) ");
        int year=In.readInt();
        Out.print("Enter a valid month ");
        int month=In.readInt();
        
        boolean leapyear;
        if (year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leapyear=true;
                }
                else{
                    leapyear=false;
                }
            }
            
            else{
                leapyear=false;
            }
        }
        else{
            leapyear=false;
        }
        
        Out.print("Your month has ");
           

    if ((month<=12) && (month>0)){
        switch(month){
        case 1,3,5,7,8,10,12:
            Out.print("31 days");

        case 4,6,9,11:
            Out.print("30 days");

        case 2:
        if (leapyear==true){
            Out.print("29 days (leapyear)");
        }

        else{
            Out.print("28 days");
        }
    }

    }

   

}
}