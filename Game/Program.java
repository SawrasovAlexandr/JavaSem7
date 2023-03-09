package Game;

import java.util.Scanner;

/**
 * Создать класс Player с полями id (long), name (String), damage (double) healthPoint (hp) (double)
 *  У класса должен быть конструктор, который принимает только name. Идентификатор присваивается автоматически
 *  из последовательности (1, 2, ...) Каждый класс должен уметь "бить" другого
 *  Player'а void attack(Player player) -> player1.attack(player2) 
 * Внутри метода игрок, на котором вызван метод уменьшает здоровье игрока, который передан в метод 
 * Придумать несколько классов с разными параметрами жизней и атаки по-умолчанию 
 * Player player = new Tank("name");
 * Придумать, все, что захочется и обогатить проект Понасоздавать объектов и стравить их друг с другом
 */
public class Program {
    public static void main(String[] args) {
        BaseHero[] party1 = {new Magician(), new Warrior(), new Priest(), new Rogue()};
        BaseHero[] party2 = {new Magician(), new Warrior(), new Priest(), new Rogue()};
        Scanner sc = new Scanner(System.in);
        while (isAliveParty(party1) && isAliveParty(party2)) {
            
        }
    }

   
}