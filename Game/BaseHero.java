package Game;

import java.util.Random;

public abstract class BaseHero {
    private static int num;
    private int id;
    private String name;
    private double hp;
    private double maxHp;
    private int mp;
    private int maxMp;
    private double def;
    private int dodge;
    private double dmg;
    Random rand = new Random();
    

    BaseHero(String name, double hp, int mp, double def, int dodge, double dmg){
        this.id = ++num;
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mp = mp;
        this.maxMp = mp;
        this.def = def;
        this.dodge = dodge;
        this.dmg = dmg;
    }

    @Override
    public String toString() {
        return String.format("%s-%d, hp: %.0f, mp: %d", this.name, this.id, this.hp, this.mp);
    }

    protected void damage(double dmg){
        this.hp -= dmg; 
    }

    protected void healing(int hlg){
        if (isAlive()) {
            if (this.hp + hlg >= this.maxHp) this.hp = this.maxHp;
            else this.hp += hlg;
        }
    }

    public int getId() {
        return this.id;
    }

    protected boolean isAlive(){
        if (this.hp <= 0) return false;
        return true;
    }
   
    protected void toAttack(BaseHero target){
        if (this.getId() != target.getId() && target.isAlive()) {
            if (target.dodge <= rand.nextInt(100)) {
                target.damage(rand.nextInt((int)this.dmg -3, (int)this.dmg + 4) * (1 - target.def));
            } else System.out.println("Мимо!!");
        }
    }
}
