package utility;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Read {
	
	
	
	public static HashMap<String, String> readFile(String filename) {
		HashMap<String, String> resusrs = new HashMap<String, String>();
		try {
			Scanner in = new Scanner(new File(filename));
			String line;
			
			while (in.hasNext()) {
				line = in.nextLine();
				String[] keyvalue = line.split("%");
				keyvalue[0] = keyvalue[0].trim();
				keyvalue[1] = keyvalue[1].trim();
				resusrs.put(keyvalue[0], keyvalue[1]);
			}
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return resusrs;
	}
	
	public static String getElement(String file, String key) {
		HashMap<String, String> res = readFile(file);
		
		return res.get(key);
		
	}
	
	
	
}
