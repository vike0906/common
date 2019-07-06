package common;

import java.util.UUID;

public class RandomString {
	
	public static String uuid() {
		String uuid = UUID.randomUUID().toString();
		return uuid.replaceAll("-", "");
	}
	
	public static void main(String [] args) {
		System.out.println(RandomString.uuid());
	}

}
