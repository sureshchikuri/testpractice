package com.java;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 
class ReadFile 
{ 
    public static void main(String[] args) throws IOException 
    { 
        // variable declaration 
        int ch; 
  
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("data.txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
        
      
        StringBuffer sb= new StringBuffer();
  
        // read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) {
           // System.out.print((char)ch); 
        	sb.append((char)ch);
        }
        
        
        FileWriter fw=new FileWriter("output.txt");
        for (int i = 1; i < 10; i++) {
        	 fw.write(sb.toString()); 
        	 System.out.println("Writing successful"); 
		}
       
        // close the file 
        fr.close(); 
        fw.close(); 
        
    } 
} 