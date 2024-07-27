package com.quadir.Demo;

import java.util.Random;

//Here Manages the game logic, including attacking and defending.

public class Arena {
    private Player player1;
    private Player player2;
    private Random random;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();
    }

    public void startFight() {
        while (player1.isAlive() && player2.isAlive()) {
            if (player1.getHealth() <= player2.getHealth()) {
                attack(player1, player2);
                if (!player2.isAlive()) break;
                attack(player2, player1);
            } else {
                attack(player2, player1);
                if (!player1.isAlive()) break;
                attack(player1, player2);
            }
        }
        printResult();
    }

    private void attack(Player attacker, Player defender) {
        int attackRoll = rollDice();
        int defenseRoll = rollDice();
        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defenseRoll;
        int damage = Math.max(0, attackDamage - defenseStrength);
        defender.setHealth(defender.getHealth() - damage);
        System.out.println(attacker + " attacks with roll " + attackRoll + " for damage " + attackDamage);
        System.out.println(defender + " defends with roll " + defenseRoll + " for defense " + defenseStrength);
        System.out.println(defender + " takes " + damage + " damage, health now " + defender.getHealth());
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }

    private void printResult() {
        if (player1.isAlive()) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
