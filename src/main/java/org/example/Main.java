package org.example;

import org.example.actions.Arena;
import org.example.characters.Mob;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        Mob bolichero = new Mob("bolichero", 200, 50, 5);
        Mob enemy = new Mob("monster",300, 30, 4);

        Arena arena = new Arena();
        arena.fight(bolichero, enemy);
    }
}
