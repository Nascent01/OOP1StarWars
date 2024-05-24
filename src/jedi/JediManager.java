package jedi;

import planet.Planet;
import planet.PlanetManager;
import universe.Universe;

import java.util.HashSet;
import java.util.Optional;

public class JediManager {

    public static void createJedi(String[] arr) {
        String givenPlanet = arr[0];
        String givenName = arr[1];
        String givenRank = arr[2];
        String givenSaberColor = arr[4];
        JediRank[] jediRanks = JediRank.values();
        JediLightSaberColor[] lightSaberColors = JediLightSaberColor.values();
        JediRank rank = JediRank.INITIATE;
        JediLightSaberColor color = JediLightSaberColor.Blue;

        for (JediRank jediRank : jediRanks) {
            if (givenRank.equals(jediRank.getRankName())) {
                rank = jediRank;
            }
        }

        for (JediLightSaberColor jediLightSaberColor : lightSaberColors) {
            if (givenSaberColor.equals(jediLightSaberColor.name())) {
                color = jediLightSaberColor;
            }
        }

        HashSet<Jedi> jedi = Universe.getInstance().getJediPopulation();
        if (!PlanetManager.planetExist(givenPlanet)) {
            System.out.println("Planet " + givenPlanet + " does not exist");
        } else {
            Optional<Jedi> foundJedi = jedi.stream()
                    .filter(existingJedi -> existingJedi.getPlanet().getName().equalsIgnoreCase(givenPlanet))
                    .filter(existingJedi -> existingJedi.getName().equalsIgnoreCase(givenName))
                    .findAny();
            if(foundJedi.isPresent()){
                System.out.println("There already exists such a jedi on this planet");
            }
            else {
                jedi.add(new Jedi(givenName, rank, Integer.parseInt(arr[3]), color, Double.parseDouble(arr[5]),
                        new Planet(givenPlanet)));
                Universe.getInstance().setJediPopulation(jedi);
            }
        }
    }
}
