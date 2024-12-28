import java.util.ArrayList;
public class dice{
    public static void main(String[] args){
        dice obj = new dice();
        System.out.println(obj.Dice("",5));

    }

    public ArrayList<String> Dice(String p ,int target){ 
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1;i <= 6 && i <= target; i++){
            list.addAll(Dice(p+i,target-i));
        }
        return list;
    }
}