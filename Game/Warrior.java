package Game;

public class Warrior extends BaseHero{
    
    Warrior(String name){
        super(name, 150, 30, 0.3, 5, 10);
    }

    Warrior(){
        this("Warrior");
    }

    public void doubleStrike(BaseHero target) {
        if (this.cast(this.dmg)) {
            this.toAttack(target);
            this.toAttack(target);
        }
    }

    public void toGiveHp(BaseHero[] targets) {
        for (BaseHero target : targets) {
            target.healing(this.mp);
        }
        this.damage(mp);
        this.cast(mp);
    }
}
