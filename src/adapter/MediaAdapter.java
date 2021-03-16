package adapter;

/**
 * 项目描述：MediaAdapter.java
 * @author lzl
 *
 * @date 2021年3月16日上午10:18:02
 * @version: V1.0
 */
public class MediaAdapter implements MediaPlayer{
	
	AdvanceMediaPlayer advanceMediaPlayer;

	/**
	 * 
	 */
	public MediaAdapter(String audioType) {
		// TODO Auto-generated constructor stub
		if(audioType.equalsIgnoreCase("vlc"))
			advanceMediaPlayer = new VlcPlayer();
		else if(audioType.equalsIgnoreCase("mp4"))
			advanceMediaPlayer = new Mp4Player();
	}
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("vlc"))
			advanceMediaPlayer.playVlc(fileName);
		else if(audioType.equalsIgnoreCase("mp4"))
			advanceMediaPlayer.playMp4(fileName);
	}

}
