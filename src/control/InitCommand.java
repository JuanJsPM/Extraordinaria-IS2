package control;

import java.util.HashMap;
import java.util.Map;
import model.Catalogue;
import view.CatalogueDisplay;

public class InitCommand implements Command{

    private final Map<String, Command> commands = new HashMap<>();
    private final CatalogueDisplay catalogueDisplay;
    private final Catalogue catalogue;

    public InitCommand(CatalogueDisplay catalogueDisplay, Catalogue catalogue) {
        this.catalogueDisplay = catalogueDisplay;
        this.catalogue = catalogue;
    }


    
    @Override
    public void execute() {
        commands.put("LOCATION", new locationOrderCommand(catalogue, catalogueDisplay));
        commands.put("MATERIAL", new materialOrderCommand(catalogue, catalogueDisplay));
        commands.put("PHOTOS", new photosOrderCommand(catalogue, catalogueDisplay));
        commands.put("YEAR", new yearOrderCommand(catalogue, catalogueDisplay));
        commands.put("CONDITION", new conditionOrderCommand(catalogue, catalogueDisplay));
    }
    
    public Map<String, Command> getCommands() {
        return commands;
    }
    
}
