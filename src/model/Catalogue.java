package model;

import java.util.*;

public class Catalogue {
    
    private List<ph> phs;

    public Catalogue(List<ph> phs) {
        this.phs = phs;
    }
    
    public List<ph> getPhs() {
        return phs;
    }

    public void locationOrder() {
        Collections.sort(phs , new Comparator<ph>() {
            @Override
            public int compare(ph f1, ph f2) {
                return f1.getLocation().compareTo(f2.getLocation());
            }
        });
    }

    public void yearOrder() {  
        Collections.sort(phs, new Comparator<ph>() {
            @Override
            public int compare(ph f1, ph f2) {
                Integer p1 = f1.getYear();
                Integer p2 = f2.getYear();
                return -(p1.compareTo(p2));
            }
        });
    }

    public void materialOrder() {
        Collections.sort(phs, new Comparator<ph>() {
            @Override
            public int compare(ph f1, ph f2) {
                return f1.getMaterial().compareTo(f2.getMaterial());
            }
        });
    }
    
        public void conditionOrder() {
        Collections.sort(phs, new Comparator<ph>() {
            @Override
            public int compare(ph f1, ph f2) {
                return f1.getCondition().compareTo(f2.getCondition());
            }
        });
    }
    public void photosOrder() {
        Collections.sort(phs, new Comparator<ph>() {
            @Override
            public int compare(ph f1, ph f2) {
                Integer p1 = f1.getTotalphotos();
                Integer p2 = f2.getTotalphotos();
                return -(p1.compareTo(p2));
            }
        });
    }
    
    
    
}
