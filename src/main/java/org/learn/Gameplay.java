package org.learn;

import org.learn.model.Mage;
import org.learn.model.Monster;
import org.learn.model.Hero;
import org.learn.model.Room;
import org.learn.service.Battle;
import org.learn.service.GeneratorForGameplay;
import org.learn.service.ChangeHero;

import java.util.Scanner;

import static java.lang.Thread.sleep;


public class Gameplay {

    private static final GeneratorForGameplay GENERATOR_FOR_GAMEPLAY = new GeneratorForGameplay();
    private static final Battle BATTLE = new Battle();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final ChangeHero CHANGE_HERO = new ChangeHero();

    public static void main(String[] args) throws InterruptedException {
        Hero hero = GENERATOR_FOR_GAMEPLAY.generatePlayer();
        while (true) {
            gameplayWithoutChoice(hero);
            System.out.println("Продолжить? ДА, НЕТ?");
            int answer = SCANNER.nextInt();
            if (answer == 0) break;
        }
        System.out.println("Game Over");
        System.exit(0);
    }

    private static void gameplayWithoutChoice(Hero hero) throws InterruptedException {
        System.out.println(hero);
        Room room = GENERATOR_FOR_GAMEPLAY.generateRoom();
        Monster monster = room.getMonster();
        if (!(monster == null)) {
            sleep(500);
            hero = BATTLE.battleWithoutChoice(hero, monster);
            CHANGE_HERO.levelUp(hero);
            CHANGE_HERO.choiceWeapon(hero, monster.getLoot());
            CHANGE_HERO.choiceAbility(hero);
        } else {
            System.out.println("Локация чиста.Идите дальше");
        }
        if (hero == null) {
            System.out.println("Game Over");
            System.exit(0);
        }
        hero.setGold(room.getGold()+room.getGold());
        hero.setRoomComplete(hero.getRoomComplete() + 1);
    }
}