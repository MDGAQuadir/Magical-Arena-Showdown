##Magical Arena

This is a simple Java implementation of the Magical Arena game.


## Introduction

Magical Arena is a simple game where two players, each defined by attributes `health`, `strength`, and `attack`, fight until one player's health reaches zero. Players attack in turns, with damage determined by rolling dice. The player with the lower health starts the game. The game ends when any player's health reaches zero.

## Features

- Players have attributes such as health, strength, and attack.
- Players take turns attacking and defending using dice rolls.
- Damage calculation is based on attack and defense rolls.
- The game ends when one player's health reaches 0.

## Classes

- `Player`: Represents a player in the game with attributes `health`, `strength`, and `attack`.
- `Arena`: Manages the game logic, including attacking and defending.
- `MagicalArenaGame`: Contains the `main` method to start the game.

## Requirements
- Java Development Kit - JDK
- Eclipse IDE
- JUnit 

## Project Structure
- src/main/java (Main.java): Contains the main source code files.
- src/test/java (PlayerTest.java and MagicalArenaTest.java: Contains the test source code files.
- pom.xml: Maven project configuration file.

## Setup and Installation

### Install Java

Make sure you have Java installed on your system. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Install Eclipse

Download and install Eclipse IDE for Java Developers from [here](https://www.eclipse.org/downloads/).

## Importing the Project into Eclipse

1. **Open Eclipse**:
   - Launch Eclipse IDE.

2. **Import the Maven Project**:
   - Go to `File` -> `Import...`.
   - Select `Existing Maven Projects` and click `Next`.
   - Browse to the root directory of your project (where `pom.xml` is located) and select it.
   - Click `Finish`.

3. **Verify Project Structure**:
   - Ensure your project structure in Eclipse's Project Explorer matches the structure shown above.

## Running the Application

1. **Run the Main Class**:
   - In the `Project Explorer`, navigate to `src/main/java/com/example/MagicalArenaGame.java`.
   - Right-click on `MagicalArenaGame.java` and select `Run As` -> `Java Application`.

## Running the Unit Tests

1. **Run All Tests**:
   - In the `Project Explorer`, navigate to `src/test/java/com/example/`.
   - Right-click on the `com.example` package and select `Run As` -> `JUnit Test`.

2. **Run Individual Test Class**:
   - In the `Project Explorer`, navigate to `src/test/java/com/example/PlayerTest.java` or `MagicalArenaTest.java`.
   - Right-click on the test class and select `Run As` -> `JUnit Test`.

## Example Gameplay

- Player A: 50 health, 5 strength, 10 attack
- Player B: 100 health, 10 strength, 5 attack

Gameplay steps:
1. Player A attacks and rolls a die (e.g., roll = 5).
2. Player B defends and rolls a die (e.g., roll = 2).
3. Calculate damage: (Player A attack value) * (die roll) - (Player B strength value) * (die roll).

Repeat steps until one player's health reaches zero.

## Author

-MD Gulam Abdul Quadir


NOTE- You have to connect your system version with jdk , maven , eclipse version otherwise it will not run. 

