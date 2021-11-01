package factorymethod;

public abstract class AterioivaOtus {
    //Juoma juoma = null;

    public abstract Juoma createJuoma();

    public void aterioi(Juoma juoma){
        syö();
        juo(juoma);
    }

    public void syö(){
        System.out.println("Kylläpä ruoka maistuukin hyvältä");
    }

    public void juo(Juoma juoma){
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }
}
