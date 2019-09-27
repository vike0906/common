package dp.adapter;

//音乐播放适配
public class PlayAdapter implements MusicPlayer{

	private ExistPlayer existPlayer;
	
	public PlayAdapter(){
		existPlayer = new ExistPlayer();
	}
	
	@Override
	public void play(String type, String fileName) {
		// TODO Auto-generated method stub
		if("mp3".equals(type)) {
			existPlayer.palyMp3(fileName);
		}else if("mp4".equals(type)) {
			existPlayer.playMp4(fileName);
		}else {
			System.out.println("不支持的格式...");
		}
	}
	
}
