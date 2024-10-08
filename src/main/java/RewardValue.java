public class RewardValue {
    private double cashValue;
    private int mileValue;
    RewardValue() { this(0); }
    RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.mileValue = (int)(cashValue/0.0035);
    }
    RewardValue(int mileValue) {
        this.mileValue = mileValue;
        this.cashValue = mileValue*0.0035;
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return mileValue;
    }
}
