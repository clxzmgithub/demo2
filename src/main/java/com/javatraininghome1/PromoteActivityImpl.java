package com.javatraininghome1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuzhongming on 2017/7/18.
 */
public class PromoteActivityImpl implements PromoteActivity {

    private HashMap<Integer, ActivityRule> hashMap = new HashMap();

    /**
     *
     * @param activityId
     * @param activityRule
     */

    public void loadRule(int activityId, ActivityRule activityRule) {
        hashMap.put(activityId, activityRule);
    }

    /**
     *
     * @param activityId
     * @param map
     */

    public void calRule(int activityId, Map map) {
        ActivityRule activityRule=hashMap.get(activityId);
        
    }
}
