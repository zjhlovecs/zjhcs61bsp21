public class function {
    public static int twice(  Infuction f,int x){
        return f.apply(f.apply(x));

    }
    public static void main(String[] args){
        Tenx a=new Tenx();
        System.out.println(twice(a,10));
    }
}
