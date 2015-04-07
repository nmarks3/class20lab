
package lab20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nmarks3
 */
public class ContactReader {

    List<Contacts> dataPoints = new ArrayList();

    public void passFile() {

        for (Contacts c: dataPoints) {
            System.out.println(c);
        }
    }

    public void readFile() {
        File data = new File(File.separatorChar + "Temp" + File.separatorChar
                + "lab1" + File.separatorChar + "contacts.txt");

        BufferedReader in = null;
        try {

            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                String[] a = line.split(" ");
                //error here
                dataPoints.add(a);
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }

}
