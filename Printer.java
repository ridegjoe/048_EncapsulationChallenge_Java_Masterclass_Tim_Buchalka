package eu.rideg;

public class Printer {
    // Definition of the fields for toner level, number of pages printed and duplex feature
    private int tonerLevel = 100;
    private int numberOfPrintedPages = 0;
    private boolean isItADuplexPrinter = true;

    // Constructors for updating the fields
    public Printer(int tonerLevel, int numberOfPrintedPages, boolean isItADuplexPrinter) {

        // Validation of toner level between 0 and 100 percentage
        if(this.tonerLevel >= 0 && this.tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else if (this.tonerLevel< 0) {
            System.out.println("Defined toner level is: " + this.tonerLevel);
            System.out.println("Toner level cannot be < 0!");
        } else if (this.tonerLevel > 100) {
            System.out.println("Defined toner level is: " + this.tonerLevel);
            System.out.println("Toner level cannot be > 100!");
        }

        // Validation of number of pages, which must be a positive integer
        if(numberOfPrintedPages>=0) {
            this.numberOfPrintedPages = numberOfPrintedPages;
        }

        // Constructor for updating fields of duplex feature.
        this.isItADuplexPrinter = isItADuplexPrinter;

    }

    // Method for filling up the toner
    public void fillUpTonerLevel() {
        if ((this.tonerLevel)>=0 && (this.tonerLevel<100) ) {
            System.out.println("Actual toner level is: " +this.tonerLevel);
            this.tonerLevel = 100;
            System.out.println("Toner is being filled up...");
            System.out.println("Actual toner level is: " +this.tonerLevel);
            System.out.println("");
        } else if (this.tonerLevel < 100) {
            System.out.println("Toner level cannot be negative!  Invalid range!");
        } else if (this.tonerLevel == 100) {
            System.out.println("Toner level is already 100%! It is not necessary to fill up!");
        } else {
            System.out.println("Toner level cannot be larger as 100%! Invalid range!");
        }
    }

    // Method for simulating printing
    public void printing(int numberOfPagesToPrint, boolean printingDuplex) {
        if ((this.tonerLevel>0) && (this.tonerLevel<=100)) {
            if (numberOfPagesToPrint < 0) {
                System.out.println("Invalid range. Number of pages to be printed should be larger then 0!");
            } else if (numberOfPagesToPrint == 0) {
                System.out.println("Number of pages to print is 0. There is nothing to do!");
            } else if ((this.isItADuplexPrinter) && (printingDuplex)) {
                System.out.println("Number of printed pages before printing is: " + this.numberOfPrintedPages);
                System.out.println("Printing on both sides...");
                System.out.println("Number of right now printed pages (duplex or simple): " + numberOfPagesToPrint);
                System.out.println("From which duplex: " + numberOfPagesToPrint / 2);
                System.out.println("From which simple: " + numberOfPagesToPrint % 2);
                this.numberOfPrintedPages = this.numberOfPrintedPages + (numberOfPagesToPrint / 2 + numberOfPagesToPrint % 2);
                System.out.println("Number of printed pages after printing is: " + this.numberOfPrintedPages);
            } else if ((!this.isItADuplexPrinter) && (!printingDuplex)) {
                System.out.println("Printer is not duplex. You can print only on one page!");
                System.out.println("Number of printed pages before printing is: " + this.numberOfPrintedPages);
                System.out.println("Printing on one side...");
                this.numberOfPrintedPages = this.numberOfPrintedPages + numberOfPagesToPrint;
                System.out.println("Number of right now printed pages: " + numberOfPagesToPrint);
                System.out.println("Number of printed pages after printing is: " + this.numberOfPrintedPages);
            } else {
                System.out.println("Printer is not duplex. You can print only on one page!");
                System.out.println("Number of printed pages before printing is: " + this.numberOfPrintedPages);
                System.out.println("Printing on one side...");
                this.numberOfPrintedPages = this.numberOfPrintedPages + numberOfPagesToPrint;
                System.out.println("Number of right now printed pages: " + numberOfPagesToPrint);
                System.out.println("Number of printed pages after printing is: " + this.numberOfPrintedPages);
            }
        } else if (this.tonerLevel==0){
            System.out.println("Toner is empty. Toner level is: " + this.tonerLevel);
        } else {
            System.out.println("Toner level is out of valid range: " + this.tonerLevel);
        }


    }

    // Getters for the fields
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    public boolean isItADuplexPrinter() {
        return isItADuplexPrinter;
    }

}
