package hafizaoyunu;

public class Karti {
    private char deger;
    private boolean tahmin=false;

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }

    public Karti(char deger) {
        this.deger = deger;
    }
}
