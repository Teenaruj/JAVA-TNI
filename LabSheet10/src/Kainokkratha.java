public class Kainokkratha extends Bakery {
    private String color;
    private int set;

    public Kainokkratha(String color, int set, String flavor, double unitPrice){
        super(flavor, unitPrice);
        this.color = color;
        this.set = set;
    }

    public String getColor(){
        return this.color;
    }

    public void changeColor(String newColor){
        this.color = newColor;
    }

    @Override
    public int getPackingCost() {
        if (this.set >= 10){
            return 0;
        }
        return super.getPackingCost();
    }

    @Override
    public double calculateTotalPrice(){
        double total = getUnitPrice() * this.set;


        if (this.set > 100) {
            total = total * 0.8;
        }

        return total + getPackingCost();
    }

    @Override
    public String toString() {
        String result = super.toString() +
                "\n" + getFlavor() + " kainokkratha (color=" + this.color + ")" +
                "\nTotal set of kainokkratha = " + this.set +
                "\nPrice before discount = " + (getUnitPrice() * this.set);

        if (this.set > 100) {
            result += "\nDiscount = 20%";
        }

        result += "\nTotal price = " + calculateTotalPrice();

        return result;
    }
}
