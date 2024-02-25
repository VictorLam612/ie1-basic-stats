import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class MaxView implements View {

    //Instance variables
    double max;
    JTextField jtfMedian;
    String name;

    public MaxView() {
        max = 0;
        jtfMedian = new JTextField(5);
        jtfMedian.setEditable(false);
        name = "Max";
    }

    @Override
    public void update(ArrayList<Double> numbers) {
        max = MinMaxCalculation.max(BasicStats.getArrayDouble(numbers));

        //Set text
        jtfMedian.setText("" + max);

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
        return max;
    }

}
