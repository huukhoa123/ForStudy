public class Sum{

    public static int Sum(int x ){
        if(x==0){
            return 1 ;
        }else{
            return x+Sum(x-1);
        }
    }
    public static void main(String [] args){
        System.out.println(Sum(100));
    }
}
