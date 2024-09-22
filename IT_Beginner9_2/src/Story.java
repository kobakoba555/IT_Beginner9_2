
import java.util.Scanner;

public class Story {

	public static void main(String args[]) {
		
		//勇者
		Hero h = new Hero();
		
		h.setName("イレブン");	//名前の設定
		h.setHp(100);		//能力値の設定
		h.setAt(50);
		h.setDf(20);
		
		System.out.println("勇者");
		System.out.println("名前：" + h.getName());
		System.out.println("体力：" + h.getHp());
		System.out.println("攻撃力：" + h.getAt());
		System.out.println("防御力：" + h.getDf());
		
		//魔法使い
		Magician mg = new Magician();
		
		mg.setName("レベッカ");	//名前の設定
		mg.setHp(70);		//能力値の設定
		mg.setAt(20);
		mg.setMp(15);
		
		System.out.println("魔法使い");
		System.out.println("名前：" + mg.getName());
		System.out.println("体力：" + mg.getHp());
		System.out.println("攻撃力：" + mg.getAt());
		System.out.println("MP：" + mg.getMp());
		
		//モンスター
		Monster m = new Monster();
		
		m.setName("ゴーレム");	//名前の設定
		m.setHp(180);		//能力値の設定
		m.setAt(40);
		m.setDf(30);
		
		System.out.println("モンスター");
		System.out.println("名前：" + m.getName());
		System.out.println("体力：" + m.getHp());
		System.out.println("攻撃力：" + m.getAt());
		System.out.println("防御力：" + m.getDf());

	}
}
