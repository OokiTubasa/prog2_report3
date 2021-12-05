package jp.ac.uryukyu.ie.e215753;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {    
/**

* attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを検証。
* 検証手順
*  (1) 戦士と敵を準備。戦士はattackWithWeponSkillのみを使うこととする。
*  (2) 戦士が殴り、敵は殴ってこない。敵はattackWithWeponSkillを２回、耐えれる体力とする。
*  (3) 敵は３回attackWithWeponSkillを喰らうことを期待。
* 　　また、attackWithWeponSkillの攻撃力が、3回ともattackの150%あることを期待。これを検証する。
*/
@Test
void attackTest() {
    int defaultwarriorHp = 100;
    Warrior demowarrior = new Warrior("デモ戦士", defaultwarriorHp, 100);
    Enemy bigslime = new Enemy("でっかいスライム", 400, 5);
    while(bigslime.hitPoint > 0){
        demowarrior.attackWithWeponSkill(bigslime);
    }
    assertEquals(defaultwarriorHp, demowarrior.getHitPoint());        
    }
}
    

