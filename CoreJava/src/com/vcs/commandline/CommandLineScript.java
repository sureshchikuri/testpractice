package com.vcs.commandline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineScript {

	public static void main(String[] args) throws IOException {
		
		Process p;
        try {
        	String[] cmdScript = new String[]{"/bin/bash", "path/to/myScript.sh"}; 
            p = Runtime.getRuntime().exec("cmd /c  dir");
    
            p.waitFor(); 
            BufferedReader reader=new BufferedReader(new InputStreamReader(
             p.getInputStream())); 
            String line; 
            String output="";
            while((line = reader.readLine()) != null) { 
            	 if(line.contains("src")){
            		 System.out.println(line);
            		 int i=line.indexOf("src");
            		 System.out.println(i);
            		 output=line.substring(i+1);
                 }
            } 
            System.out.println(output);
           
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
