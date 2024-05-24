package cli;

import command.Open;

public abstract class CommandFactory {
    public static Command receiveCommand(String command) {
        switch (command.toLowerCase()) {
            case "open":
                return new Open();
        }

        return null;
    }
}
