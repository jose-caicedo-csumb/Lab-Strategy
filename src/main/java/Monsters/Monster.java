package Monsters;

import java.util.HashMap;
import java.util.Objects;

/**
 * Author: Jose Caicedo
 * Created on: 7/13/25
 * Description: Abstract Monsters.Monster class
 */
public abstract class Monster {

  protected Integer hp;
  protected Integer xp = 10; // default

  Integer agility = 10;
  Integer defense = 10;
  Integer strength = 10;
  Attack attack;

  protected Integer maxHP;
  protected HashMap<String, Integer> items;

  public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    this.maxHP = maxHP;
    this.hp = maxHP;
    this.xp = xp;
    this.items = items;
  }


  public Integer getHp() {
    return hp;
  }

  public void setHp(Integer hp) {
    this.hp = hp;
  }

  public Integer getXp() {
    return xp;
  }

  public HashMap<String, Integer> getItems() {
    return items;
  }

  public void setItems(HashMap<String, Integer> items) {
    this.items = items;
  }

  public Integer getMaxHP() {
    return maxHP;
  }

  public Integer getAgility() {
    return agility;
  }

  public Integer getDefense() {
    return defense;
  }

  public Integer getStrength() {
    return strength;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Monster monster = (Monster) o;
    return Objects.equals(hp, monster.hp) &&
        Objects.equals(xp, monster.xp) &&
        Objects.equals(maxHP, monster.maxHP) &&
        Objects.equals(items, monster.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hp, xp, maxHP, items);
  }

  @Override
  public String toString() {
    return "hp=" + hp + "/" + maxHP;
  }
}
