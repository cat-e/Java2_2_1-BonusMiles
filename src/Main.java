public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int miles = service.calculate(10_000);
        System.out.println(miles);

        int milesLess = service.calculate(5_000);
        System.out.println(milesLess);

        int milesMoreThanPrice = service.calculate(20_000);
        System.out.println(milesMoreThanPrice);

        int milesMoreThanPrice2 = service.calculate(500_000);
        System.out.println(milesMoreThanPrice2);


           }
}