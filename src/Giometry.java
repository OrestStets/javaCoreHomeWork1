public class Giometry {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Cyrkle cyrkle = new Cyrkle();

        int a = 10;
        int b = 20;
        int i = 30;
        int j = 40;


        rectangle.setLength(10);
        rectangle.setSize(20);

        cyrkle.setRadius(20);
        cyrkle.setDiameter(30);

        int radius = cyrkle.getRadius();
        int diameter = cyrkle.getDiameter();

        System.out.println("Площа кола " + radius);
        System.out.println("ширина кола " + diameter);


        int legnth = rectangle.getLength();
        int size = rectangle.getSize();

        System.out.println("Довжина прямокутника " + legnth);
        System.out.println("Ширина прямокутника " + size);


        rozrahynokParametriv(a, b);
        rozrahynokPloshi(i,j);
        rozrahynokRadiusu(i);

    }

    public static void rozrahynokParametriv(int a, int b) {
        int c = a^2*b^2;
        System.out.println("Площа прямокутника " + c);
    }

    public static void rozrahynokPloshi (int i, int j){
        int p = (int) (i*3.14*j);
        System.out.println("Площа кола дорівнює " + p);
    }
    public static void rozrahynokRadiusu(int i){
        int r = (int) (i/2*3.14);
        System.out.println("Радіус кола = " + r + "см");
    }

}
