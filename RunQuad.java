import java.util.Scanner;

public class RunQuad {
    public static void main(String[] args) {
        Scanner ey = new Scanner(System.in); // Fixed spacing and syntax
        Square sq = new Square();
        Rectangle rec = new Rectangle();

        System.out.print("Press R for Rectangle or S for Square: ");
        String sel = ey.next(); // Read user input

        if (sel.equalsIgnoreCase("R")) {
            System.out.println("A rectangle:");
            rec.showDescription(); // Call the Rectangle's description
        } else if (sel.equalsIgnoreCase("S")) { // Changed to else-if for clarity
            System.out.println("A square:");
            sq.showDescription(); // Call the Square's description
        } else {
            System.out.println("Invalid selection."); // Handle invalid input
        }
    }
}

class Quadrilateral {
    public void showDescription() {
        System.out.println(" - is a quadrilateral");
    }
}

class Rectangle extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println(" - has 4 right angles");
        super.showDescription(); // Call parent class's method
    }
}

class Square extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println(" - has 4 equal sides");
        super.showDescription(); // Call parent class's method
    }
}
