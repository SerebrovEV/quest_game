package org.learn;

import org.learn.model.Monster;
import org.learn.model.Hero;
import org.learn.service.Battle;
import org.learn.service.GeneratorForGameplay;
import org.learn.service.LevelUpPlayer;

import java.util.Scanner;


public class Gameplay {

    private static final GeneratorForGameplay GENERATOR_FOR_GAMEPLAY = new GeneratorForGameplay();
    private static final Battle BATTLE = new Battle();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final LevelUpPlayer LEVEL_UP_PLAYER = new LevelUpPlayer();

    public static void main(String[] args) {
        Hero heroBeforeBattle = GENERATOR_FOR_GAMEPLAY.generatePlayer();
        int result = 1;
        while (result == 1) {
            Monster monster = GENERATOR_FOR_GAMEPLAY.generateMonster();
            System.out.println(heroBeforeBattle);
            Hero heroAfterBattle = BATTLE.battle(heroBeforeBattle, monster);
            if (heroAfterBattle == null) {
                System.out.println("Game Over");
                break;
            }
            System.out.println("Продолжить? ДА, НЕТ?");
            String answer = SCANNER.nextLine();
            if (answer.equals("Нет") || answer.equals("нет") || answer.equals("No") || answer.equals("no")) {
                break;
            } else {
                heroBeforeBattle = LEVEL_UP_PLAYER.levelUp(heroAfterBattle, monster.getLoot());
            }
        }

    }


}