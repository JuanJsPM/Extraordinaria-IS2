package control;

import model.Catalogue;
import view.CatalogueDisplay;

public class materialOrderCommand implements Command{

    private Catalogue catalogue;
    private CatalogueDisplay catalogueDisplay;

    public materialOrderCommand(Catalogue catalogue, CatalogueDisplay catalogueDisplay) {
        this.catalogue = catalogue;
        this.catalogueDisplay = catalogueDisplay;
    }

    @Override
    public void execute() {
        catalogue.materialOrder();
        catalogueDisplay.display(catalogue);
    }
    
}
