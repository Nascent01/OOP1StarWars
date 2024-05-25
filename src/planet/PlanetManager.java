package planet;

import jedi.Jedi;
import jedi.JediHelper;
import universe.Universe;
import jedi.JediManager;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PlanetManager {

    public static boolean planetExist(String name) {
        HashSet<Planet> planets = Universe.getInstance().getPlanets();
        for (Planet planet : planets) {
            if (planet.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public static void addPlanet(String[] args) {
        String givenPlanet = args[0];
        if (planetExist(givenPlanet)) {
            System.out.println("Planet " + givenPlanet + " already exists");
        } else {
            Universe.getInstance().getPlanets().add(new Planet(givenPlanet));
            System.out.println("Planet " + givenPlanet + " added");
        }
    }

    public static void printInfo(String[] args) {
        String name = args[0];
        if (planetExist(name)) {
            List<Jedi> jedis = JediManager.getAllJediByPlanet(name);
            System.out.println("Planet Name: " + name);
            System.out.println("Jedi inhabitants:");
            getJediInfo(jedis);
        }
        if (JediHelper.jediExists(name)) {
            JediManager.printJediInfo(args);
        }
    }

    public static void getJediInhabitantsInPlanets(String[] args) {
        String planetName = args[0];
        String planetName2 = args[1];
        List<Jedi> jedis = JediManager.getAllJediByPlanet(planetName);
        List<Jedi> jedis2 = JediManager.getAllJediByPlanet(planetName);
        jedis.addAll(jedis2);
        List<Jedi> jedis3 = jedis.stream().sorted(Comparator.comparing(Jedi::getName)).collect(Collectors.toList());
        getJediInfo(jedis3);
    }

    public static void getJediInfo(List<Jedi> jedis3) {
        for (Jedi jedi: jedis3) {
            System.out.println("Jedi Name: " + jedi.getName());
            System.out.println("Jedi Age: " + jedi.getAge());
            System.out.println("Jedi Rank:" + jedi.getRank().getRankName());
            System.out.println("Jedi Strength:" + jedi.getStrength());
        }
    }
}
