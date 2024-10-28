import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.print("Gib die erste Zahl ein. ");
        int num1=In.readInt();
        Out.print("Gib die zweite Zahl ein. ");
        int num2=In.readInt();
        Out.print("Gib die dritte Zahl ein. ");
        int num3=In.readInt();

//BASICS
        if ((num1>num2) && (num1>num3)){
            Out.print("Die höchste Zahl ist " +num1 +".");

        }

        else if ((num2>num1) && (num2>num3)){
            Out.print("Die höchste Zahl ist " +num2 +".");
          
        }

        else if ((num3>num1) && (num3>num2)){
            Out.print("Die höchste Zahl ist " +num3 +".");
          
        }

        else if ((num1==num2) && (num1==num3)){
            Out.print("Das Maximum ist "+num1 +", da alle Zahlen gleich groß sind.");
            
        }
//Specificity

        else if ((num1>num2) && (num1==num3)){
            Out.print("Die höchste Zahl ist " +num1 +".");
          
        }

        else if ((num1==num2) && (num1>num3)){
            Out.print("Die höchste Zahl ist " +num1 +".");
          
        }

        else if ((num2>num1) && (num2==num3)){
            Out.print("Die höchste Zahl ist " +num2 +".");
          
        }
    }
}
