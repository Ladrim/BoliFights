package org.example.actions;

import org.example.characters.Mob;

public class Arena
{
    public void fight(Mob mob1, Mob mob2) throws InterruptedException
    {
        while ( mob1.getHps() > 0 && mob2.getHps() > 0)
        {
            mob1.hit(mob2);
            Thread.sleep(300);
            mob2.hit(mob1);
            Thread.sleep(300);
        }

        System.out.println(mob1);
        System.out.println(mob2);
    }
}
