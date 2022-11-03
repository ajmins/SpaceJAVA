package udemyPractices.File;

import java.io.IOException;  
import java.io.RandomAccessFile;  
  
public class RandomAccessFileExample {  
    static final String FILEPATH ="myFile.txt"; //File contains: "This class is used for reading and writing to random access file." 
    public static void main(String[] args) {  
        
    	try {  
    		//filepath, initial position, total size
            System.out.println(new String(readFromFile(FILEPATH, 0, 179)));  
            writeToFile(FILEPATH, "I love my country and my people", 67);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    
    private static byte[] readFromFile(String filePath, int position, int size)  
            throws IOException {  
    	//RandomAccessFile(String name(or file name), String mode)
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        //seek(long pos): It sets the file-pointer offset, measured from the beginning of this file, at which the next read or write occurs.
        //here position = 0
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  
}  