import java.util.Scanner;

public class RunQuadp2 {
    public static void main(String[] args) {
        Scanner oy = new Scanner(System.in);

        // Create instances of each class
        Square sq = new Square();
        Rectangle rec = new Rectangle();
        Parallelogram par = new Parallelogram();
        Rhombus rh = new Rhombus();
        Trapezoid tr = new Trapezoid();

        // Display menu to the user
        System.out.println("Select from the following:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");

        System.out.print("Enter your choice: ");
        String sel = oy.next(); // Read user input

        // Handle user's choice
        if (sel.equalsIgnoreCase("R")) {
            System.out.println("A Rectangle:");
            rec.showDescription();
        } else if (sel.equalsIgnoreCase("S")) {
            System.out.println("A Square:");
            sq.showDescription();
        } else if (sel.equalsIgnoreCase("P")) {
            System.out.println("A Parallelogram:");
            par.showDescription();
        } else if (sel.equalsIgnoreCase("H")) {
            System.out.println("A Rhombus:");
            rh.showDescription();
        } else if (sel.equalsIgnoreCase("T")) {
            System.out.println("A Trapezoid:");
            tr.showDescription();
        } else {
            System.out.println("Invalid selection!"); // Handle invalid input
        }

        oy.close(); // Close the scanner to avoid resource leaks
    }
}

// Base class: Quadrilateral
class Quadrilateral {
    public void showDescription() {
        System.out.println(" - is a quadrilateral");
    }
}

// Rectangle class
class Rectangle extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println(" - has 4 right angles");
        super.showDescription(); // Call parent class's method
    }
}

// Square class
class Square extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println(" - has 4 equal sides");
        super.showDescription(); // Call parent class's method
    }
}

// Parallelogram class
class Parallelogram extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println(" - has 2 pairs of parallel sides");
        super.showDescription(); // Call parent class's method
    }
}

// Rhombus class
class Rhombus extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println(" - has 4 congruent sides");
        System.out.println(" - has 2 pairs of parallel sides");
        super.showDescription(); // Call parent class's method
    }
}

// Trapezoid class
class Trapezoid extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println(" - has 1 pair of parallel sides");
        super.showDescription(); // Call parent class's method
    }
}

