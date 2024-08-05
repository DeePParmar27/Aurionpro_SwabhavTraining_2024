package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.AbstractDocument.LeafElement;

public class CountFile {
public static void main(String[] args) throws IOException {
 
	FileInputStream fs = new FileInputStream("D:\\AURIONPRO\\11_Streams\\src\\com\\aurionpro\\test\\myFIle");
	int ch ;
	int count = 0;
	int line = 0 ;
	int word = 0 ;
	
	while((ch = fs.read()) != -1) {
	
		System.out.print((char)ch);
		if((char)ch != ' ' && (char)ch != '\n' )
		{
			count++ ;
		}
		
		if((char)ch == '\n')
		{
			line++ ;
			
		}
		
		if((char)ch == ' ' || (char)ch == '\n')
		{
			word++ ;
			
			
		}
		
	}
	
	System.out.println("Number of Letters :"+(count-line));
	System.out.println("Number of Line :"+line);
	System.out.println("Number of Words :"+word);

	fs.close();
 
}
}
