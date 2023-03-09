package Game;

public class Priest extends BaseHero{
    
    Priest(String name){
        super(name, 120, 50, 0.2, 10, 10);
    }

    Priest(){
        this("Priest");
    }

    public void toHeal(BaseHero target) {
        if (this.cast(this.dmg)) {
            target.healing(this.dmg);
        }
    }

    public void burnMp(BaseHero target) {
        if (this.cast(this.dmg)) {
            if (target.mp - 2 * this.dmg <= 0) target.mp = 0;
            else target.mp -= 2 * this.dmg;
        }
    }

    @Override
    public void fight(BaseHero[] enemies, BaseHero[] friends) {
        if (this.mp >= this.dmg && isGetDmg(friends[getMinHpIndex(friends)])) this.toHeal(friends[getMinHpIndex(friends)]);
        else if (this.mp >= 2 * this.dmg && enemies[getMaxMpIndex(enemies)].mp != 0){
            this.burnMp(enemies[getMaxMpIndex(enemies)]);
        } 
        else this.toAttack(enemies[getMinHpIndex(enemies)]);
    }
}
