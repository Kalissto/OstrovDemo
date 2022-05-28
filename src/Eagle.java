import java.util.Iterator;
import java.util.List;

public class Eagle extends Hisniki {//орел

    private int ves;
    private int maxColvoNaCletce;
    private int maxCletocZaHod;
    private int maxKgEatDlyaSitostiZaXod;

    static int count = 0;

    @Override
    public String toString() {
        return "\uD83E\uDD85";
    }

    public Eagle(int ves, int maxColvoNaCletce, int maxCletocZaHod, int maxKgEatDlyaSitostiZaXod) {
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
                    if (OstrovDemo.animals.get(k) instanceof Eagle) {
                        da = OstrovDemo.animals.get(k);
                        List<Animal> animals1 = (List<Animal>) Animal.objects[i + 1][j];
                        animals1.add(da);
                        OstrovDemo.animals.remove(da);
                        int v = 1 / 100 * 10;
                        int result = Math.round(v);
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
            int ra = CellCletka.random.nextInt(100);
            if (x instanceof Zayac) {
                int b = ra * 90 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 1) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Zayac) x).getVes();
                        itr.remove();
                        Zayac.count--;
                        if (maxKgEatDlyaSitostiZaXod > 1) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 1;
                        }
                        // System.out.println("сытость волка " + maxKgEatDlyaSitostiZaXod);

                    }
                    break;
                }
            }
            if (x instanceof Fox) {
                int b = ra * 10 / 100;
                if (b >= 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Fox) x).getVes();
                        itr.remove();
                        Fox.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }
                    break;
                }
            }
            if (x instanceof Mouse) {
                int b = ra * 90 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Mouse) x).getVes();
                        itr.remove();
                        Mouse.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }
                    break;
                }
            }
            if (x instanceof Duck) {
                int b = ra * 80 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Duck) x).getVes();
                        itr.remove();
                        Duck.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }
                    break;
                }
            }
        }
    }

    @Override
    public void razmno() {
        int rand = CellCletka.random.nextInt(100);
        if (rand > 70) {
            if (maxKgEatDlyaSitostiZaXod == 1) {
                OstrovDemo.animals.add(new Eagle(6, 20, 3, 1));
                count++;
            }
        }
    }

    @Override
    public void dead() {
        Iterator<Animal> itr = OstrovDemo.animals.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            if (x instanceof Eagle) {
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
