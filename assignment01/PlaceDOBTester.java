package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
        DateAndPlaceOfBirth placeDob1 = new DateAndPlaceOfBirth(2000, 1, 11, "Huntington", "NY", "America");
        DateAndPlaceOfBirth placeDob2 = new DateAndPlaceOfBirth(2000, 1, 11, "NYC", "NY", "America");
        DateAndPlaceOfBirth placeDob3 = new DateAndPlaceOfBirth(1999, 2, 14, "Los Angeles", "CA", "America");
        DateAndPlaceOfBirth placeDob4 = new DateAndPlaceOfBirth(1998, 2, 14, "Toranto", "Canada");
        DateAndPlaceOfBirth placeDob5 = new DateAndPlaceOfBirth(3000, 4, 6, "Paris", "France");
        System.out.println(placeDob1);
        System.out.println(placeDob2);
        System.out.println(placeDob3);
        System.out.println(placeDob4);
        System.out.println(placeDob5);
        System.out.println(placeDob3.hasSameBirthDayAs(placeDob4));
        System.out.println(placeDob3.hasSameBirthDayAs(placeDob5));
        System.out.println(placeDob1.hasSameBirthDateAs(placeDob2));
        System.out.println(placeDob1.hasSameBirthDateAs(placeDob5));
        System.out.println(placeDob4.youngerThan(placeDob3));
        System.out.println(placeDob3.youngerThan(placeDob4));
        System.out.println(placeDob3.olderThan(placeDob4));
        System.out.println(placeDob4.olderThan(placeDob3));
        try(var output =new PrintWriter(new FileOutputStream(
             new File("output.txt"), true /* true means append to file */))) {
         output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

     //Copy all your lines above, add an extra "2" to every variable name
     // and replace every System.out.print or System.out.println
     // by output.print or output.println
     DateAndPlaceOfBirth placeDob12 = new DateAndPlaceOfBirth(2000, 1, 11, "Huntington", "NY", "America");
     DateAndPlaceOfBirth placeDob22 = new DateAndPlaceOfBirth(2000, 1, 11, "NYC", "NY", "America");
     DateAndPlaceOfBirth placeDob32 = new DateAndPlaceOfBirth(1999, 2, 14, "Los Angeles", "CA", "America");
     DateAndPlaceOfBirth placeDob42 = new DateAndPlaceOfBirth(1998, 2, 14, "Toranto", "Canada");
     DateAndPlaceOfBirth placeDob52 = new DateAndPlaceOfBirth(3000, 4, 6, "Paris", "France");
     output.println(placeDob12);
     output.println(placeDob22);
     output.println(placeDob32);
     output.println(placeDob42);
     output.println(placeDob52);
     output.println(placeDob32.hasSameBirthDayAs(placeDob42));
     output.println(placeDob32.hasSameBirthDayAs(placeDob52));
     output.println(placeDob12.hasSameBirthDateAs(placeDob22));
     output.println(placeDob12.hasSameBirthDateAs(placeDob52));
     output.println(placeDob42.youngerThan(placeDob32));
     output.println(placeDob32.youngerThan(placeDob42));
     output.println(placeDob32.olderThan(placeDob42));
     output.println(placeDob42.olderThan(placeDob32));
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     }
	}
}
