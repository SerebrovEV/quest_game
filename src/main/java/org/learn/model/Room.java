package org.learn.model;

public class Room {
    private String name;
    private int gold;
    private Monster monster;


    public Room(String name, int gold) {
        this.name = name;
        this.gold = gold;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    @Override
    public String toString() {
        return "Локация = " + name +
                ", Золота = " + gold +
                ", Монстр = " + monster;
    }
}


