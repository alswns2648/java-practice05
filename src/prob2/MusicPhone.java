package prob2;

public class MusicPhone extends Phone {
	public void execute (String function) {
		if (function.equals("음악")) {
			playMusic();
		}else {
			super.execute(function);
		}
		
		
	}
	
	protected void playMusic() {
		System.out.println("MP3 플레이어에서 음악 재생");
	}
}
