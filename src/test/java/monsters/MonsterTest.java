// src/test/java/Monsters/MonsterTest.java
package monsters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {

  static class TestMonster extends Monster {
    public TestMonster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
      super(maxHP, xp, items);
      this.attack = (target) -> 5; // simple attack for testing
    }
  }

  private TestMonster monster;
  private TestMonster target;

  @BeforeEach
  void setUp() {
    monster = new TestMonster(100, 20, new HashMap<>());
    target = new TestMonster(50, 10, new HashMap<>());
  }

  @Test
  void getHp() {
    assertEquals(100, monster.getHp());
  }

  @Test
  void setHp() {
    monster.setHp(80);
    assertEquals(80, monster.getHp());
  }

  @Test
  void getXp() {
    assertEquals(20, monster.getXp());
  }

  @Test
  void getItems() {
    assertNotNull(monster.getItems());
  }

  @Test
  void setItems() {
    HashMap<String, Integer> items = new HashMap<>();
    items.put("potion", 2);
    monster.setItems(items);
    assertEquals(items, monster.getItems());
  }

  @Test
  void getMaxHP() {
    assertEquals(100, monster.getMaxHP());
  }

  @Test
  void getAgility() {
    assertEquals(10, monster.getAgility());
  }

  @Test
  void getDefense() {
    assertEquals(10, monster.getDefense());
  }

  @Test
  void getStrength() {
    assertEquals(10, monster.getStrength());
  }

  @Test
  void getAttribute() {
    int value = monster.getAttribute(1, 5);
    assertTrue(value >= 1 && value < 5);
  }

  @Test
  void takeDamage() {
    boolean alive = monster.takeDamage(20);
    assertTrue(alive);
    assertEquals(80, monster.getHp());
    alive = monster.takeDamage(100);
    assertFalse(alive);
    assertEquals(0, monster.getHp());
  }

  @Test
  void attackTarget() {
    int result = monster.attackTarget(target);
    assertEquals(1, result);
    assertEquals(45, target.getHp());
  }

  @Test
  void testEquals() {
    TestMonster m2 = new TestMonster(100, 20, new HashMap<>());
    assertEquals(monster, m2);
    m2.setHp(90);
    assertNotEquals(monster, m2);
  }

  @Test
  void testHashCode() {
    TestMonster m2 = new TestMonster(100, 20, new HashMap<>());
    assertEquals(monster.hashCode(), m2.hashCode());
  }

  @Test
  void testToString() {
    assertEquals("hp=100/100", monster.toString());
  }
}