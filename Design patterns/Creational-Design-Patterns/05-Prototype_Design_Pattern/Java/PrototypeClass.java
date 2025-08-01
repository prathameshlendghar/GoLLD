// // import java.utils.*;
// // import java.lang.*;

// // interface Clonable{
// //     Clonable clone();
// // }

// abstract class Shape{
//     @Override
//     abstract public Shape clone();
// }

// class Square extends Shape{
//     public Integer length;
    
//     Square(int len){
//         length = len;
//     }

//     Square(Square obj){
//         length = obj.length;
//     }

//     @Override
//     public Shape clone(){
//         return new Square(this);
//     }

//     public int getLen(){
//         return length;
//     }
//     public void setLen(Integer len){
//         length = len;
//     }
// }


// public class PrototypeClass{
//     public static void main(String[] args){
//         Square squr = new Square(100);
//         Shape squr2 = squr.clone();
//         squr.setLen(200);
//         System.out.println(((Square)squr2).getLen());
//     }
// }


// Abstract Prototype
abstract class Shape {
    public String type;

    public Shape(String type) {
        this.type = type;
    }

    // Prototype method
    public abstract Shape clone();

    public abstract void draw();
}


// Concrete Prototype: Square
class Square extends Shape {
    private int length;

    public Square(int length) {
        super("Square");
        this.length = length;
    }

    // Copy Constructor
    public Square(Square square) {
        super(square.type);
        this.length = square.length;
    }

    @Override
    public Shape clone() {
        return new Square(this); // deep copy
    }

    public int getLength() {
        return length;
    }

    public void setLength(int len) {
        this.length = len;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square with length: " + length);
    }
}


// Concrete Prototype: Rectangle
class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    // Copy Constructor
    public Rectangle(Rectangle rect) {
        super(rect.type);
        this.width = rect.width;
        this.height = rect.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this); // deep copy
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width: " + width + " and height: " + height);
    }
}


// Client code
public class PrototypeClass {
    public static void main(String[] args) {
        // Original Square
        Square originalSquare = new Square(100);
        Shape clonedSquare = originalSquare.clone();

        // Change original
        originalSquare.setLength(200);

        // Outputs
        originalSquare.draw(); // Should show 200
        clonedSquare.draw();   // Should still show 100 (deep copy)

        // Rectangle
        Rectangle originalRect = new Rectangle(50, 80);
        Shape clonedRect = originalRect.clone();

        originalRect.setSize(70, 90);

        originalRect.draw();   // 70 x 90
        clonedRect.draw();     // 50 x 80
    }
}

