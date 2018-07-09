/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filecopy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Amith Liyanage
 */
public class FileCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FileReader fr = null;
        FileWriter fw = null;
        int ch;
        try {
            fr = new FileReader("\\FileCopy\\1.txt");        //get data from
            fw = new FileWriter("\\FileCopy\\2.txt", true);  //data copy to, "true" used for append
            //and FileWriter path file data not cleared
            while ((ch = fr.read()) != -1) {//catch EOF(End Of File) and end reading that time
                fw.write(ch);
            }
            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
