import java.util.Random;

public class Spawn {
	
	private Handler handler;
	private static HUD hud;
	public static int scoreKeep = 0;
	private Random r = new Random();
	private int timer = 0;
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	public static void resetScoreKeep() {
		scoreKeep=0;
		hud.lives = 3;
	}
	public void tick() {
		//spawns new enemyPlane per second w/ random Y & velocity
		if (timer!=Game.timeCount)
			handler.addObject(new EnemyPlane(Game.WIDTH-38,r.nextInt(Game.HEIGHT-50), ID.Enemy, handler));
			timer = Game.timeCount;
	}
}