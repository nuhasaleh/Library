

    public class Item {
    protected int number;
    protected double cost;
    protected String tittle;

    public Item(int number, double co, String titt) {
        this.number = number;
        this.cost = co;
        this.tittle = titt;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getnumber() {
        return number;
    }

    public double getCost() {
        return cost;
    }

    public String getTittle() {
        return tittle;
    }

    public String disply1() {
        String q = "The  number is: " + this.number + "\n The cost is: " + this.cost + "\n The tittle is: " + this.tittle;
        return q;
    }

        @Override
        public String toString() {
            return "Item{" + "number=" + number + ", cost=" + cost + ", tittle='" + tittle + '\'' + '}';
        }
    }



