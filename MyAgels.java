public class MyAgels{

    public static void main(String[] args){
        // Prints "Hello, World" to the terminal window.
        System.out.println("\nHello, World , Mohammad");

         int yearOfBirth;
         int currentYear;
         int year;
         
         yearOfBirth = 2001;
         currentYear = 2020;
         year = (currentYear - yearOfBirth);

        System.out.println("\nMy Age Is " + year);

        double feet;
        double meters;
        final double factor = 3.2808399;

        meters = 5;
        feet = factor * meters;

        System.out.println("\n"+ meters + " meters is equal to "
        					+ feet + " feet.");

    	double CAD;
    	double USD;
    	double EUR;

    	CAD = 5;
        USD = 0.75 * CAD;
        EUR = 0.68 * CAD;

        System.out.println("\n" + CAD + " CAD is equal to "
        	  				+ USD + " USD.");

        System.out.println("\n" + CAD + " CAD is equal to "
        	  				+ EUR + " EUR.");
        double triangle;
        double length;
        double width;
        double perimeter;
        double area;


        length = 2;
        width = 2;
        area = (length * width);
        perimeter = 2 * (length + width );

        System.out.println("\nThe Area of triangle is " + area +
                " The perimeter of triangle is " + perimeter );


        
       
    }
}