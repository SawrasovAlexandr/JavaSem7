package Game;

public class Rogue extends BaseHero{
    
    Rogue(String name){
        super(name, 100, 20, 0.1, 15, 20);
    }

    Rogue(){
        this("Rogue");
    }
}
