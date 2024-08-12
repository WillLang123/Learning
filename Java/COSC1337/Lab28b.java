	import java.io.*;
	import java.math.BigInteger;

	public class Lab28b {
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

	            System.out.println("Read " + total + " bytes");
	            //This is where my part is
	            byte[] bmpInfoHeader = new byte[40];
	            byte[] width = new byte[2];
	            byte[] height = new byte[2];
	            byte[] bits = new byte[2];
	            //created 2 byte arrays in order to get and convert binary
	            nRead = inputStream.read(bmpInfoHeader);
	            total+=nRead;
	            if(nRead==40) {
	            //verifies nRead is 40 before beginning
	            int c=0;
	            width[0] = bmpInfoHeader[5+c++];
            	width[1] = bmpInfoHeader[5+c++];
            	//At bmpInfoReader[5+c++] is the bytes that represent width
	            height[0] = bmpInfoHeader[7+c++];
        		height[1] = bmpInfoHeader[7+c++];
        		//At bmpInfoReader[7+c++] is the bytes that represent height
        		bits[0] = bmpInfoHeader[9+c++];
            	bits[1] = bmpInfoHeader[9+c++];
            	//At bmpInfoReader[9+c++] is the bytes that represent bits per pixel
            		
	            System.out.println("Width: "+new BigInteger(width).intValue());
	            System.out.println("Height: "+new BigInteger(height).intValue());
	            System.out.println("Bits per Pixel: "+new BigInteger(bits).intValue());
	            //These turn the byte arrays into readable integers
	            }
	            inputStream.close();
	            //closes input
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
