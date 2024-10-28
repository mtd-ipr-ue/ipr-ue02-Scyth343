import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        // circleSector= Math.PI*Math.sqrt(4)*(90/360);
        // YmaxCircle=4;
        // XmaxCircle=4;
        Out.print("Guessing Game - Is your point inside the green square? \n");
        
        Out.print("Enter the x-coordinate: ");
        double x=In.readDouble();
        Out.print("Enter the y-coordinate: ");
        double y=In.readDouble();

        //a2+b2=c2
        double SquareDiam=(Math.sqrt(16+16));

        if((x >= 4) && (y>=4)){
        if((x <= SquareDiam) &&( y <= SquareDiam)){
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

/*In.readdouble
zuerst abfragen ob es in der grünen fläche ist (nicht darüber hinaus)
dann checken ob größer oder kleiner als radius
*/
