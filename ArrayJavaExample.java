public class ArrayJavaExample {
    public static void main(String[] args){

        int[] numbers;
        
        numbers = new int [] {10,20,30,40,50};//This also works here:
                                         // int[] numbers = {10,20,30,40,40}

        for(int i = 0;i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
    
}


//new ----> creates a new array object
//int ----> store integer values
//[5] ----> Create space for 5 elements