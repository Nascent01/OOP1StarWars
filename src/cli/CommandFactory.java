package cli;

import command.*;

public abstract class CommandFactory {
    public static Command receiveCommand(String command) {
        switch (command.toLowerCase()) {
            case "add_planet":
                return new AddPlanet();
            case "create_jedi":
                return new CreateJedi();
            case "demote_jedi":
                return new DemoteJedi();
            case "open":
                return new Open();
            case "save":
                return new Save();
            case "saveas":
                return new SaveAs();
            case "help":
                return new Help();
            case "close":
                return new Close();
            case "exit":
                return new Exit();
            case "get_most_used_saber_color":
                return new GetMostUsedSaberColor();
            case "print":
                return new Print();
        }
        return null;
    }
}
