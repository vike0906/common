package common;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

public class RandomString {
	
	/**生成UUID*/
	public static String uuid() {
		String uuid = UUID.randomUUID().toString();
		return uuid.replaceAll("-", "");
	}
	
	/**生成长度为6的随机字符串*/
	public static String string() {
		return string(6);
	}
	
	/**生成长度可定的随机字符串*/
	public static String string(int length) {
		String alphabets = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new SecureRandom();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<length;i++) {
			int index = random.nextInt(alphabets.length());
			sb.append(alphabets.charAt(index));
		}
		return sb.toString();
	}
	
	
	
	
	public static void main(String [] args) {
		System.out.println(RandomString.uuid());
		System.out.println(RandomString.string(32));
		System.out.println(RandomString.string());
	}

}
