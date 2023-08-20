public class Wolf extends Beast{
    private double weigth;

    public Wolf(String name, double weigth) {
        super(name);
        this.weigth = weigth;
    }
    public void speed(){
        System.out.println(name + " 's speed: Fast");//skorost bystraya
    }
}
