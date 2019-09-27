package dp.adapter;
//测试--适配器模
public class Test {
	public static void main(String [] args) {
		MusicPlayer mp = new PlayAdapter();
		mp.play("mp3", "hello word.mp3");
		mp.play("mp4", "你好，世�?.mp4");
	}
}
