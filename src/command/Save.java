package command;

import cli.Command;
import io.XmlWrite;
import universe.Universe;

import javax.sql.rowset.spi.XmlReader;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Save implements Command {

    @Override
    public void execute(String[] args) throws IOException, ParserConfigurationException, TransformerException {
        if (!Universe.getInstance().isFileOpened()) {
           if (args.length != 1) {
               Universe universe = Universe.getInstance();
               XmlWrite xmlWrite = new XmlWrite();
               xmlWrite.writeXmlFile(universe, universe.getFileName());
               System.out.println("Saved " + universe.getFileName() + " to " + universe.getFileName());
           }
        } else {
            System.out.println("You must open a file first");
        }
    }
}
