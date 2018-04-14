package eu.rideg;

public class Main {

    public static void main(String[] args) {
        // TIM BUCHALKA'S JAVA MASTERCLASS CHALLENGE START
        //
        // This is a challenge, defined by Tim Buchalka
        // This comment part of the code is a part of his Complete Java Master Course from www.udemy.com:
        //
        // https://www.udemy.com/java-the-complete-java-developer-course/
        //
        // I share the challenge text with his permission.
        //
        // START OF CHALLENGE FOR ENCAPSULATION
        //
	    // Create a class and demonstrate proper encapsulation techniques
        // The class will be called Printer.
        // It will simulate a real Computer Printer.
        // It should have fields for the toner Level, number of pages printed, and
        // also, whether its a duplex printer (capable of printing both sides of the paper).
        // Add methods to fill up the toner (up to maximum 100%), another method to
        // simulation printing page (which should increase the number of pages printed)-
        // Decide on the scope, whether to use constructors, and anything else you think is needed.
        //
        // END OF CHALLENGE FOR ENCAPSULATION
        //
        // The code with the solution is made by myself.
        //
        // Remark to my solution:
        // One could implement the sinking of toner level during printing pages.
        // But the goal of this exercise/challenge was only to understand the concept of encapsulation,
        // not writing a perfect model for printing.


        Printer printer = new Printer(10,100,true);
        System.out.println("Toner level: " + printer.getTonerLevel());
        System.out.println("Number of printed pages: " + printer.getNumberOfPrintedPages());
        System.out.println("Is the printer duplex: " + printer.isItADuplexPrinter());
        System.out.println("");

 //       printer.fillUpTonerLevel();

        System.out.println("Toner level: " + printer.getTonerLevel());
        System.out.println("Number of printed pages: " + printer.getNumberOfPrintedPages());
        System.out.println("Is the printer duplex: " + printer.isItADuplexPrinter());
        System.out.println("");

        printer.printing(21,true);
        System.out.println("");
        printer.printing(20,true);
        System.out.println("");
        printer.printing(16,false);
        System.out.println("");

    }
}
