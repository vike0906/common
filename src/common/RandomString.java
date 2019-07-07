package common;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

public class RandomString {
	
	/**����UUID*/
	public static String uuid() {
		String uuid = UUID.randomUUID().toString();
		return uuid.replaceAll("-", "");
	}
	
	/**���ɳ���Ϊ6����������ַ���*/
	public static String number() {
		return number(6);
	}
	
	/**���ɳ��ȿɶ�����������ַ���*/
	public static String number(int length) {
		Random random = new SecureRandom();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<length;i++) {
			int index = random.nextInt(10);
			sb.append(index);
		}
		
		return sb.toString();
	}
	
	/**���ɳ��ȿɶ��������ĸ�ַ���*/
	public static String string(int length) {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
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
		System.out.println(RandomString.number());
	}

}
