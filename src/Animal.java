public abstract class Animal {
    public static final Object[][] objects = new Object[4][4];


    public static int ves;
    public static int maxColvoNaCletce;
    public static int maxCletocZaHod;
    public static int maxKgEatDlyaSitostiZaXod;
    public static int count;


    public abstract void dvigatsa();

    public abstract void eat();

    public abstract void razmno();

    public abstract void dead();

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        Animal.ves = ves;
    }


    public int getMaxColvoNaCletce() {
        return maxColvoNaCletce;
    }

    public void setMaxColvoNaCletce(int maxColvoNaCletce) {
        Animal.maxColvoNaCletce = maxColvoNaCletce;
    }


    public int getMaxCletocZaHod() {
        return maxCletocZaHod;
    }

    public void setMaxCletocZaHod(int maxCletocZaHod) {
        Animal.maxCletocZaHod = maxCletocZaHod;
    }


    public int getKgEatDlyaSitosti() {
        return maxKgEatDlyaSitostiZaXod;
    }

    public void setKgEatDlyaSitosti(int kgEatDlyaSitosti) {
        maxKgEatDlyaSitostiZaXod = kgEatDlyaSitosti;
    }


}
