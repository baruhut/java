package chapter6;

public class PhoneBillCalculator {

    public static void main(String args[]) {
//        PhoneBill bill = new PhoneBill(3456, 50.05, 60, 65);
        PhoneBill bill = new PhoneBill();
        bill.setMinutesUsed(300);
        bill.printItemizedBill();
    }
}