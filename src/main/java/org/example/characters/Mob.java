package org.example.characters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @AllArgsConstructor
public class Mob
{
    @Setter @Getter
    private String name;
    @Setter @Getter
    private int hps = 100;
    @Setter @Getter
    private int hitRate = 30;
    @Setter @Getter
    private int baseDamage = 5;

    public void hit(Mob enemy)
    {
        int diceRoll = (int)(Math.random() * 100);

        if (diceRoll < hitRate)
        {
            enemy.reduceHps(baseDamage);
            System.out.println("[ "+ this.hps +" ]" + name + " hits " + enemy.name + " for " + baseDamage);
        }
        else
        {
            System.out.println("[ "+ this.hps +" ]" + name + " misses");
        }
    }

    private void reduceHps(Integer hpsToBeReduced)
    {
        hps = hps - hpsToBeReduced;
    }
}
