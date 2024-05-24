package command;

import cli.Command;
import universe.Universe;

public class Close implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (Universe.getInstance().isFileOpened()) {
            Universe.getInstance().setFileOpened(false);
            Universe.getInstance().getPlanets().clear();
            Universe.getInstance().getJediPopulation().clear();
        } else {
            if (args.length != 1) {
                System.out.println("The command is exit");
            } else {
                System.out.println("No FILE IS OPENED");
            }
        }
    }
}
