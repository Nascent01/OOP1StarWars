package command;

import cli.Command;
import io.XmlWrite;
import universe.Universe;

public class SaveAs implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        if (Universe.getInstance().isFileOpened()) {
            if (args.length != 1) {
                System.out.println("Invalid number of arguments");
            } else {
                String fileName = args[0];
                XmlWrite xmlWrite = new XmlWrite();
                Universe universe = Universe.getInstance();
                xmlWrite.writeXmlFile(universe, fileName);
                System.out.println("Saved as " + fileName);
            }
        } else {
            System.out.println("File not opened");
        }
    }
}
