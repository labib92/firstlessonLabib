/**
 * Created by labib's pc on 2/26/2017.
 */
public class HW {
    public static void main(String[] args) {
        HW obj = new HW();
        System.out.println(obj.sqrt(100));
        System.out.println(obj.sqrt(81));
    }

    public int sqrt(double number){
        return (int)Math.sqrt(number);
    }

    public int sum(int i, int j) {
        return i+j;
    }
}
