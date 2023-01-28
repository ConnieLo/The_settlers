package src;

public class Vertex {

    int label;

    Vertex(int label){
        this.label = label;
    }

    @Override
    public String toString(){
        return (label + "");
    }

}
