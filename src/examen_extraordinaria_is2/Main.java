package examen_extraordinaria_is2;

import control.Command;
import control.InitCommand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import model.Catalogue;

public class Main {
    
    private final static Command NullCommand = new Command.Null();
    private final Map<String, Command> commands = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().execute();
    }
    
    public Main() {
        Catalogue catalogue = new MockCatalogueLoader().load();
        MockCatalogueDisplay catalogueDisplay = new MockCatalogueDisplay();
        catalogueDisplay.display(catalogue);

        InitCommand init = new InitCommand(catalogueDisplay, catalogue);
        init.execute();
        commands.putAll(init.getCommands());
    }

    private String input() {
        return scanner.next().toUpperCase();
    }

    private void execute() {
        while (true) commands.getOrDefault(input(), NullCommand).execute();
    }
    
}
