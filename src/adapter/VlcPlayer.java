package adapter;

/**
 * ��Ŀ������VicPlayer.java
 * @author lzl
 *
 * @date 2021��3��16������10:15:26
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
