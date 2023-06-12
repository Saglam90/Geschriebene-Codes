package Auto_1;

public class Auto {
    
    private String marke;
    private int baujahr;
    
    public Auto(String m, int b) {
        marke = m;
        baujahr = b;
    }

    public String getMarke() {
        return marke;
    }
    
    public void setMarke(String m) {
        marke = m;
    }
    
    public int getBaujahr() {
        return baujahr;
    }
    
    public void setBaujahr(int b) {
        baujahr = b;
    }
    
    @Override
    public String toString() {
        return marke + " " + "(" + baujahr + ")";
    }
}
