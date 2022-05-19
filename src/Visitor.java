public interface Visitor {
    Double visit(ChampignonsProduct champignons);
    Double visit(ShrimpProduct shrimp);
    Double visit(SourCreamProduct sourCream);
    Double visit(CheeseProduct cheese);
    Double visit(SpicesProduct spices);

    Double visit(ShrimpsWithChampignonsInCheeseSauce dish);
}