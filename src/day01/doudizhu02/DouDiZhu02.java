package day01.doudizhu02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * @author JIAJUN KOU
 */
//斗地主综合案例
    //这里会将手中的牌按顺序的排列出来。
    /*1、准备牌
      2、洗牌
      3、发牌
      4、排序
      5、看牌
     */
public class DouDiZhu02 {
    public static void main(String[] args) {
        //1、准备牌
        // 定义一个存储54张牌的Map集合，
        HashMap<Integer,String> poker=new HashMap<>();
        //创建一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex=new ArrayList<>();
        //定义两个数组，一个用于存储牌的花色，一个用于存储序号
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //把大王小王存储到poker集合中
        //定义一个索引
        int index=0;
        poker.put(index,"king1");
        poker.put(index++,"king2");
        pokerIndex.add(index);
        //循环嵌套遍历两个数组，组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                //System.out.println(color+number);
                //把组装好的牌存储到poker集合中
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        //2、开始洗牌；使用Collections里边的shuffle（）方法 打乱。
        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);

        //3、发牌
        //定义4个集合，存储玩家的索引；和底牌的索引。
        ArrayList<Integer> player01=new ArrayList<>();
        ArrayList<Integer> player02=new ArrayList<>();
        ArrayList<Integer> player03=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();
        //遍历存储索引的集合，获取每一张牌
        //将获取的牌的索引来%3 为0就给第一个玩家 为1就给第二个玩家 为2就给第三个玩家
        //大于51就给底牌
        for(int i=0;i<pokerIndex.size();i++){
            //获取每一张牌
            Integer in=pokerIndex.get(i);
            //来轮流发牌
            if(i>=51){
                //给底牌
                dipai.add(in);
            }else if(i%3==0){
                //给玩家1
                player01.add(in);
            }else if(i%3==1){
                //给玩家1
                player02.add(in);
            }else if(i%3==2){
                //给玩家1
                player03.add(in);
            }
        }
        //给发的牌排序 用collections里面的 sort方法排序。
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);
        //5、看牌
        lookPoker("kou",poker,player01);
        lookPoker("jia",poker,player02);
        lookPoker("jun",poker,player03);
        lookPoker("dip",poker,dipai);
    }

    //看牌;定义一个看牌方法
    // 用查表法 遍历玩家的list集合，获取到map的key。
    //其中三个参数，玩家名，牌的集合，存储玩家或底牌的list集合。
    public static void lookPoker(String name,HashMap<Integer,String> poker,
                                 ArrayList<Integer> list){
        //输出玩家名称
        System.out.print(name+": ");
        //遍历玩家集合获取牌的索引
        for (Integer key:list){
            //使用牌的索引，去Map集合获取value
            String value=poker.get(key);
            System.out.print(value+": ");
        }
        System.out.println();//打印好每一个玩家的牌 再换行。

    }
}
