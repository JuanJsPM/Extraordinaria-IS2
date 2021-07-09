package control;

import model.Catalogue;
import view.CatalogueDisplay;

public class photosOrderCommand implements Command{

    private Catalogue catalogue;
    private CatalogueDisplay catalogueDisplay;

    public photosOrderCommand(Catalogue catalogue, CatalogueDisplay catalogueDisplay) {
        this.catalogue = catalogue;
        this.catalogueDisplay = catalogueDisplay;
    }
    
    @Override
    public void execute() {
        catalogue.photosOrder();
        catalogueDisplay.display(catalogue);
    }
    
}
