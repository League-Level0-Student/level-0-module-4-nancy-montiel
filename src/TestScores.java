import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
String test=	JOptionPane.showInputDialog("What is your test score?");
double d =Double.parseDouble(test);
if (d>90.0) {
	JOptionPane.showMessageDialog(null, "Good job.");
}
if (d<90.0) {
	JOptionPane.showMessageDialog(null, "Work harder.");
}
}
}
