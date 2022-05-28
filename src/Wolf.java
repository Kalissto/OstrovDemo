import java.util.Iterator;
import java.util.List;

public class Wolf extends Hisniki {


    private int ves;
    private int maxColvoNaCletce;
    private int maxCletocZaHod;
    private int maxKgEatDlyaSitostiZaXod;

    static int count = 0;

    @Override
    public String toString() {
        return "\uD83D\uDC3A";
    }

    public Wolf(int ves, int maxColvoNaCletce, int maxCletocZaHod, int maxKgEatDlyaSitostiZaXod) {
        this.ves = ves;
        this.maxColvoNaCletce = maxColvoNaCletce;
        this.maxCletocZaHod = maxCletocZaHod;
        this.maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod;

    }


    @Override
    public void dvigatsa() {
        int g = CellCletka.random.nextInt(2);
        for (int i = 0; i < Animal.objects.length - 1; i++) {
            for (int j = 0; j < Animal.objects[i].length; j++) {
                Animal da;
                OstrovDemo.animals = (List<Animal>) Animal.objects[i][j];
                for (int k = 0; k < OstrovDemo.animals.size(); k++) {
                    da = OstrovDemo.animals.get(k);
                    List<Animal> animals1 = (List<Animal>) Animal.objects[i + 1][j];
                    animals1.add(da);
                    OstrovDemo.animals.remove(da);
                    int v = 8 / 100 * 10;
                    int result = (int) Math.round(v);
                    maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod - result;

                }

            }
        }
    }

    @Override
    public void eat() {
        Iterator<Animal> itr = OstrovDemo.animals.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            int a = CellCletka.random.nextInt(100);


            if (x instanceof Zayac) {
                int b = a * 60 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Zayac) x).getVes();
                        itr.remove();
                        Zayac.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }
                    break;
                }
            }
            if (x instanceof Horse) {
                int b = a * 10 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Horse) x).getVes();
                        itr.remove();
                        Horse.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }
                    break;
                }
            }
            if (x instanceof Deer) {
                int b = a * 15 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Deer) x).getVes();
                        itr.remove();
                        Deer.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }
                    break;
                }
            }
            if (x instanceof Mouse) {
                int b = a * 80 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Mouse) x).getVes();
                        itr.remove();
                        Mouse.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }

                }
            }
            if (x instanceof Goat) {
                int b = a * 60 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Goat) x).getVes();
                        itr.remove();
                        Goat.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }
                    break;
                }
            }
            if (x instanceof Sheep) {
                int b = a * 70 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Sheep) x).getVes();
                        itr.remove();
                        Sheep.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }
                    break;
                }
            }
            if (x instanceof Kangaroo) {
                int b = a * 15 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Kangaroo) x).getVes();
                        itr.remove();
                        Kangaroo.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }
                    break;
                }
            }
            if (x instanceof Cow) {
                int b = a * 10 / 100;
                if (b > 50) {
                    if (maxKgEatDlyaSitostiZaXod < 8) {
                        maxKgEatDlyaSitostiZaXod = maxKgEatDlyaSitostiZaXod + ((Cow) x).getVes();
                        itr.remove();
                        Cow.count--;
                        if (maxKgEatDlyaSitostiZaXod > 8) {//чтоб не переваливало за мах кол во жизней
                            maxKgEatDlyaSitostiZaXod = 8;
                        }
                    }
                    break;
                }
            }
            if (x instanceof Duck) {
                int b = a * 40 / 100;
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
        if (rand > 80) {
            if (maxKgEatDlyaSitostiZaXod == 8) {
                OstrovDemo.animals.add(new Wolf(50, 30, 3, 1));
                count++;

            }
        }
    }//размножаются в первую ячейку


    @Override
    public void dead() {
        Iterator<Animal> itr = OstrovDemo.animals.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            if (x instanceof Wolf) {//нужно
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