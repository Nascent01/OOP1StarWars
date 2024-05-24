package command;

import cli.Command;
import universe.Universe;

public class SaveAs implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        if (Universe.getUniverseInstance().isFileOpened()) {
            if (args.length != 1) {
                System.out.println("Invalid number of arguments");
            } else {
                String filename = args[0];
                XmlWrite xmlWrite = new XmlWrite();
                Universe universe = Universe.getInstance();
                xmlWrite.writeXmlFile(universe, filename);
                System.out.println("Saved as " + filename);
            }
        } else {
            System.out.println("File not opened");
        }
    }
}
