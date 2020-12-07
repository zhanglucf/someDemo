package com.example.demo.thinking.in.java.chapter;

public class Parcel {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }
    public void ship(String dest){
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

}
class Test{
    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        parcel.ship("Japan");
        Parcel parcel2 = new Parcel();
        Parcel.Contents contents = parcel.contents();
        parcel2.to("USA");
    }
}