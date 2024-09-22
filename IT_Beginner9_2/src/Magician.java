
public class Magician {

	//課題9-2
	private String name;	//名前
	private int hp;			//体力
	private int mp;			//MP
	private int at;			//攻撃力
	
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
	public int getMp() {
		return this.mp;
	}
	
	//setterメソッド
	public void setMp(int mp) {
		if(mp < 0) {
			this.mp = 0;
		}else {
			this.mp = hp;
		}
	}
	
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


	public void attack(Monster monster) {//打撃攻撃
		System.out.println(this.name + "の攻撃！");
		System.out.println(monster.getName() + "にダメージを" + this.at/2 + "与えた！！");	//課題9-1
		monster.takeDamage(this.at/2);
	}
	
	public void magicAttack(Monster monster) {//魔法攻撃
		System.out.println(this.name + "はメラを唱えた！");
		System.out.println(monster.getName() + "にダメージを" + this.at*2 + "与えた！！");	//課題9-1
		this.mp = this.mp - 10;
		System.out.println("MP:" + this.mp);
		monster.takeDamage(this.at*2);
	}
	
	void healMagic() {//回復魔法
		System.out.println(this.name + "はホイミを唱えた！");
		this.hp = this.hp + 10;
		this.mp = this.mp - 5;
		System.out.println("MPを5消費し、体力が10回復した！！");
		System.out.println("HP:" + this.hp + " MP:" + this.mp);
	}
	
	void heal() {//休憩
		System.out.println(this.name + "が休憩した");
		this.hp = this.hp + 10;
		this.mp = this.mp + 5;
		System.out.println("HPが10、MPが5、回復した！");
		System.out.println("HP:" + this.hp + " MP:" + this.mp);
	}
}
