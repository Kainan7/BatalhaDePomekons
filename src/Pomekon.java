public class Pomekon{
    private int atk;
    private int def;
    private int lvl;

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public Pomekon(int atk, int def, int lvl) {
        this.atk = atk;
        this.def = def;
        this.lvl = lvl;
    }

    public double valorGolpe(){
        double valorgolpe = (atk + def) / 2;
        return valorgolpe;
    }

}