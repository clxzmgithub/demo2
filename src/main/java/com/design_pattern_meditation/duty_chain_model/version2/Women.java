package com.design_pattern_meditation.duty_chain_model.version2;

import com.design_pattern_meditation.duty_chain_model.version1.IWomen;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Women implements IWomen {

    /**
     * 1:未出嫁,2:出嫁,3:夫死
     */
    private int type = 0;

    /**
     * 妇女的请求
     */
    private String request = "";


    /**
     * @return
     */
    public Women(int _type, String _request) {
        this.type = _type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请示是:" + _request;
                break;
            case 2:
                this.request = "妻子的请示是:" + _request;
                break;
            case 3:
                this.request = "母亲的请示是:" + _request;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
