public class Beast {
    protected String name;

    public Beast(String name) {
        this.name = name;
    }

    public void attack(String action) {
        System.out.println(name + " is " + action);
    }
}

