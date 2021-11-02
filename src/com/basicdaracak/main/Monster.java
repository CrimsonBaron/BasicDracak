package com.basicdaracak.main;

public class Monster extends Entity implements  Ifight{
    public Monster(String name, String role, String race, double hp, double dmg, double mana) {
        super(name, role, race, hp, dmg, mana);
    }

    @Override
    public void attack() {

    }

    @Override
    public void block() {

    }

    @Override
    public void useItem() {

    }

    @Override
    public void spell() {

    }
}
