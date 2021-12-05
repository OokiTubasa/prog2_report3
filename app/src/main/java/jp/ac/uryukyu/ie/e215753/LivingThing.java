package jp.ac.uryukyu.ie.e215753;

/**

生き物クラス。
String name; //生き物の名前
int hitPoint; //生き物のHP
int attack; //生き物の攻撃力
boolean dead; //生き物の生死状態。true=死亡。
Created by tnal on 2016/11/13.
*/
public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

/**
 * コンストラクタ。名前、最大HP、攻撃力を指定する。
 * @param name 生き物名
 * @param maximumHP 生き物のHP
 * @param attack 生き物の攻撃力
*/

public LivingThing(String name, int maximumHP, int attack) {
    this.name = name;
    hitPoint = maximumHP;
    this.attack = attack;
    dead = false;
    System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
} 

public boolean isDead(){
    return this.dead;
}
public String getName(){
    return this.name;
}
/**
 * opponentへ攻撃するメソッド。
 * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
 * @param opponent 攻撃対象
*/
public void attack(LivingThing opponent){
    int damage = (int)(Math.random() * attack); 
    if  ( hitPoint > 0 ) 
    {
        dead = false;
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }
}
/**
 * 自身へ攻撃されたときのダメージ処理をするメソッド。
 * 指定されたダメージを hitPoint から引き、死亡判定を行う。
 * @param damage 受けたダメージ 
*/ 
public void wounded(int damage){ 
    hitPoint -= damage;
    if( hitPoint < 0 ) {
        dead = true;
        System.out.printf("%sは倒れた。\n", name);
        } 
    }
}
