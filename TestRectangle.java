public class TestRectangle {
    
        public static void main(String[] args) {
    
            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle(5, 10);
    
            System.out.println("Rectangle 1: " + r1);
            System.out.println("Rectangle 2: " + r2);
    
            System.out.println(" ");
            System.out.println("Rectangle Length");
            System.out.println("----------------");
    
            System.out.println("R1 Length: " + r1.getLength());
            System.out.println("R2 Length: " + r2.getLength());
    
     
            System.out.println(" ");
            System.out.println("Rectangle Width");
            System.out.println("---------------");
    
            System.out.println("R1 Width: " + r1.getWidth());
            System.out.println("R2 Width: " + r2.getWidth());
    
            System.out.println(" ");
            System.out.println("Rectangle Area");
            System.out.println("--------------");
    
            System.out.println("R1 Area: " + r1.getArea());
            System.out.println("R2 Area: " + r2.getArea());
    
            System.out.println(" ");
            System.out.println("Rectangle Perimeter");
            System.out.println("-------------------");
    
            System.out.println("R1 Perimeter: " + r1.getPerimeter());
            System.out.println("R2 Perimeter: " + r2.getPerimeter());
    
        }
    }
    
