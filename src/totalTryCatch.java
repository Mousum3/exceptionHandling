import java.io.File;
//import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class totalTryCatch {
    public static void main(String[] args) {
        // Prompt for the input and output file names

        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();

        System.out.print("Output file: ");
        String outputFileName = console.next();

        // Construct the Scanner and PrintWriter objects for reading and writing

        File inputFile;
        Scanner in = null;
        PrintWriter out = null;

        //trying error
        try{
            inputFile = new File(inputFileName);
            in = new Scanner(inputFile);
            out = new PrintWriter(outputFileName);
        }
        catch (Exception FileNotFoundException){
            System.out.println("Hah, error got caught");
        }

        // Read the input and write the output
        double total = 0;

        while (in.hasNextDouble()) {              //What is NullPointerException !?
            double value = in.nextDouble();
            out.printf("%15.2f%n", value);
            total = total + value;
        }

        out.printf("Total: %8.2f%n", total);

        in.close();
        out.close();
    }
}