package command;

import cli.Command;
import jedi.JediManager;
import universe.Universe;

public class GetMostUsedSaberColor implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (!Universe.getInstance().isFileOpened()) {
            System.out.println("Open file first!");
        } else if (args.length == 1) {
            JediManager.getMostUsedSaberColor(args);
        } else if (args.length == 2) {
            JediManager.getMostUsedSaberColorWithRank(args);
        } else {
            System.out.println("Usage: get_most_used_saber_color <planet_name> or get_most_used_saber_color <planet_name> <jedi_rank>");
        }
    }
}
