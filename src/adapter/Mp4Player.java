package adapter;

/**
 * ��Ŀ������Mp4Player.java
 * @author lzl
 *
 * @date 2021��3��16������10:16:46
 * @version: V1.0
 */
public class Mp4Player implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("play Mp4 file . Name: " + fileName);
	}

}
