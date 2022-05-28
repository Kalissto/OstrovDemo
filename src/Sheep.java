import java.util.Iterator;
import java.util.List;

public class Sheep extends Travoyadnie {//овца
    private int ves;
    private int maxColvoNaCletce;
    private int maxCletocZaHod;
    private int maxKgEatDlyaSitostiZaXod;

    static int count = 0;

    @Override
    public String toString() {
        return "\uD83D\uDC11";
    }

    public Sheep(int ves, int maxColvoNaCletce, int maxCletocZaHod, int maxKgEatDlyaSitostiZaXod) {
        this.ves = ves;
        this.maxColvoNaCletce = maxColvoNaCletce;
        this.maxCletocZaHod = maxCletocZaHod;
        this.maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod;

    }


    @Override
    public void dvigatsa() {
        for (int i = 0; i < Animal.objects.length - 1; i++) {
            for (int j = 0; j < Animal.objects[i].length; j++) {
                Animal da;
                OstrovDemo.animals = (List<Animal>) Animal.objects[i][j];
                for (int k = 0; k < OstrovDemo.animals.size(); k++) {
                    if (OstrovDemo.animals.get(k) instanceof Sheep) {
                        da = OstrovDemo.animals.get(k);
                        List<Animal> animals1 = (List<Animal>) Animal.objects[i + 1][j];
                        animals1.add(da);
                        OstrovDemo.animals.remove(da);
                        int v = 15 / 100 * 10;
                        int result = (int) Math.round(v);
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod - result;
                    }
                }

            }
        }
    }

    @Override
    public void eat() {
        Iterator<Animal> itr = OstrovDemo.animals.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            if (x instanceof Grass) {
                if (maxKgEatDlyaSitostiZaXod < 15) {
                    maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Grass) x).getVes();
                    itr.remove();
                    Grass.count--;
                    if (maxKgEatDlyaSitostiZaXod > 15) {//чтоб не переваливало за мах кол во жизней
                        maxKgEatDlyaSitostiZaXod = 15;
                    }

                }
                break;
            }
        }
    }

    @Override
    public void razmno() {
        int rand = CellCletka.random.nextInt(100);
        if (rand > 50) {
            if (maxKgEatDlyaSitostiZaXod == 15) {
                OstrovDemo.animals.add(new Sheep(70, 140, 3, 1));
                count++;
            }
        }
    }

    @Override
    public void dead() {
        Iterator<Animal> itr = OstrovDemo.animals.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            if (x instanceof Sheep) {
                if (maxKgEatDlyaSitostiZaXod == 0 || maxKgEatDlyaSitostiZaXod < 0) {
                    itr.remove();
                    count--;
                }
            }
        }
    }

    @Override
    public int getVes() {
        return ves;
    }

    @Override
    public void setVes(int ves) {
        this.ves = ves;
    }

    @Override
    public int getMaxColvoNaCletce() {
        return maxColvoNaCletce;
    }

    @Override
    public void setMaxColvoNaCletce(int maxColvoNaCletce) {
        this.maxColvoNaCletce = maxColvoNaCletce;
    }

    @Override
    public int getMaxCletocZaHod() {
        return maxCletocZaHod;
    }

    @Override
    public void setMaxCletocZaHod(int maxCletocZaHod) {
        this.maxCletocZaHod = maxCletocZaHod;
    }

    public int getMaxKgEatDlyaSitostiZaXod() {
        return maxKgEatDlyaSitostiZaXod;
    }

    public void setMaxKgEatDlyaSitostiZaXod(int maxKgEatDlyaSitostiZaXod) {
        this.maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod;
    }
}
