package com.basicdaracak.main;

import javax.xml.namespace.QName;

public enum Esword {
    DIA_SWORD(65654341,"dakhdba"),
    DREVENY_MEC(65654341,"dakhdba"),
    SILVER_SWORD(65654341,"dakhdba"),
    KATANA(65654341,"dakhdba");

    double dmg;
    String name;

    Esword(double dmg, String name) {
        this.dmg = dmg;
        this.name = name;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
