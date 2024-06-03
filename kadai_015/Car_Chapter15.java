package kadai.kadai_015;

public class Car_Chapter15 {
	
	// フィールドを作成
	private int geer = 1;
	private int speed = 10;
	
	// メソッドを作成
	// ギアの値により速度を変える
	public void geerChange(int afterGear) {
		this.geer = afterGear; 
		if((0 < this.geer) || (this.geer < 6)) {
			this.speed = afterGear * 10;
		} 
	}
	
	// ギアチェンジ後の速度を表示する	
	public void run() {
		System.out.println("時速" + speed + "km");
	}
 
}
