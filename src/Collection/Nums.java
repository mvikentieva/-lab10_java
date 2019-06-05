package Collection;
import java.util.ArrayList;

public class Nums {
    ArrayList<Integer> nums;
    public Nums(){
        nums = new ArrayList<>();
    }
    public int size(){
        return nums.size();
    }
    public void addNum(int num){
        nums.add(num);
    }
    private int findNum(int num){
        for (int i = 0; i < nums.size(); i++){
            if (num == nums.get(i))
                return i;
        }
        return -1;
    }
    public boolean delNum(int num){
        int i = findNum(num);
        if (i != -1) {
            nums.remove(i);
            return true;
        }
        else
            return false;
    }
    public String toString(){
        if (nums.size() == 0)
            return "пусто";
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < nums.size(); i++)
            out.append(nums.get(i) + " ");
        return out.toString();
    }
    public int search(int num){
        int j = 0;
        for (int i = 1; i < nums.size(); i++){
            if (Math.abs(num - nums.get(i)) < Math.abs(num - nums.get(j)))
                j = i;
        }
        return nums.get(j);
    }
}
