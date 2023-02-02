import java.util.Locale;

public class Bouquet {
    private final Flowers[] flowers;
    public Bouquet(Flowers[] flowers){
        this.flowers = flowers;
    }
    private double costOfBouquet(){
        double sum = 0;
        for (Flowers flower : flowers){
            sum +=flower.getCost();
        }
        return sum * 1.1;
    }
    public int boquetLifespan(){
        int boquetLifespan = Integer.MAX_VALUE;
        for (Flowers flower : flowers){
            if (boquetLifespan > flower.getLifeSpan()){
                boquetLifespan = flower.getLifeSpan();
            }
        }
        return boquetLifespan;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Состав букета:").append("\n");
        double cost = costOfBouquet();
        int lifespan = boquetLifespan();
        for (Flowers flower : flowers) {
            result.append(flower.getFlowerName()).append("\n");
        }
        result.append("Срок стояния букета: ").append(lifespan).append(" дн.").append("\n");
        result.append("Стоимость букета: ").append(String.format(Locale.US,"%.2f", cost)).append(" руб.");
        return result.toString();

    }
}
