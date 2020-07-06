
/**
 * 1. Apply UML design on user defined class
   2. Write overloaded constructors of a class
   3. Write mutators (i.e. get methods) and accessors (i.e. set methods) of a class
   4. Write overloaded methods
   5. Write main method to test the user defined class
 *
 * Catherine Schnelle
 * Project 09
 */
import java.util.Scanner;

public class Temperature {
    private double degree;
    private char scale;
    //default constructor
    public Temperature()
    {
        degree = 0.0;
        scale = 'C';
    }
    //degree constructor  
    public Temperature(double degree)
    {
        this.degree = degree;
        scale = 'C';
    }
     //scale constructor
    public Temperature(char scale)
    {
        degree = 0.0;
        this.scale = scale;       
    }
    //degree + scale constructor
    public Temperature(double degree, char scale)
    {
        this.degree = degree;
        this.scale = scale;
    }
    //function returns degree in celsius
    public double getDegreeInCelsius()
    {
        if(scale == 'C' || scale == 'c')
            return degree;
        else
            return(((degree-32)*5)/9);
    }
    //function returns degree in fahrenheit
    public double getDegreeInFahrenheit()
    {
        if(scale == 'F' || scale == 'f')
            return degree;
        else
            return(1.8*degree + 32);  
    }
    //set degree method
    public void setDegree(double degree)
    {
        this.degree = degree;
    }
    //set scale method  
    public void setDegree(char scale)
    {
        this.scale = scale;
    }
    //set degree and scale method
    public void setDegree(double degree, char scale)
    {
        this.degree = degree;
        this.scale = scale;
    }
    //is object equal to obj
    public boolean equals(Temperature obj)
    {
        if(getDegreeInCelsius() == obj.getDegreeInCelsius())
            return true;
        return false;
    }
    //is object less than obj
    public boolean isLessThan(Temperature obj)
    {
        if(getDegreeInCelsius() < obj.getDegreeInCelsius())
            return true;
        return false;
    }
    //is object greater than obj
    public boolean isGreaterThan(Temperature obj)
    {
        if(getDegreeInCelsius() > obj.getDegreeInCelsius())
            return true;
        return false;
    }
     
