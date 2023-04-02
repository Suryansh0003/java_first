
   interface dig{
    public void bite();
    public void run();
   }
    class mydog implements dig{
@Override
public void bite() {
System.out.println("dog is biting ");    
}
@Override
    public void run() {
System.out.println("dog is running ");        
    }
    }
    class bitwise{
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(a >> 1);
        System.out.println(a << 2);
        System.out.println(b << 1);
        System.out.println(b >> 2);


        mydog d= new mydog();
        d.bite();
        d.run();
    }

    
}


