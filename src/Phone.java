public class Phone extends Device{
   private   double price;

    public Phone(String name,double price) {
        super(name);
        this.price = price;
    }



    public  void takePhoto(){
        System.out.println("taking a photo with a phone");//sdelat photo na telephone

    }

    @Override
    public void sound() {
        System.out.println("Phone sound");

    }
}

