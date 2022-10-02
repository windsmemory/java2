import java.util.*;
public class w1_homework1{

    public static void main(String[] args){

        Random ran = new Random();
        TreeSet<Integer> ts = new TreeSet<Integer>();
        int n = 0;
        int count = 1;
        int size = 0;
        int first = 0;
        int last = 0;
        System.out.println("電腦從1~100的整數中，亂數取出10個不重複的號碼");
        while(ts.size() < 10){            
            n = ran.nextInt(100-1+1)+1;
            ts.add(n);
            System.out.println("第"+ count +"個號碼 : " + n);
            count++;
        }
        size = ts.size();
        System.out.println("物件內元素各數為 : " + size);
        System.out.println("物件內元素的內容 : " + ts);
        System.out.println("第一個元素內容為 : " + ts.first());
        System.out.println("最後一個元素內容 : " + ts.last());
        System.out.println("內容介於30~70者 : " + ts.subSet(30, 70));
    }
}