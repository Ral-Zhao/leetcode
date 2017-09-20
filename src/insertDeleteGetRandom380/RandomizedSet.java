package insertDeleteGetRandom380;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zhaozhezijian on 2017/9/20.
 */
public class RandomizedSet {
    /** Initialize your data structure here. */
    private List<Integer> list = new ArrayList<>();
    public RandomizedSet() {

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(list.contains(val))
            return false;
        list.add(val);
        return true;

    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {

        if(!list.contains(val))
            return false;
        list.remove(new Integer(val));
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {

        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
