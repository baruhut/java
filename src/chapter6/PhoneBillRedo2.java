package chapter6;

public class PhoneBillRedo2 {

    //private field
    private int id;
    private double baseCost;
    private int allottedMinute;
    private int minuteUsed;

    //constructor
    public PhoneBillRedo2() {
        id = 0;
        baseCost = 10;
        allottedMinute = 60;
        minuteUsed = 60;
    }

    public PhoneBillRedo2(int id) {
        this.id = id;
        baseCost = 100;
        allottedMinute = 600;
        minuteUsed = 600;
    }

    public PhoneBillRedo2(int id, double baseCost, int allottedMinute, int minuteUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinute = allottedMinute;
        this.minuteUsed = minuteUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinute() {
        return allottedMinute;
    }

    public void setAllottedMinute(int allottedMinute) {
        this.allottedMinute = allottedMinute;
    }

    public int getMinuteUsed() {
        return minuteUsed;
    }

    public void setMinuteUsed(int minuteUsed) {
        this.minuteUsed = minuteUsed;
    }

    //calculate overage, tax, total
    public double countOverageMinuteCharge() {
        if (minuteUsed <= allottedMinute) {
            return 0;
        }
        double overageCharge = 0.25;
        int userMinuteUsed = minuteUsed - allottedMinute;
        return overageCharge * userMinuteUsed;
    }

    public double countTaxCharge() {
        double taxRate = 0.15;
        return (baseCost + countOverageMinuteCharge()) * taxRate;
    }

    public double countTotalCharge() {
        return (baseCost + countOverageMinuteCharge() + countTaxCharge());
    }

    //print bill
    public void printBill() {
        System.out.println("Phone Bill Statement");
        System.out.println("ID " + id);
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + countOverageMinuteCharge());
        System.out.println("Tax: $" + countTaxCharge());
        System.out.println("Total: $" + countTotalCharge());
    }
}
