package Ulpgc.Itzhak;

public class Main {
    public static void main(String[] args) {
        Mainframe mainframe = new Mainframe();
        mainframe.HistogramDisplay().show(histogram());
        mainframe.setVisible(true);
    }

    private static Histogram histogram() {
        return new Histogram() {
            @Override
            public int bins() {
                return 5;
            }

            @Override
            public double[] values() {
                return new double[]{5,4,3,6,2,9,4,1,7,8,9,6};
            }
        };
    }
}
