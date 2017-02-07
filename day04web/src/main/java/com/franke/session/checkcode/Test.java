package com.franke.session.checkcode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cn.dsna.util.images.ValidateCode;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ValidateCode code = new ValidateCode(200, 80, 4, 100);
		
		try {
			code.write(new FileOutputStream("e:/check.jpg"));
			
			String codeStr = code.getCode();
			System.out.println(codeStr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
