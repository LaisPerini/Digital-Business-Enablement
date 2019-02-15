package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class PropertySingleton {
	
	public static Properties p;
	private static final String ARQ = "/arquivo.property";
	
	public static Properties getIntance() {
		if(p==null) {
			try {
				p = new Properties();
				p.load(PropertySingleton.class.getResourceAsStream(ARQ));
			}catch (IOException e){
				e.printStackTrace();
				
			}
		}
		return p;
		
		
		
	}

}
