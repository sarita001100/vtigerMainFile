package vtigerAutomate;

import java.io.IOException;
import java.util.Properties;

public class FileInputStream {

	public static void main(String[] args) throws IOException {

		java.io.FileInputStream stream=	new java.io.FileInputStream("C:\\Users\\COMTECH\\eclipse-Sarita\\vtigerAutomate\\suraj.properties");
		Properties proper=	new Properties();
		proper.load(stream);
		String a=proper.getProperty("aky");
		System.out.println(a);
		
	}

}
