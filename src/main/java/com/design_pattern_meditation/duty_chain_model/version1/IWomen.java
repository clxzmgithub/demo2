package com.design_pattern_meditation.duty_chain_model.version1;

/**
 * Created by xuzhongming on 2018/3/18.
 */
public interface IWomen {
    /**
     * 获取个人状况
     *
     * @return
     */
    public int getType();

    /**
     * 获得个人请示，你要干什么，出去逛街？约会？看电影？
     *
     * @return
     */
    public String getRequest();
}
