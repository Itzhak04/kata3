package Ulpgc.Itzhak;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;

import javax.swing.*;

public class JFreeChartHistogramDisplay extends JPanel implements HistogramDisplay {
    @Override
    public void show(Histogram provider) {
        JFreeChart histogram = ChartFactory.createHistogram(
                "",
                "age",
                "",
                datasetProvider(provider),
                PlotOrientation.VERTICAL,
                false,false,false
        );
        add(new ChartPanel(histogram));
    }

    private IntervalXYDataset datasetProvider(Histogram histogram) {
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("s", histogram.values(), histogram.bins());
        return dataset;
    }
}
