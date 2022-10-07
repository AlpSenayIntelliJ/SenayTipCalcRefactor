public class TipCalc {
    // instance variables
    private int numPeople;
    private double tipDecimal;
    private double totalBillBeforeTip;

    // constructor
    public TipCalc(int numPeople, double tipDecimal) {
        this.numPeople = numPeople;
        this.tipDecimal = tipDecimal;
        this.totalBillBeforeTip = 0.0;
    }

    // methods

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipDecimal() {
        return tipDecimal;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return totalBillBeforeTip*tipDecimal;
    }

    public double totalBill() {
        return totalBillBeforeTip+tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip/numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount()/numPeople;
    }

    public double perPersonTotalCost() {
        return totalBill()/numPeople;
    }
}
