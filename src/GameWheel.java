import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class GameWheel {
    public static void main(String[] args) {

    }
    //public GameWheel(){
        //for (int i = 0; i < slices.size(); i++) {
            //if (i == 0) {
                //black.add(slices.get(i));
            //}else if (i == 5){
                //black.add(slices.get(i));
           // }else if (i == 10){
                //black.add(slices.get(i));
           // }else if (i ==15){
                //black.add(slices.get(i));
           // }else{
                //double x = slices.get(i);
                //if ( x%2 != 0) {
                    //red.add(slices.get(i));
                //}else if (x%2 == 0){
                   // blue.add(slices.get(i));
                //}
            //}

        //}
    //}

    // Main list of slices making up the wheel
    private ArrayList<Slice> slices;
    // Position of currently selected slice on wheel
    private int currentPos;
    //These color ArrayLists will be utilized in the sort and scramble
    private ArrayList<Slice> red = new ArrayList<Slice>();
    private ArrayList<Slice> blue = new ArrayList<Slice>();
    private ArrayList<Slice> black = new ArrayList<Slice>();


    public GameWheel(){
        for (int i = 0; i < 20; i++) {
            if (i == 5 || i == 0 || i == 10 || i ==15) {
                slices.add(i, new Slice("Black", i*1000));
            }else if (i%2 == 1){
                slices.add(i, new Slice("Red", i*200));
            }else{
                slices.add(i, new Slice("Blue", i*100));
            }
        }
    }

    public String toString() {
        String x = "";
        for (int i = 0; i < slices.size(); i++) {
            x = slices.get(i).toStringSlice();
        }
        return x;
    }
    public void split(){
        for (int i = 0; i < slices.size(); i++) {

        }
    }
    public void scramble(){

    }

    public void sort(){

    }

    public Slice spinWheel(){

    }

    public Slice getSlice(int i){

    }

}