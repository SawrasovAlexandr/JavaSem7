package Game;

public class Warrior extends BaseHero{
    
    Warrior(String name){
        super(name, 150, 30, 0.3, 5, 10);
    }

    Warrior(){
        this("Warrior");
    }
}
