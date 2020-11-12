package ds.stack;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top; // the index position of the last item

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j){
        if(this.isFull()){
            System.out.println("The Stack is Full ... came back later!");
        } else {
            top++;
            stackArray[top] = j;
        }
    }

    public char pop(){

        if(this.isEmpty()){
            System.out.println("The stack is Empty ... W're Sorry,came back later!");
            return 1;
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize-1 == top);
    }
}
