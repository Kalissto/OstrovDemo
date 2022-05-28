public class Grass extends Animal {

    private int ves;
    private int maxColvoNaCletce;
    static int count = 0;

    public Grass(int ves, int maxColvoNaCletce) {
        this.ves = ves;
        this.maxColvoNaCletce = maxColvoNaCletce;
    }

    @Override
    public String toString() {
        return "\uD83C\uDF3F";
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

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public int getMaxColvoNaCletce() {
        return maxColvoNaCletce;
    }

    public void setMaxColvoNaCletce(int maxColvoNaCletce) {
        this.maxColvoNaCletce = maxColvoNaCletce;
    }
}
