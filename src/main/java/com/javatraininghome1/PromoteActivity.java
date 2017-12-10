package com.javatraininghome1;

import java.util.Map;

/**
 * Created by xuzhongming on 2017/7/18.
 */
public interface PromoteActivity {
     /**
      * 活动规则加载方法接口
      * @param activityId
      * @param activityRule
      */
     void loadRule(int activityId,ActivityRule activityRule);

     /**
      * 促销活动计算规则
      * @param activityId
      * @param map
      */
     void calRule(int activityId, Map map);
}

