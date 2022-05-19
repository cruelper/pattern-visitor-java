import java.util.HashMap;
import java.util.Map;

public class ShrimpsWithChampignonsInCheeseSauce implements Element{
    Map<Element, Double> composition;

    ShrimpsWithChampignonsInCheeseSauce(){
        this.composition = new HashMap<>();
        this.composition.put(new ChampignonsProduct(), 500.);
        this.composition.put(new ShrimpProduct(), 100.);
        this.composition.put(new SourCreamProduct(), 30.);
        this.composition.put(new CheeseProduct(), 20.);
        this.composition.put(new SpicesProduct(), 30.);
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
