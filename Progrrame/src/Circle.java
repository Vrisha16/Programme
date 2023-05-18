/* Write a class with the name Circle. The class needs one field (instance variable) with name radius
        of type double.
        The class needsto have one constructor with parameter radius of type double and it needsto initialize
        the fields.
        In case the radius parameter islessthan 0 it needsto set the radiusfield value to 0.
        Write the following methods (instance methods):
        ● Method named getRadius without any parameters, it needsto return the value of the radius
        field.
        ● Method named getArea without any parameters, it needsto return the calculated area
        (radius * radius * PI). For PI use Math.PI constant.
        2. Write a class with the name Cylinderthat extends Circle class. The class needs one field (instance
variable) with name height of type double.
The class needsto have one constructor with two parametersradius and height both oftype double.
It needs to call the parent constructor and initialize a height field.
In case the height parameter islessthan 0 it needsto set the height field value to 0.
Write the following methods (instance methods):
● Method named getHeight without any parameters, it needsto return the value of height
field.

● Method named getVolume without any parameters, it needsto return the calculated volume.
To calculate volume, multiply the area with height.
3. Write a class with the name Main that have main method
 */
        public class Circle {
        public static int radius;

        public Circle(double radius) {
                this.radius = (int) radius;
        }
        public static double getRadius() {
                if(radius < 0){
                        radius = 0;
                        return radius;
                }else{
                        return radius;
                }
        }
        public double getArea(){
                double area = (radius * radius * Math.PI);
                return area;
        }
        public static void main(String[] args)
        {
                System.out.println("Area is " +  getRadius());
        }
}







