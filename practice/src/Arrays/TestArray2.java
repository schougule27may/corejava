package Arrays;

public class TestArray2 {

    public static void main(String[] args) {
        int arrayName[] = {1,2,310, 12};

        /*for(int i =0 ; i< arrayName.length; i++) {
            if(i == 0) {
                System.out.println("value at position " + i  + " is ==>" +arrayName[i]);
            }
        }*/
        int count = 0;
        for(int tempValue:arrayName){
            System.out.println("value at position " + count  + " is ==>" +tempValue);
            count++;
        }
    }
}
