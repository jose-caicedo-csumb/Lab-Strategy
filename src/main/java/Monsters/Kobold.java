package Monsters;
import Abilities.RangedAttack;
import java.util.HashMap;

/**
 * Author: Jose Caicedo Created on: 7/13/25 Description:
 */
public class Kobold extends Monster {
  public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);

    Integer maxStr = 8;
    Integer maxDef = 5;
    Integer maxAgi = 12;

    attack = new RangedAttack(this);
    str = super.getAttribute(str, maxStr);
    def = super.getAttribute(def, maxDef);
    agi = super.getAttribute(agi, maxAgi);
  }

  @Override
  public String toString() {
    return "Monsters.Kobold has : " + super.toString();
  }
}
