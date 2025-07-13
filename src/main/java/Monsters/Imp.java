package Monsters;

import java.util.HashMap;

/**
 * Author: Jose Caicedo Created on: 7/13/25 Description:
 */
public class Imp extends Monster {
  public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);
  }

  @Override
  public String toString() {
    return "Monsters.Imp has : " + super.toString();
  }
}
