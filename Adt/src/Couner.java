public class Couner {
    String name;
    int counter = 0;

    public Couner(String str) {
    name = str;
    }

    public void increment(){
        counter++;
    }

    public int getCurrentValue(){
        return counter;
    }

    public String toString(){
        return "the Counter :"+name+" = "+counter;
    }
}
