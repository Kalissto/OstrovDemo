public class Caterpillar extends Travoyadnie {

    private int ves;
    private int maxColvoNaCletce;


    static int count = 0;

    @Override
    public String toString() {
        return "\uD83D\uDC1B";
    }

    public Caterpillar(int ves, int maxColvoNaCletce) {
        this.ves = ves;
        this.maxColvoNaCletce = maxColvoNaCletce;


    }


    @Override
    public void dvigatsa() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void razmno() {

    }

    @Override
    public void dead() {

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

}
