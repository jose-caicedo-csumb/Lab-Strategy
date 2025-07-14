package Abilities;

import Monsters.Monster;

/**
 * Author: Jose Caicedo Created on: 7/13/25 Description:
 */
public interface Attack extends Ability {
  Integer attack(Monster target);
}

