package insertDeleteGetRandom380;

/**
 * Created by zhaozhezijian on 2017/9/20.
 */
public class Test {
    public static void main(String[] args) {

        RandomizedSet set = new RandomizedSet();
        set.insert(1);
        set.remove(1);
        set.insert(2);
        set.getRandom();
        set.remove(2);
        set.insert(3);
        System.out.println(set.getRandom());
    }
}
