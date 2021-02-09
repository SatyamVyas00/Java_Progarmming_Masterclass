package academy.learnprograming;

import java.util.ArrayList;

public class Main {
    static class IntClass
    {
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }
    }
    public static void main(String[] args) {
    String[] strArray = new String[10];
    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Satyam");

    //  ArrayList<int> intArrayList = new ArrayList<int>;
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(123);
        Double doubleValue = new Double(123.45);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i=0;i<=10;i++)
        {
            intArrayList.add(Integer.valueOf(i));  //AutoBoxing
        }

        for (int i=0;i<=10;i++)
        {
            System.out.println(i+" --> "+intArrayList.get(i).intValue());
        }


        Integer myIntValue =  56; //Integer.valueOf(56);
        int myInt = myIntValue; //myIntValue.intValue();

        ArrayList<Double> myDoubleArrayList = new ArrayList<Double>();
        for(double dbl=0.0;dbl<=10.0;dbl+=0.5)
        {
                 myDoubleArrayList.add(dbl /*Double.valueOf(dbl)*/);
        }

        for(int i=0;i<myDoubleArrayList.size();i++)
        {
            double value= myDoubleArrayList.get(i).doubleValue();
            System.out.println(i+" --> "+value);
        }
    }
}
