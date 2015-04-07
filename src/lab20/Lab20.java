
package lab20;

/**
 *
 * @author nmarks3
 */
public class Lab20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactReader cr = new ContactReader();
        ContactWriter cw = new ContactWriter();
        Contacts contact1 = new Contacts("Justin","Timberlake","4545 blueberry rd",
        "San Fransisco", "CA", "22221");
        Contacts contact2 = new Contacts("Edd","Ed","32 culdasac", "Springdale",
        "VR", "32134");
        Contacts contact3 = new Contacts("Gary","Busey","9898 horseradish",
        "Sussex", "WI", "53454");
      //  cr.readFile();
        cw.writeNewFile(contact1);
        cw.writeNewFile(contact2);
        cw.writeNewFile(contact3);
        cw.appendFile(contact1);
        cw.appendFile(contact2);
        cw.appendFile(contact3);
       
    }
    
}
