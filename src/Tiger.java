public class Tiger extends Beast{
    private double weigth;

    public Tiger(String name, double weigth) {
        super(name);
        this.weigth = weigth;
    }
    public void speed(){
        System.out.println(name+ "'s speed: Very fast");//Skorost ochen bystro
    }
}
