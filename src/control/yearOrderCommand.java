package control;

import model.Catalogue;
import view.CatalogueDisplay;

public class yearOrderCommand implements Command{

    private Catalogue catalogue;
    private CatalogueDisplay catalogueDisplay;

    public yearOrderCommand(Catalogue catalogue, CatalogueDisplay catalogueDisplay) {
        this.catalogue = catalogue;
        this.catalogueDisplay = catalogueDisplay;
    }
    
    @Override
    public void execute() {
        catalogue.yearOrder();
        catalogueDisplay.display(catalogue);
    }
    
}
