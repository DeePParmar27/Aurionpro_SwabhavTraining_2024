package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputFIle {
public static void main(String[] args) throws IOException {
	
	FileInputStream fileInputStream = new FileInputStream("D:\\AURIONPRO\\11_Streams\\src\\com\\aurionpro\\test\\myFIle");

	int ch ;	
	
	FileOutputStream fs_output = new FileOutputStream("D:\\\\AURIONPRO\\\\11_Streams\\\\src\\\\com\\\\aurionpro\\\\test\\\\myFIle2");
	
	while((ch=fileInputStream.read()) != -1) {
		fs_output.write(ch);
		
	}
	
	fileInputStream.close();
}
}
