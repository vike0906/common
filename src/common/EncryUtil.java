package common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryUtil {
	
	private final static String[] hexDigits = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
	
	public static String md5(String inputStr) {
		if(inputStr!=null) {
			try {
				MessageDigest md5 = MessageDigest.getInstance("MD5");
				byte[] results =  md5.digest(inputStr.getBytes());
				StringBuffer sb = new StringBuffer();
				for(int i = 0;i<results.length;i++) {
					int n = results[i];
					if(n<0) n=256+n;
					int d1 = n/16;
					int d2 = n%16;
					sb.append(hexDigits[d1]+hexDigits[d2]);
				}
				return sb.toString();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}
    public static void main(String [] args) {
    	String str = "";
    	System.out.println(md5(str));
    }
	
	

}
