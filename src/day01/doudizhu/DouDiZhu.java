package day01.doudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author JIAJUN KOU
 */
public class DouDiZhu {
    public static void main(String[] args) {
    /*1、准备牌
      2、洗牌
      3、发牌
      4、看牌
    */
    //1、准备牌
    // 定义一个存储54张牌的ArrayList集合，泛型使用String
    ArrayList<String> poker=new ArrayList<>();
    //定义两个数组，一个用于存储牌的花色，一个用于存储序号
    String[] colors={"♠","♥","♣","♦"};
    String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
    //把大王小王存储到poker集合中
    poker.add("king1");
    poker.add("king2");
    //循环嵌套遍历两个数组，组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                //System.out.println(color+number);
                //把组装好的牌存储到poker集合中
                poker.add(color+number);
            }
        }
        //System.out.println(poker);
        //2、洗牌
        Collections.shuffle(poker);
        //3、发牌
        //先定义四个集合 来存储玩家的牌和底牌
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        //遍历poker集合，获取每一张牌
        //将获取的牌的索引来%3 为0就给第一个玩家 为1就给第二个玩家 为2就给第三个玩家
        //大于51就给底牌
        for(int i=0;i<poker.size();i++){
            //获取每一张牌
            String p=poker.get(i);
            //来轮流发牌
            if(i>=51){
                //给底牌
                dipai.add(p);
            }else if(i%3==0){
                //给玩家1
                player01.add(p);
            }else if(i%3==1){
                //给玩家1
                player02.add(p);
            }else if(i%3==2){
                //给玩家1
                player03.add(p);
            }
        }

        //4、看牌
        System.out.println("寇"+player01);
        System.out.println("佳"+player02);
        System.out.println("军"+player03);
        System.out.println("底牌"+dipai);

    }

}
