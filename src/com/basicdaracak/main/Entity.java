package com.basicdaracak.main;

import java.util.ArrayList;

public abstract class  Entity  {
    private String name;
    private String role;
    private String race;
    private double hp;
    private  double dmg;
    private double mana;
    private ArrayList<Item> inv = new ArrayList<>();

    public Entity(String name, String role, String race, double hp, double dmg, double mana) {
        this.name = name;
        this.role = role;
        this.race = race;
        this.hp = hp;
        this.dmg = dmg;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public ArrayList<Item> getInv() {
        return inv;
    }

    public void setInv(ArrayList<Item> inv) {
        this.inv = inv;
    }

}
