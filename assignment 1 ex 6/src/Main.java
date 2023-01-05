public class Main {
    public static void main(String[] args) {

        Student[] se2209 = new Student[4];
        se2209[0] = new Student("Nurkarim", "Kabylbay", "se2209", 4.5);
        se2209[1] = new Student("Dosya", "Zhaylau", "se2209", 4.4);
        se2209[2] = new Student("Islam", "Sharan", "se2209", 5);
        se2209[3] = new Student("Nursultan", "Akim", "se2209", 5);

        Aspirant[] se1901 = new Aspirant[4];
        se1901[0] = new Aspirant("Temirlan", "Smailov", "se1901", 4.4, true);
        se1901[1] = new Aspirant("Dias", "Maratov", "se1901", 4.6, false);
        se1901[2] = new Aspirant("Dmitri", "Kan", "se1901", 5, true);
        se1901[0] = new Aspirant("Maxim", "Musin", "se1901", 4.4, true);

        for (int i = 0; i < se2209.length; i++) {
            se2209[i].getScholarship();
        }

        for (int i = 0; i < se1901.length; i++) {
            se1901[i].getScholarship();
        }
    }
}