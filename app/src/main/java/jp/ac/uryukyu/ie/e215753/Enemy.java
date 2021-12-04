package jp.ac.uryukyu.ie.e215753;

public class Enemy extends LivingThing{
    public Enemy(String name, int hitPoint, int attack){
    super(name,hitPoint,attack);
    }
    @Override
    public void wounded(int damage){ 
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;            
            System.out.printf("モンスター%sは倒れた。\n", name);
            }
        }
    
    public int getHitPoint(){
        return this.hitPoint;
    }
}
