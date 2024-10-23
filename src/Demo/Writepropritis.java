package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Writepropritis {

	public static void main(String[] args) {
	FileInputStream fis=new FileInputStream("")	;
	
	Properties propert =new Properties();
	propert.load(fis);
	
	propert.put("subject", "selenium");
	
+	propert.store(fos, "updated sucessfullty");

	}

}
