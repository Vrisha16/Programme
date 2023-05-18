/*Pool Area
        The Swimming Company has asked you to write an application that calculatesthe volume of cuboid
        shaped pools.
        1. Write a class with the name Rectangle. The class needstwo fields(instance variable) with name
        width and length both of type double.
        The class needsto have one constructor with parameters width and length both of type double and it
        needs to initialize the fields.

        In case the width parameter is lessthan 0 it needs to set the width field value to 0.
        In case the length parameter islessthan 0 it needsto set the length field value to 0.
        Write the following methods (instance methods):
        ● Method named getWidth without any parameters, it needsto return the value of the width
        field.
        ● Method named getLength without any parameters, it needsto return the value ofthe length
        field.
        ● Method named getArea without any parameters, it needsto return the calculated area
        (width * length).
        2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field
        (instance variable) with name height of type double.
        The class needsto have one constructor with three parameters width, length, and height all of type
double. It needsto call the parent constructor and initialize a height field.
        In case the height parameter islessthan 0 it needsto set the height field value to 0.
        Write the following methods (instance methods):
        ● Method named getHeight without any parameters, it needsto return the value of height
        field.
        ● Method named getVolume without any parameters, it needsto return the calculated volume.
        To calculate volume, multiply the area with height.
        3. Write a class with the name Main that containsthe mainmethod.*/
        public class Rectangle {
        private double width;
        private double length;

        public Rectangle(double width, double length) {
                if ((width < 0) && (length < 0)) {
                        this.width = 0;
                        this.length = 0;
                } else if ((width < 0) && (length > 0)) {
                        this.width = 0;
                        this.length = length;
                } else if ((width > 0) && (length < 0)) {
                        this.width = width;
                        this.length = 0;
                } else {
                        this.width = width;
                        this.length = length;
                }
        }

        public double getWidth() {
                return 5;
        }

        public static double getLength() {
                return 10;
        }

        public double getArea() {
                return (width * length);
        }

        public static void main(String[] args) {

                System.out.println("Rectangle.Length=" + Rectangle. getLength());
        }


        }






