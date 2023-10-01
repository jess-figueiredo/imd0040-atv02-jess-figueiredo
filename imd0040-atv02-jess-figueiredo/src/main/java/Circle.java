public class Circle {
    public  float radius=0;
    public double area=0;
    public double pi = Math.PI;
//construtor
            public  Circle(float radius){
                this.radius = radius;
                }
//getters and setters

            public float getRadius() {
                    return radius;
            }

            public void setRadius(float radius) {
                    this.radius = radius;
            }

// metodos
            public double area(){
                   area = pi *(radius*radius);
                   return area;
            }

            public double circumference(){
                    double circum = 2*pi*radius;
                    return circum;
                }


}