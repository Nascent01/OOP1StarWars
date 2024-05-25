package command;

import cli.Command;
import universe.Universe;

public class Help implements Command {

    @Override
    public void execute(String[] args) {
        if (!Universe.getInstance().isFileOpened()) {
            System.out.println("Open file first!");
        } else if (args.length != 1) {
            System.out.println("Usage: print all commands");
        } else {
            System.out.println("The following commands are supported:"
                    + "\nopen <file> opens <file>"
                    + "\nclose closes currently opened file"
                    + "\nsave saves the currently open file"
                    + "\nsaveas <file> saves the currently open file in <file>"
                    + "\nhelp prints this information"
                    + "\nexit exists the program");
        }
    }
}
