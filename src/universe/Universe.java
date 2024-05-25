package universe;

import io.XmlRead;
import jedi.Jedi;
import planet.Planet;

import java.util.HashSet;

public class Universe {
    private String fileName;
    private HashSet<Planet> planets = new HashSet<>();
    private HashSet<Jedi> jediPopulation = new HashSet<>();
    private static Universe universeInstance = null;
    private boolean isFileOpened = false;

    private Universe() {}

    public static Universe getInstance() {
        if (universeInstance == null) {
            universeInstance = new Universe();
        }
        return universeInstance;
    }

    public static Universe getUniverseInstance() {
        return universeInstance;
    }

    public void readFromXml(String fileName) {
        this.fileName = fileName;
        XmlRead xmlRead = new XmlRead();
        xmlRead.readXmlFile(fileName);
        System.out.println("File successfully opened: " + fileName);
        isFileOpened = true;
    }

    public HashSet<Jedi> getJediPopulation() {
        return jediPopulation;
    }

    public void setJediPopulation(HashSet<Jedi> jediPopulation) {
        this.jediPopulation = jediPopulation;
    }

    public HashSet<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(HashSet<Planet> planets) {
        this.planets = planets;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileOpened(boolean fileOpened) {
        isFileOpened = fileOpened;
    }

    public boolean isFileOpened() {
        return isFileOpened;
    }
}
