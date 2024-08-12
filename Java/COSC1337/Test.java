import java.io.*;
import java.math.BigInteger;

public class Test {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "forest.bmp";

        try {
            // Use this for reading the data.
            byte[] BMPFileHeader = new byte[14];
            byte[] buffer2 = new byte[2];
            byte[] buffer4 = new byte[4];

            FileInputStream inputStream = 
                new FileInputStream(fileName);

            // read fills buffer with data and returns
            // the number of bytes read (which of course
            // may be less than the buffer size, but
            // it will never be more).
            int total = 0;
            int nRead = 0;
            int b = 0;
            nRead = inputStream.read(BMPFileHeader);
            if (nRead == 14) {
            	for (int i=0; i<2; i++)
            		buffer2[i] = BMPFileHeader[b++];
            	System.out.println (new String(buffer2));	
            	
            	for (int i=3; i>=0; i--)
            		buffer4[i] = BMPFileHeader[b++];
            	System.out.println ("File size = " + new BigInteger(buffer4).intValue());
            	
            	
            	
            	
            	total += nRead;
            }
           

            // Always close files.
            inputStream.close();        

            System.out.println("Read " + total + " bytes");
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
