package adapter;

/**
 * 项目描述：VicPlayer.java
 * @author lzl
 *
 * @date 2021年3月16日上午10:15:26
 * @version: V1.0
 */
public class VlcPlayer implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing vlc file. Name: " +  fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
