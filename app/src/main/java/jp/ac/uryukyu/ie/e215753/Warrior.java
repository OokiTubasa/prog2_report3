package jp.ac.uryukyu.ie.e215753;

public class Warrior extends LivingThing{
    public Warrior(String name, int hitPoint, int attack){
        super(name,hitPoint,attack);
        }

        public void attackWithWeponSkill(LivingThing opponent){
            int damage = (int)(1.5 * attack);
            if  ( hitPoint > 0 ) 
            {
                dead = false;
                System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
                opponent.wounded(damage);
            }
        }
    
        public int getHitPoint(){
            return this.hitPoint;
        }
}
    