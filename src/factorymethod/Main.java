package factorymethod;

public class Main {
    public static void main(String[] args) {
        AterioivaOtus opettaja1 = new Opettaja();
        Kahvi kahvi = new Kahvi().createJuoma();
        Vesi vesi = new Vesi().createJuoma();

        opettaja1.aterioi(vesi);
        System.out.println("------------------------------");
        AterioivaOtus opettaja2 = new Opettaja();
        opettaja2.aterioi(kahvi);
    }
}
