import java.util.List;
import java.util.ArrayList;


public class CommandInvoker {
    private List<ICommand> commandHistory = new ArrayList<>();

    public void executeCommand(ICommand command) {
        command.execute();
        commandHistory.add(command);
    }

    public List<ICommand> getCommandHistory() {
        return commandHistory;
    }
}
