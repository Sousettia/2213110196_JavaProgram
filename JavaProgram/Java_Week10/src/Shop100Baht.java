import javax.swing.JOptionPane;
public class Shop100Baht {
    public static void main(String[] args) {
        Product1 sold = new Product1();

        if(JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?",
        "Run Program", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            sold = new PattanakarnBranch();
        }
        sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number of product:")));
        JOptionPane.showMessageDialog(null, sold);
    }
}
