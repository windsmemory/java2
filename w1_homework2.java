import java.util.*;
public class w1_homework2{
    public static void main(String[] args){

        int month = 0;
        boolean correct = false;
        HashMap<Integer,String> Hm = new HashMap<Integer,String>();
        Scanner keyboard = new Scanner(System.in);
        Hm.put(1, "January");
        Hm.put(2, "February");
        Hm.put(3, "March");
        Hm.put(4, "April");
        Hm.put(5, "May");
        Hm.put(6, "June");
        Hm.put(7, "July");
        Hm.put(8, "August");
        Hm.put(9, "September");
        Hm.put(10, "October");
        Hm.put(11, "November");
        Hm.put(12, "December");
        System.out.print("請輸入1~12? ");
        month = keyboard.nextInt();
        while(correct == false){
            if(month < 1 || month > 12){
                System.out.println("範圍錯誤!");
                System.out.print("請輸入1~12? ");
                month = keyboard.nextInt();
            }else{
                correct = true;
            
            }
        }
        System.out.println("第" + month + "月的英文單字為"  + Hm.get(month));
    }
}