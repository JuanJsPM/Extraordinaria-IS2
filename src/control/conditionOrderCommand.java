package control;

import model.Catalogue;
import view.CatalogueDisplay;

public class conditionOrderCommand implements Command{

    private Catalogue catalogue;
    private CatalogueDisplay catalogueDisplay;

    public conditionOrderCommand(Catalogue catalogue, CatalogueDisplay catalogueDisplay) {
        this.catalogue = catalogue;
        this.catalogueDisplay = catalogueDisplay;
    }
    
    @Override
    public void execute() {
        catalogue.conditionOrder();
        catalogueDisplay.display(catalogue);
    }
    
}
