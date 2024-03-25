public class Sum05 {
    double[] keuntungan;

    Sum05(double[] keuntungan) {
        this.keuntungan = keuntungan;
    }

    double getTotal() {
        double total = 0;
        for (double profit : keuntungan) {
            total += profit;
        }
        return total;
    }
}
