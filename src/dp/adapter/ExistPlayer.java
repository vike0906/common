package dp.adapter;

//已存在音乐播放器，不可更
public class ExistPlayer {

	public void palyMp3(String fileName) {
		System.out.println("MP3 播放中：..."+fileName+"...");
	}
	
	public void playMp4(String fileName) {
		System.out.println("MP4 播放中：..."+fileName+"...");
	}
}