    public static void main(String[] args) {          
        //store input
        double degree;
        String scale;
        //accept user input
        Scanner scan = new Scanner(System.in);
        //declare temp1 using default constructor
        Temperature temp1 = new Temperature();
        System.out.println("This first Temperature has been created using the default constructor which sets");
        System.out.println("the degree to a default value of 0.0 and the scale to a default value of C.");
        System.out.printf("The first Temperature is %.2f C.%n",temp1.getDegreeInCelsius());
        System.out.printf("The first Temperature is %.2f F.%n",temp1.getDegreeInFahrenheit());
        //prompt for user to enter degree
        System.out.print("Enter degree for first Temperature: ");
        degree = scan.nextDouble();
        scan.nextLine();
        //prompt user to enter scale
        System.out.print("Enter scale(C or F) for first Temperature: ");
        scale = scan.nextLine();
        //check if user input is valid
        while(scale.toUpperCase().charAt(0)!= 'C' && scale.toUpperCase().charAt(0) != 'F')
        {
            System.out.print("Enter a valid scale value (C or F):");
            scale = scan.nextLine();
        }           
        //set degree and scale to user input value
        temp1.setDegree(degree, scale.toUpperCase().charAt(0));
        
        System.out.print("Enter degree for second Temperature: ");
        degree = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter scale(C or F) for second Temperature: ");
        scale = scan.nextLine();
        while(scale.toUpperCase().charAt(0)!= 'C' && scale.toUpperCase().charAt(0) != 'F')
        {
        System.out.print("Enter a valid scale value (C or F):");
        scale = scan.nextLine();
        }            
        Temperature temp2 = new Temperature(degree);
        temp2.setDegree(scale.toUpperCase().charAt(0));
        
        System.out.print("Enter degree for third Temperature: ");
        degree = scan.nextDouble();
        scan.nextLine();
        System.out.print(" Enter scale(C or F) for third Temperature: ");
        scale = scan.nextLine();
        while(scale.toUpperCase().charAt(0)!= 'C' && scale.toUpperCase().charAt(0) != 'F')
        {
            System.out.print("Enter a valid scale value (C or F):");
            scale = scan.nextLine();
        }
        Temperature temp3 = new Temperature(scale.toUpperCase().charAt(0));
        temp3.setDegree(degree);
        
        System.out.print("Enter degree for fourth Temperature: ");
        degree = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter scale(C or F) for fourth Temperature: ");
        scale = scan.nextLine();
        while(scale.toUpperCase().charAt(0)!= 'C' && scale.toUpperCase().charAt(0) != 'F')
        {
            System.out.print("Enter a valid scale value (C or F):");
            scale = scan.nextLine();
        }
        Temperature temp4 = new Temperature(degree,scale.toUpperCase().charAt(0));
        
        System.out.println(" Temperatures : ");
        System.out.println(" Celsius : "+temp1.getDegreeInCelsius()+" Fahrenheit : "+temp1.getDegreeInFahrenheit());
        System.out.println(" Celsius : "+temp2.getDegreeInCelsius()+" Fahrenheit : "+temp2.getDegreeInFahrenheit());
        System.out.println(" Celsius : "+temp3.getDegreeInCelsius()+" Fahrenheit : "+temp3.getDegreeInFahrenheit());
        System.out.println(" Celsius : "+temp4.getDegreeInCelsius()+" Fahrenheit : "+temp4.getDegreeInFahrenheit());

        if(temp1.equals(temp2))
            System.out.println("The first Temperature is equal to the second.");
        else
            System.out.println("The first Temperature is not equal to the second.");
             
        if(temp1.isLessThan(temp2))
            System.out.println("The first Temperature is less than the second);");
        else
            System.out.println("The first Temperature is not less than the second.");

        if(temp1.isGreaterThan(temp2))
            System.out.println("The first Temperature is greater than the second.");
        else
            System.out.println("The first Temperature is not greater than the second.");

        if(temp1.equals(temp3))
            System.out.println("The first Temperature is equal to the third.");
        else
            System.out.println("The first Temperature is not equal to the third.");

        if(temp1.isLessThan(temp3))
            System.out.println("The first Temperature is less than the third.");
        else
            System.out.println("The first Temperature is not less than the third.");

        if(temp1.isGreaterThan(temp3))
            System.out.println("The first Temperature is greater than the third.");
        else
            System.out.println("The first Temperature is not greater than the third.");

        if(temp1.equals(temp4))
            System.out.println("The first Temperature is equal to the fourth.");
             else
            System.out.println("The first Temperature is not equal to the fourth.");

        if(temp1.isLessThan(temp4))
            System.out.println("The first Temperature is less than the fourth.");
        else
            System.out.println("The first Temperature is not less than the fourth.");

        if(temp1.isGreaterThan(temp4))
             System.out.println("The first Temperature is greater than the fourth.");
        else
             System.out.println("The first Temperature is not greater than the fourth.");

        if(temp2.equals(temp3))
             System.out.println("The second Temperature is equal to the third.");
        else
             System.out.println("The second Temperature is not equal to the thid.");

        if(temp2.isLessThan(temp3))
             System.out.println("The second Temperature is less than the third.");
        else
             System.out.println("The second Temperature is not less than the third.");

        if(temp2.isGreaterThan(temp3))
             System.out.println("The second Temperature is greater than the third.");
        else
             System.out.println("The second Temperature is not greater than the third. ");

        if(temp2.equals(temp4))
             System.out.println("The second Temperature is equal to the fourth.");
        else
             System.out.println("The second Temperature is not equal to the fourth.");

        if(temp2.isLessThan(temp4))
             System.out.println("The second Temperature is less than the fourth.");
        else
             System.out.println("The second Temperature is not less than the fourth.");

        if(temp2.isGreaterThan(temp4))
             System.out.println("The second Temperature is greater than the fourth.");
        else
             System.out.println("The second Temperature is not greater than the fourth.");

        if(temp3.equals(temp4))
             System.out.println("The third Temperature is equal to the fourth.");
        else
             System.out.println("The third Temperature is not equal to the fourth.");

        if(temp3.isLessThan(temp4))
             System.out.println("The third Temperature is less than the fourth.");
        else
             System.out.println("The third Temperature is not less than the fourth.");

        if(temp3.isGreaterThan(temp4))
             System.out.println("The third Temperature is greater than the fourth.");
        else
             System.out.println("The third Temperature is not greater than the fourth");

           scan.close();
    }
}

