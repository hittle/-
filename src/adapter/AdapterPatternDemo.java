package adapter;

/**
 * ��Ŀ������AdapterPatternDemo.java
 * @author lzl
 *
 * @date 2021��3��16������10:28:19
 * @version: V1.0
 */
public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "babay,mp3");
		audioPlayer.play("mp4", "My friends.mp4");
		audioPlayer.play("vlc", "Follow me.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
