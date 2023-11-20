import java.util.Scanner;

public class RectangleArea {
    double length = -1;
    double width = -1;
    double area = -1;
     public RectangleArea(){
         getData();
         computerField();
         displayField();
     }

    private void displayField() {
        if(area != -1) {
            System.out.println("Length : " + length);
            System.out.println("Width : " + width);
            System.out.println("Area : " + area);
        }else{
            System.out.println("Error : No Data !");
        }
    }

    private void computerField() {
        if(length == -1 || width == -1){
            System.out.println("Error : No data, area is not computed!");
        }else {
            area = length * width;
            System.out.println("Computed the area");
        }
    }

    private void getData() {
        Scanner s = new Scanner(System.in);
        double tempL= -1;
        double tempW= -1;
        while(tempL < 0) {
            System.out.println("Please enter the length: ");
            while(!s.hasNextDouble()) {
                System.out.println("Please enter the length again: ");
                s.next();
            }
            tempL = s.nextDouble();
        }
        while(tempW < 0) {
            System.out.println("Please enter the width: ");
            while(!s.hasNextDouble()) {
                System.out.println("Please enter the width again: ");
                s.next();
            }
            tempW = s.nextDouble();
        }
        length = tempL;
        width = tempW;
    }
}
