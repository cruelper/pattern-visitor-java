public class Main {
    public static void main(String[] args) {
        Product cheese = new CheeseProduct();
        ShrimpsWithChampignonsInCheeseSauce dish = new ShrimpsWithChampignonsInCheeseSauce();

        Visitor calorieVisitor = new CalorieVisitor();
        Visitor proteinVisitor = new ProteinVisitor();
        Visitor fatVisitor = new FatVisitor();
        Visitor carbohydratesVisitor = new CarbohydratesVisitor();
        Visitor costVisitor = new CostVisitor();

        System.out.println("Сыр: ");
        System.out.println(cheese.accept(calorieVisitor));
        System.out.println(cheese.accept(proteinVisitor));
        System.out.println(cheese.accept(fatVisitor));
        System.out.println(cheese.accept(carbohydratesVisitor));
        System.out.println(cheese.accept(costVisitor));

        System.out.println("Блюдо: ");
        System.out.println(dish.accept(calorieVisitor));
        System.out.println(dish.accept(proteinVisitor));
        System.out.println(dish.accept(fatVisitor));
        System.out.println(dish.accept(carbohydratesVisitor));
        System.out.println(dish.accept(costVisitor));
    }
}
