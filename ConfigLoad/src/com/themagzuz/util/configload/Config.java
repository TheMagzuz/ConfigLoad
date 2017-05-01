package com.themagzuz.util.configload;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class Config {

	static File configFile;
	
	public static void SetConfigFile(String path)
	{
		configFile = new File(path);
		if (!configFile.exists())
		{
			System.err.println(String.format("The file %s does not exist", path));
		}
	}
	
	public static String GetString(String key)
	{
		Map<String, String> keys = new HashMap<String, String>();
		String line;
		try {
			BufferedReader in = new BufferedReader(new FileReader(configFile));
			while ((line = in.readLine()) != null)
			{
				if (line.startsWith(key + " ="))
				{
					in.close();
				}
			}
			
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
}
