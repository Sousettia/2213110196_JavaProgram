import javax.swing.JOptionPane;

public class ShapeDemo3 {
    public static void main(String[] args) {

        Cylinder[] cylinder = new Cylinder[5];

        for(int i = 0 ; i < cylinder.length ; i++){
            String[] input = new String[5];
            input[i] = JOptionPane.showInputDialog(null, "Input radius and height of Cylinder (seperate by ',') " + (i+1) + " : ");
            String[] split = input[i].split(",");
            double[] radius = new double[5];
            double[] height = new double[5];
            radius[i] = Double.parseDouble(split[0]);
            height[i] = Double.parseDouble(split[1]);
            cylinder[i] = new Cylinder(radius[i], height[i]);
        }
        String output = "";
        for(int i = 0 ; i < cylinder.length ; i++){
            output += "Cylinder " + (i+1) + ", volume = " + cylinder[i].getVolume() + "\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}
