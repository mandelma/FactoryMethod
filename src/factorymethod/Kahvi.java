package factorymethod;

public class Kahvi implements Juoma {
    private String kahvi;

    public Kahvi () {
        this.kahvi = "kahvi";
    }

    public String toString() {
        return kahvi;
    };

    @Override
    public Kahvi createJuoma() {
        return new Kahvi();
    }
}
