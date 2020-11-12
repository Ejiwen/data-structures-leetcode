package ds.stack;

public class App {

    public static void main(String[] args) {
//        Stack theStack = new Stack(5);
//        theStack.push('H');
//        theStack.push('E');
//        theStack.push('L');
//        theStack.push('L');
//        theStack.push('O');
//
//        while (!theStack.isEmpty()){
//            char lettre = theStack.pop();
//            System.out.println(lettre);
//        }


        System.out.println(reverseString("Hello"));

    }

    public static String reverseString(String str){
        int stackSize = str.length();
        Stack reverse = new Stack(stackSize);
        for(int i=0; i<stackSize; i++){
            reverse.push(str.charAt(i));
        }
        str = "";
        while (!reverse.isEmpty()){
            str += reverse.pop();
        }
        return str;
    }
}
