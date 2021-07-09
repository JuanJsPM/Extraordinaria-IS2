package control;

import model.Catalogue;
import view.CatalogueDisplay;

public class locationOrderCommand implements Command{
    
    private Catalogue catalogue;
    private CatalogueDisplay catalogueDisplay;

    public locationOrderCommand(Catalogue catalogue, CatalogueDisplay catalogueDisplay) {
        this.catalogue = catalogue;
        this.catalogueDisplay = catalogueDisplay;
    }

    
    @Override
    public void execute() {
        catalogue.locationOrder();
        catalogueDisplay.display(catalogue);
    }
}
