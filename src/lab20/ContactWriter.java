
package lab20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author nmarks3
 */
public class ContactWriter {

    public void appendFile(Contacts contact) {
        boolean append = true;

        File data = new File(File.separatorChar + "Temp" + File.separatorChar
                + "lab1" + File.separatorChar + "contacts.txt");

        try {
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(data, append)));          
            out.println(contact.getFirstName() + " " + contact.getLastName() 
            + "\n" + contact.getAddress() + "\n" + contact.getCity() 
            + " " + contact.getState() + " " + contact.getZip());
            out.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        System.out.println("Wrote file to: " + data.getAbsolutePath());
    }

    public void writeNewFile(Contacts contact) {
        boolean append = true;

        File data = new File(File.separatorChar + "Temp" + File.separatorChar
                + "lab1" + File.separatorChar + "NewContacts.txt");

        try {
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(data, append)));

            out.println("First Name: " + contact.getFirstName());
            out.println("Last Name: " + contact.getLastName());
            out.println("Address: " + contact.getAddress());
            out.println(contact.getCity() + ", " + contact.getState() + " "
                    + contact.getZip());
            out.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        System.out.println("Wrote file to: " + data.getAbsolutePath());
    }

}
