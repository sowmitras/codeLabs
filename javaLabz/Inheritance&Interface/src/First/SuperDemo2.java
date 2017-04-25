/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;
//5.19

class Dim {

    double width;
    double height;
    double depth;

    Dim(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Double volume() {
        return width * height * depth;
    }
}

class NewDim extends Dim {

    double weight;

    public NewDim(double weight, double w, double h, double d) {
        super(w, h, d);
        this.weight = weight;
    }

}

public class SuperDemo2 {

    public static void main(String args[]) {
        System.out.println("Initializing members-using super()");
        NewDim obj = new NewDim(5, 5, 5, 5);
        System.out.println("width:" + obj.width);
        System.out.println("Height:" + obj.height);
        System.out.println("Depth:" + obj.depth);

        System.out.println("Initializing members-using subclass constructor");
        System.out.println("width:" + obj.weight);
        System.out.println("Computing Volume:");

        Double res = obj.volume();
        System.out.println(obj.volume());

    }
}
