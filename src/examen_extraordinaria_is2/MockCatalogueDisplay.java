package examen_extraordinaria_is2;

import model.Catalogue;
import model.ph;
import view.CatalogueDisplay;

public class MockCatalogueDisplay implements CatalogueDisplay{

    @Override
    public void display(Catalogue catalogue) {
        for (ph ph : catalogue.getPhs()) {
            System.out.println(ph.toString());
        }
    }
    
}
