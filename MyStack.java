//we will use array to back our stack
public class MyStack<T> implements MyStackInterface<T>{

//we instatiated our instance variable 
        private int top;
        private T[] genericArray;
// suprresed warnings because the compiler will not stop complaining 
//for unchecked errors 

       @SuppressWarnings("unchecked")
        public MyStack(int capacity) {
            genericArray =(T[]) new Object[capacity];
        }

//this method will help us to add element to our stack
//i have implemented a helper method to the sake of code
//cleaness.the helper method will help us to grow the 
//backing array incase it is full

        public void push(T x){
            if (top == genericArray.length) {
                grow((genericArray.length)*2);
            }
            genericArray[top++] = x;

        }
// this method will help us to remove the top item from our stack
//also error check is implemented.

        public T pop(){
            if (isEmpty()){
                return null;
            }

//we return the value one less than the top 
            T x = genericArray[--top];
            genericArray[top] = null;
            return x;
        }

//this method helps us to reveal the top element without 
//removing it.
//exception is in place incase the backing array is empty

        public T peek(){
            if (isEmpty()){
                return null;
            }
            return genericArray[top-1];
        }

//this method is used to check if the array is empty
//this is helpfull to other methods implementaion as well.

        public boolean isEmpty(){
            return top == 0;
        }

//this is a helper method that will grow the array as per needed.

        private void grow(int newsize){
            if(newsize < genericArray.length){
                return;
            }
            @SuppressWarnings("unchecked")
            T[] newGenericArray = (T[]) new Object[newsize];
            for(int i =0 ; i < top; i++){
                newGenericArray[i] = genericArray[i];
            }
            genericArray = newGenericArray;
        }
// i have included additonal method to help me check the element of the 
//stack. This method will help to print out the elements of the stack.

        public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(genericArray[i]);
        }
    }

//this method will help to know the current size of our MyStack

        public int size(){
            return top + 1;
        }

    //    public static void main(String[] args) {
    //     MyStack<String> a = new MyStack<>(15);
    //     a.push("paul");
    //     a.push("blear");
    //     a.push("Tesfalem");
    //     a.push("Eshetu");
    //     a.push("wanofi");
    //     a.push("asfaw");
    //     a.push("stanley");
        
    //     System.out.println("peak is " + a.peek());
    //     a.printStack();
    //     System.out.println(a.top);

    // }
    }
