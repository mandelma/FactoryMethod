package factorymethod;

public class Vesi implements Juoma{
    private String vesi;
    public Vesi () {
        this.vesi = "vesi";
    }
    public String toString () {
        return vesi;
    }

    @Override
    public Vesi createJuoma() {
        return new Vesi();
    }
}
