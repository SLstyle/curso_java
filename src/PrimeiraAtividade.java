public class PrimeiraAtividade {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.println("Products:");
        System.out.printf("%s, whict price is $ %f %n", product1, price1);
        System.out.printf("%s, whict price is $ %f %n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s %n%n", age, code, gender);
        System.out.printf("measure with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded(thee decimal places): %.3f %n", measure);
        System.out.printf("US decimal point: %f", measure);

    }


}
