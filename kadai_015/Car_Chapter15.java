package kadai.kadai_015;

public class Car_Chapter15 {
	//フィールドの初期化
	private int gear = 1;
	private int speed = 10;
	
	//メソッドの作成
	//ギアの値により速度を変える
	public void geerChange(int afterGeer) {
		this.gear = afterGeer;
		this.speed = switch(gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("時速" + speed + "km");
	}
}
