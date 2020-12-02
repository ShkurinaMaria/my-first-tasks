package other;

class Person {
    private String name;
    private int profit;
    private int position;

    Person(String name, int profit, int position) {
        this.name = name;
        this.profit = profit;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getProfit() {
        return profit;
    }

    public int setProfit(int profit) {
        return this.profit = profit;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", profit=" + profit +
                ", position=" + position +
                '}';
    }
}