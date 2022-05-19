class CalorieVisitor implements Visitor{
    @Override
    public Double visit(ChampignonsProduct champignons) {
        return champignons.calorie;
    }
    @Override
    public Double visit(ShrimpProduct shrimp) {
        return shrimp.calorie;
    }
    @Override
    public Double visit(SourCreamProduct sourCream) {
        return sourCream.calorie;
    }
    @Override
    public Double visit(CheeseProduct cheese) {
        return cheese.calorie;
    }
    @Override
    public Double visit(SpicesProduct spices) {
        return spices.calorie;
    }
    @Override
    public Double visit(ShrimpsWithChampignonsInCheeseSauce dish) {
        Double totalCalorie = 0.;
        for(Element product : dish.composition.keySet()){
            Double calorie = product.accept(new CalorieVisitor());
            totalCalorie += dish.composition.get(product) / 100 * calorie;
        }
        return totalCalorie;
    }
}

class ProteinVisitor implements Visitor{
    @Override
    public Double visit(ChampignonsProduct champignons) {
        return champignons.protein;
    }
    @Override
    public Double visit(ShrimpProduct shrimp) {
        return shrimp.protein;
    }
    @Override
    public Double visit(SourCreamProduct sourCream) {
        return sourCream.protein;
    }
    @Override
    public Double visit(CheeseProduct cheese) {
        return cheese.protein;
    }
    @Override
    public Double visit(SpicesProduct spices) {
        return spices.protein;
    }
    @Override
    public Double visit(ShrimpsWithChampignonsInCheeseSauce dish) {
        Double totalProtein = 0.;
        for(Element product : dish.composition.keySet()){
            Double protein = product.accept(new ProteinVisitor());
            totalProtein += dish.composition.get(product) / 100 * protein;
        }
        return totalProtein;
    }
}

class FatVisitor implements Visitor{
    @Override
    public Double visit(ChampignonsProduct champignons) {
        return champignons.fat;
    }
    @Override
    public Double visit(ShrimpProduct shrimp) {
        return shrimp.fat;
    }
    @Override
    public Double visit(SourCreamProduct sourCream) {
        return sourCream.fat;
    }
    @Override
    public Double visit(CheeseProduct cheese) {
        return cheese.fat;
    }
    @Override
    public Double visit(SpicesProduct spices) {
        return spices.fat;
    }
    @Override
    public Double visit(ShrimpsWithChampignonsInCheeseSauce dish) {
        Double totalFat = 0.;
        for(Element product : dish.composition.keySet()){
            Double fat = product.accept(new FatVisitor());
            totalFat += dish.composition.get(product) / 100 * fat;
        }
        return totalFat;
    }
}

class CarbohydratesVisitor implements Visitor{
    @Override
    public Double visit(ChampignonsProduct champignons) {
        return champignons.carbohydrates;
    }
    @Override
    public Double visit(ShrimpProduct shrimp) {
        return shrimp.carbohydrates;
    }
    @Override
    public Double visit(SourCreamProduct sourCream) {
        return sourCream.carbohydrates;
    }
    @Override
    public Double visit(CheeseProduct cheese) {
        return cheese.carbohydrates;
    }
    @Override
    public Double visit(SpicesProduct spices) {
        return spices.carbohydrates;
    }
    @Override
    public Double visit(ShrimpsWithChampignonsInCheeseSauce dish) {
        Double totalCarbohydrates = 0.;
        for(Element product : dish.composition.keySet()){
            Double carbohydrates = product.accept(new CarbohydratesVisitor());
            totalCarbohydrates += dish.composition.get(product) / 100 * carbohydrates;
        }
        return totalCarbohydrates;
    }
}

class CostVisitor implements Visitor{
    @Override
    public Double visit(ChampignonsProduct champignons) {
        return champignons.cost;
    }
    @Override
    public Double visit(ShrimpProduct shrimp) {
        return shrimp.cost;
    }
    @Override
    public Double visit(SourCreamProduct sourCream) {
        return sourCream.cost;
    }
    @Override
    public Double visit(CheeseProduct cheese) {
        return cheese.cost;
    }
    @Override
    public Double visit(SpicesProduct spices) {
        return spices.cost;
    }
    @Override
    public Double visit(ShrimpsWithChampignonsInCheeseSauce dish) {
        Double totalCost = 0.;
        for(Element product : dish.composition.keySet()){
            Double cost = product.accept(new CostVisitor());
            totalCost += dish.composition.get(product) / 100 * cost;
        }
        return totalCost;
    }
}