public class ExceptionOnArray {
    public static void main(String[] args){
        Integer [] arrayInteger = new Integer [4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exeption){
            exeption.printStackTrace();
        }finally{
            System.out.println("clean out code...");
        }
    }
}
