
import exceptions.AttackMissedException;
import exceptions.InvalidChoiceException;

import java.util.*;
public class Main {
    private static void final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

            System.out.println("Bienvenido al mundo Pokemon");
            System.out.println("Ingresa tu nombre");
            String playerName = Scanner.nexLine();

        List<JuegoPokemon> pokemon = List.of(new Charizard(), new Squietle(), new Pikachu(), new Ninorino());

        // Selección del jugador
        JuegoPokemon playerPokemon = null;
        while (playerPokemon == null) {
            try {
                System.out.println("\nElige tu Pokémon:");
                for (int i = 0; i < pokemon.size(); i++) {
                    System.out.println((i + 1) + ". " + pokemon.get(i).getName());
                }
                int choice = scanner.nextInt();
                if (choice < 1 || choice > pokemon.size()) {
                    throw new InvalidChoiceException("Opción inválida.");
                }
                playerPokemon = pokemon.get(choice - 1);
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next();
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
            }
        }

        // CPU elige
        Random random = new Random();
        JuegoPokemon cpuPokemon;
        do {
            cpuPokemon = pokemon.get(random.nextInt(pokemon.size()));
        } while (cpuPokemon.getName().equals(playerPokemon.getName()));

        System.out.println("\n" + playerName + " eligió a " + playerPokemon.getName() + "!");
        System.out.println("La CPU eligió a " + cpuPokemon.getName() + "!");

        BattleLogger logger = new BattleLogger();

        while (playerPokemon.isAlive() && cpuPokemon.isAlive()) {
            System.out.println("\n--- Turno de " + playerName + " ---");
            for (int i = 0; i < playerPokemon.getAttacks().size(); i++) {
                System.out.println((i + 1) + ". " + playerPokemon.getAttacks().get(i).getName());
            }

            int attackChoice = -1;
            try {
                attackChoice = scanner.nextInt();
                if (attackChoice < 1 || attackChoice > playerPokemon.getAttacks().size()) {
                    throw new InvalidChoiceException("Opción inválida.");
                }
                Attack attack = playerPokemon.getAttacks().get(attackChoice - 1);
                try {
                    int damage = attack.execute();
                    cpuPokemon.receiveDamage(damage);
                    logger.logEvent(playerPokemon.getName() + " usó " + attack.getName() + " e hizo " + damage + " de daño.");
                    logger.logDamage(damage);
                } catch (AttackMissedException e) {
                    System.out.println(e.getMessage());
                    logger.logEvent(playerPokemon.getName() + " falló el ataque.");
                    logger.logMiss(playerName);
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next();
                continue;
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
                continue;
            }

            if (!cpuPokemon.isAlive()) break;

            System.out.println("\n--- Turno de la CPU ---");
            Attack cpuAttack = cpuPokemon.getAttacks().get(random.nextInt(cpuPokemon.getAttacks().size()));
            try {
                int damage = cpuAttack.execute();
                playerPokemon.receiveDamage(damage);
                logger.logEvent(cpuPokemon.getName() + " usó " + cpuAttack.getName() + " e hizo " + damage + " de daño.");
                logger.logDamage(damage);
            } catch (AttackMissedException e) {
                System.out.println(e.getMessage());
                logger.logEvent(cpuPokemon.getName() + " falló el ataque.");
                logger.logMiss("CPU");
            }

            System.out.println("\nHP de " + playerPokemon.getName() + ": " + playerPokemon.getCurrentHp());
            System.out.println("HP de " + cpuPokemon.getName() + ": " + cpuPokemon.getCurrentHp());
        }

        // Resultado
        if (playerPokemon.isAlive()) {
            System.out.println("\n🎉 ¡" + playerName + " ganó la batalla!");
        } else if (cpuPokemon.isAlive()) {
            System.out.println("\n💀 La CPU ganó la batalla.");
        } else {
            System.out.println("\n🤝 ¡Empate!");
        }

        logger.printSummary();
    }
        Squietle squietle = new Squietle() {
                @Override
                protected void actacarAranazo() {
                    super.actacarAranazo();
                }
            };
            Charizard charizard = new Charizard(){
                @Override
                protected void actacarAranazo() {
                    super.actacarAranazo();
                }
            };
            Ninorino ninorino = new Ninorino(){
                @Override
                protected void actacarAranazo() {
                    super.actacarAranazo();
                }
            };
            Pikachu pikachu = new Pikachu(){
                @Override
                protected void actacarAranazo() {
                    super.actacarAranazo();
                }
            };
            System.out.println(squietle);
            System.out.println(charizard);
            System.out.println(pikachu);
            System.out.println(ninorino);


        }
    }