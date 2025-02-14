package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape tegshUn = new Rectangle(2, 3);
        Shape kvad = new Square(5);
        Shape dugui = new Circle(8);

        Renderer renderer1 = new Renderer(dugui);
        renderer1.draw();
        Renderer renderer2 = new Renderer(tegshUn);
        renderer2.draw();
        Renderer renderer3 = new Renderer(kvad);
        renderer3.draw();
    }
}
