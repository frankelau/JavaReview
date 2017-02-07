package cn.itcast.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tool {
	public static String getTime(){
		return new SimpleDateFormat("hh:mm:ss").format(new Date()); 
	}
	public static void main(String[] args) {
		System.out.println(Tool.getTime());
	}
}
