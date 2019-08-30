package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
        DateAndPlaceOfBirth dpob = new DateAndPlaceOfBirth(2000, 1, 11, "Huntington", "NY", "America");
        StreetUSAddress address = new StreetUSAddress("123 Fake Street","Apt. 1", "Binghamton", "NY", "13902");
        Person person = new Person("Samson","Grimm", "111223333", dpob, address);
        System.out.println(person);
        try(var output =new PrintWriter(new FileOutputStream(
             new File("output.txt"), true /* true means append to file */))) {
         output.println("\nTESTS FOR Person.java:");

         //Copy all your lines above, add an extra "2" to every variable name
         // and replace every System.out.print or System.out.println
         // by output.print or output.println
         DateAndPlaceOfBirth dpob2 = new DateAndPlaceOfBirth(2000, 1, 11, "Huntington", "NY", "America");
         StreetUSAddress address2 = new StreetUSAddress("123 Fake Street","Apt. 1", "Binghamton", "NY", "13902");
         Person person2 = new Person("Samson","Grimm", "111223333", dpob2, address2);
         output.println(person2);
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
	}
}
