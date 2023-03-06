package Game;

public class Priest extends BaseHero{
    
    Priest(String name){
        super(name, 120, 50, 0.2, 10, 10);
    }

    Priest(){
        this("Priest");
    }
}
