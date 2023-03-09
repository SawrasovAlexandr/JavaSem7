package Game;

public class Magician extends BaseHero{
    
    Magician(String name){
        super(name, 100, 50, 0.1, 10, 5);
    }

    Magician(){
        this("Magician");
    }

    public void fireball(BaseHero target) {
        if (this.getId() != target.getId() && target.isAlive() && this.cast(2 * this.dmg)) {
            if (target.dodge <= rand.nextInt(100)) {
                target.damage(rand.nextInt((int)this.dmg * 4 - 5, (int)this.dmg * 4 + 6) * (1 - target.def));
            } else System.out.println("Мимо!!");
        }
    }

    public void inferno(BaseHero[] targets) {
        if (this.cast(4 * this.dmg)){
            for (BaseHero target : targets) {
                if (this.getId() != target.getId() && target.isAlive()) {
                    target.damage(rand.nextInt((int)this.dmg * 2 - 5, (int)this.dmg * 2 + 6) * (1 - target.def));
                }
            }
        }
    }
}
