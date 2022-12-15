import javax.swing.JOptionPane;

public class Lab606 
{
    public static void main(String[] args) 
    {
        int inputIndex;
        int[] nums = {25, 78, 41, 22, 36, 85, 37};
        do inputIndex = Integer.parseInt(JOptionPane.showInputDialog("Input Index of array : "));
        while(!checkIndex(nums,inputIndex));
        JOptionPane.showMessageDialog(null,"Current data,nums["+inputIndex+"] is "+currentData(nums,inputIndex)+
                                                            ((prevData(nums,inputIndex)==0)?"\nNo previous data":"\nPrevious data,nums["+(inputIndex-1)+"] is "+prevData(nums,inputIndex))+
                                                            ((nextData(nums,inputIndex)==0)?"\nNo next data"    :"\nNext data,nums["+(inputIndex+1)+"] is "+nextData(nums,inputIndex)));
                                                            //"\nNext data,nums["+(inputIndex+1)+"] is "+nextData(nums,inputIndex));
                                                            //((prevData(nums,inputIndex)==0)?"\nNo previous data":"\nPrevious data,nums["+(inputIndex-1)+"] is "+prevData(nums,inputIndex))
    }
    public static boolean checkIndex(int[] nums,int index) 
    {
        return (index < 0 || index > nums.length - 1)?false:true;
    }
    public static int currentData(int[] nums,int index) 
    {
        return nums[index];
    }
    public static int prevData(int[] nums,int index) 
    {
        return (index - 1 < 0)? 0 : nums[index-1];
    }
    public static int nextData(int[] nums,int index) 
    {
        return (index + 1 > nums.length-1)?0:nums[index+1];
    }
}
