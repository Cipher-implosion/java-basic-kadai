package kadai.kadai_018;

public class KatoIciro_Chapter18 extends Kato_Chapter18 {
		
	// eachIntroduceメソッドをオーバライドする
	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
		System.out.println();		
	}
	
	// setGivenNameメソッドを作成
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
}	