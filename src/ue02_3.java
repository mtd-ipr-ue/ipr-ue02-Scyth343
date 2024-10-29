import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.print("Guessing Game - Is your point inside the green square? \n");
        
        Out.print("Enter the x-coordinate: ");
        double x=In.readDouble();
        Out.print("Enter the y-coordinate: ");
        double y=In.readDouble();

        //a2+b2=c2
        double Diam=Math.sqrt(x*x + y*y);

        if((x <= 4) && (x >= 0) && (y >= 0) && (y<=4)){
            if(Diam>=4){
            Out.print("Congrats, It is!");
            }
            else{
            Out.print("It isn't.");
            }
         }
        else{
        Out.print("It isn't.");
        }
        ;
    }
}
