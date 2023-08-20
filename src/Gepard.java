public class Gepard extends Beast{
    private double weigth;

    public Gepard(String name, double weigth) {
        super(name);
        this.weigth = weigth;
    }
    public void speed(){
        System.out.println(name + "'s speed: Extremely fast!");//skorost ochen vysokaia

    }
}
