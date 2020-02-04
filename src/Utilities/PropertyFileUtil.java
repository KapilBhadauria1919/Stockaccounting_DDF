package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
		
		
		public static String getValueForKey(String Key) throws Exception{
			
			Properties configProperties=new Properties();
			
			FileInputStream fis=new FileInputStream("D:\\KapilBatch81\\StockAccounting_Hybrid\\PropertiesFile\\Environment.properties");
			
			configProperties.load(fis);
			
			return configProperties.getProperty(Key);
		
	}

}
