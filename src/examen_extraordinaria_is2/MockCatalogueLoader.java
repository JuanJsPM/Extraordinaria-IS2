package examen_extraordinaria_is2;

import java.util.ArrayList;
import java.util.List;
import model.Catalogue;
import model.ph;
import view.CatalogueLoader;

public class MockCatalogueLoader implements CatalogueLoader{

    @Override
    public Catalogue load() {
        List<ph> phs = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        authors.add("Actor1");
        authors.add("Actor2");
        authors.add("Actor3");
        authors.add("Actor4");
        phs.add(new ph("Catalogo1", "Monumento1", 1950, authors, "Fabricacion1","localizacion1","Material1", "Estado1", 2));
        phs.add(new ph("Catalogo2", "Monumento2", 2000, authors, "Fabricacion2","localizacion2","Material2", "Estado2", 10));
        phs.add(new ph("Catalogo3", "Monumento3", 1980, authors, "Fabricacion3","localizacion3","Material3", "Estado3", 4));
        Catalogue catalogue = new Catalogue(phs);
        return catalogue;
    }
}
