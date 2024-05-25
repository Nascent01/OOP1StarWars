package cli;

import command.*;

public abstract class CommandFactory {
    public static Command receiveCommand(String command) {
        switch (command.toLowerCase()) {
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
        }

        return null;
    }
}
