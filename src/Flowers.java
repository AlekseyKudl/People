public class Flowers {
    private String flowerName;
    private String country;
    private double cost;
    private int lifeSpan;
    Flowers (final String flowerName,final String country, final double cost, int lifeSpan ){
        if (flowerName == null || flowerName.isBlank()) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
        if (country == null || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0 ) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    public void setFlowerName(String flowerName){
        if (flowerName == null || flowerName.isBlank()) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
    }
    public void setCountry(String country){
        if (country == null || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }
    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }
    public void setLifeSpan(int lifeSpan){
        if (lifeSpan <= 0 ) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void plant() {
        System.out.println(flowerName + ", cтрана происхождения - " + country +", " +
                "стоимость штуки - " + cost + " рублей. Срок стояния - " + lifeSpan +".");
    }

}
