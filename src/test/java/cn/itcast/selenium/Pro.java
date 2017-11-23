package cn.itcast.selenium;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class Pro {
	Properties p=new Properties();
	public Pro(String path) throws IOException{
		this.getProperties(path);
	}
	public void getProperties(String path) throws IOException{
		InputStream in=new FileInputStream(path);
		InputStreamReader read=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(read);
		p.load(br);
	}
	public String getValue(String key) throws UnsupportedEncodingException{
		String value=p.getProperty(key);
		return value;
	}
	public static void main(String[] args) throws IOException{
		Pro p=new Pro(System.getProperty("user.dir")+"/Properties.properties");
		System.out.print(p.getValue("url"));
	}
}
