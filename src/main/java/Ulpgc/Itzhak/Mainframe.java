package Ulpgc.Itzhak;

import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame {
    private HistogramDisplay histogramDisplay;

    public Mainframe() throws HeadlessException {
        this.setTitle("Histogram view");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createHistogram());
    }

    private Component createHistogram() {
        JFreeChartHistogramDisplay display = new JFreeChartHistogramDisplay();
        this.histogramDisplay=display;
        return display;
    }

    public HistogramDisplay HistogramDisplay() {
        return histogramDisplay;
    }
}
