package model;

import java.util.List;

public class ph {
    
    private final String catalogue;
    private final String name;
    private final int year;
    private final List<String> Authors;
    private final String manufacturing;
    private final String location;
    private final String material;
    private final String condition;
    private final int  totalphotos;
    
    public ph(String catalogue, String name, int year, List<String> Authors, String manufacturing, String location, String material, String condition, int  totalphotos) {
        this.catalogue = catalogue;
        this.name = name;
        this.year = year;
        this.Authors = Authors;
        this.manufacturing = manufacturing;
        this.location = location;
        this.material = material;
        this.condition = condition;
        this.totalphotos = totalphotos;
    }

    public String getcatalogue() {
        return catalogue;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return Authors;
    }

    public String getManufacturing() {
        return manufacturing;
    }

    public String getLocation() {
        return location;
    }

    public String getMaterial() {
        return material;
    }

    public String getCondition() {
        return condition;
    }

    public int getTotalphotos() {
        return totalphotos;
    }
        
    public String Authors() {
        String mensaje = "";
        for (String Author : Authors) {
            mensaje += Author + ",";
        }
        return mensaje;
    }
    
    @Override
    public String toString() {
        return catalogue + " - " + name + " - " + year + " - " + Authors() + " - " 
            + manufacturing + " - " + "+" + location + " - " + material + " - " 
            + " - " + condition + " - " + " - " + totalphotos + " Fotos realizadas";
    }
}
