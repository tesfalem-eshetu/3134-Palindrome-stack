//imported arraylist for further usage in the code
import java.util.ArrayList;

//this class implements the BigOInterface provided

public class BigO implements BigOInterface {
    //this methos have an overll time complexity of big o of n^3
    //it uses the input integer n as an input to determine the 
    //the size of the created arraylists.
    // 
    public void cubic(int n){
         //the following arraylist uses the argument as a size argument

        ArrayList<Integer> array1 = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            array1.add(i*i);
        }

        ArrayList<Integer> array2 = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            array2.add(i +20);
        }

        ArrayList<Integer> array3 = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            array3.add(i/2);
        }
        //the following enhanced for loop helps to create the summation 
        //of the elemets in the same position in the individual 
        //arraylists.
       for(int first : array1){
           for(int second : array2){
               for(int third : array3){
                   System.out.println(first + second + third);
               }
           }
       }
    }
  
  //the following method mimics the implemation of the fibonacci numbers 
  //in reccursive call but , rather than givning the sum , it will simply
  //gives the maximum amout of o and 1 combinaitions that coud be formed 
  //by a number , which if summed up would give the fibonacci value of the 
  //number. this method have a time complexity of 2^n.  

   public void exp(int n) {
     if (n < 2) {
        System.out.print(n + " ");

    } else {
        exp(n - 1);
        exp(n - 2);
    }
}   
     // the following method helps to calculate the square of a number in 
     //time complexity of constant time.
     
     public void constant(int n){
          int SquareValue = n * n;
          System.out.println(SquareValue);
     }
}
