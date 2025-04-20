public class MyStack {

    private static int[] stack;
    private static int size;
    private static int top;

    public MyStack(int capacity){
        stack = new int[capacity];
        size = capacity;
        top = -1;
    }

    static boolean push(int data){
        if (top < size) {
            top++;
            stack[top] = data;
            return true;
        }else{
            return false;
        }
    }

    static int peek(){
        return stack[top];
    }

    static int pop(){
        if(top > 0){
            int temp = stack[top];
            top--;
            return temp;
        }else{
            return -1;
        }
    }

    static boolean isEmpty(){
        return (top == -1);
    }

    static boolean isFull(){
        return (top == size - 1);
    }
    public static void main(String[] args) {

        MyStack stack = new MyStack(5);

        push(58);
        push(85);
        push(98);

        System.out.println(peek());
        System.out.println(isEmpty());
        System.out.println(isFull());
        
    }
}
