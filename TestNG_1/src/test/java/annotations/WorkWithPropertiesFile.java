package annotations;

import java.io.FileInputStream;
import java.util.Properties;

public class WorkWithPropertiesFile {


		public static void main(String[] args) throws Throwable{
			
			Properties prop=new Properties();
			prop.load(new FileInputStream("src\\test\\java\\propertiesFileEx\\global.properties"));
			
			System.out.println(prop.getProperty("Browsertype"));
			System.out.println(prop.getProperty("url"));
		}



	}


