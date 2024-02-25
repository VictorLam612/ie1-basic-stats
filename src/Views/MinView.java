import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class MinView implements View {

    //Instance variables
    double min;
    JTextField jtfMedian;
    String name;

    public MinView() {
        min = 0;
        jtfMedian = new JTextField(5);
        jtfMedian.setEditable(false);
        name = "Min";
    }

    @Override
    public void update(ArrayList<Double> numbers) {
        min = MinMaxCalculation.min(BasicStats.getArrayDouble(numbers));

        //Set text
        jtfMedian.setText("" + min);

    }

    @Override
    public void reset() {
        jtfMedian.setText("");
    }

    @Override
    public JTextComponent show() {
        return jtfMedian;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getMedian() {
        return min;
    }

}
