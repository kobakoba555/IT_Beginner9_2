
public class Hero {

	//課題9-2
	private String name;	//名前
	private int hp;			//体力
	private int at;			//攻撃力
	private int df;			//防御力
	
	//getterメソッド
	public String getName() {
		return this.name;
	}
	
	//setterメソッド
	public void setName(String name) {
		if(name.length() >= 3 && name.length() <= 10 && name != null) {
			this.name = name;
		}else {
			throw new IllegalArgumentException("名前が不適切です。");
		}
	}

	//getterメソッド
	public int getHp() {
		return this.hp;
	}
	
	//setterメソッド
	public void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		}else {
			this.hp = hp;
		}
	}
	
	//getterメソッド
	public int getAt() {
		return this.at;
	}
	
	//setterメソッド
	public void setAt(int at) {
		if(at < 0) {
			this.at = 0;
		}else {
			this.at = at;
		}

	}
	//getterメソッド
	public int getDf() {
		return this.df;
	}
	
	//setterメソッド
	public void setDf(int df) {
		if(df < 0) {
			this.df = 0;
		}else {
			this.df = df;
		}
	}

	public void attack() {//攻撃
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵にダメージを" + this.at + "与えた！！");
	}
	
	public void defence() {//防御
		System.out.println("勇者が防御をした");
		this.df = this.df + 10;
		System.out.println("防御力が10upし、" + this.df + "になった");
	}

	public void heal() {//回復
		System.out.println("勇者が休憩した");
		this.hp = this.hp + 10;
		System.out.println("hpが10回復し、" + this.hp + "になった");
	}
}
