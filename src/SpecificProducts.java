class ChampignonsProduct extends Product{
    ChampignonsProduct(){
        this.calorie = 27.;
        this.protein = 4.4;
        this.fat = 1.;
        this.carbohydrates = 0.2;
        this.cost = 20.;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

class ShrimpProduct extends Product{
    ShrimpProduct(){
        this.calorie = 83.;
        this.protein = 18.;
        this.fat = 1.;
        this.carbohydrates = 0.;
        this.cost = 50.;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

class SourCreamProduct extends Product{
    SourCreamProduct(){
        this.calorie = 120.;
        this.protein = 3.3;
        this.fat = 10.;
        this.carbohydrates = 3.3;
        this.cost = 14.4;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

class CheeseProduct extends Product{
    CheeseProduct(){
        this.calorie = 345.;
        this.protein = 25.;
        this.fat = 25.;
        this.carbohydrates = 0.;
        this.cost = 70.;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

class SpicesProduct extends Product{
    SpicesProduct(){
        this.calorie = 37.;
        this.protein = 3.3;
        this.fat = 0.;
        this.carbohydrates = 7.;
        this.cost = 20.;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
