package common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
* @author vike0906
* @since 2019-07-08
*/
public class EncryUtil {
	
	private final static String[] hexDigits = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
	
	public static String md5(String inputStr) {
		if(inputStr!=null) {
			try {
				MessageDigest md5 = MessageDigest.getInstance("MD5");
				byte[] results =  md5.digest(inputStr.getBytes());
				return bytesToHexString(results);
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}
	
	public static String sha256(String inputStr) {
		if(inputStr!=null) {
			try {
				MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
				byte[] results =  sha256.digest(inputStr.getBytes());
				return bytesToHexString(results);
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}
	
	public static String sha512(String inputStr) {
		if(inputStr!=null) {
			try {
				MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
				byte[] results =  sha512.digest(inputStr.getBytes());
				return bytesToHexString(results);
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}
	
	/**将字节数组转换成十六进制字符串*/
	private static String bytesToHexString(byte[] bytes){
        StringBuffer sb = new StringBuffer(bytes.length);
        for (int i = 0;i< bytes.length;i++){
        	String temp = Integer.toHexString(0xFF & bytes[i]);
            if (temp.length() < 2){
                sb.append(0);
            }
            sb.append(temp);
        }
        return sb.toString();
    }
	
	
	/**将字节数组转换成十六进制字符串*/
	private static String bytesToHexString2(byte[] bytes){
        StringBuffer sb = new StringBuffer(bytes.length);
		for(int i = 0;i<bytes.length;i++) {
			int n = bytes[i];
			if(n<0) n=256+n;
			int d1 = n/16;
			int d2 = n%16;
			sb.append(hexDigits[d1]+hexDigits[d2]);
		}
		return sb.toString();
    }
	
	
    public static void main(String [] args) {
    	String str = "test";
    	System.out.println(md5(str));
    	System.out.println(md5(str).length());
    	System.out.println(sha256(str));
    	System.out.println(sha256(str).length());
    	System.out.println(sha512(str));
    	System.out.println(sha512(str).length());
    }
	
	

}
