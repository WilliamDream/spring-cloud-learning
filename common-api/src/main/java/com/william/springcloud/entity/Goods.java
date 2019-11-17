package com.william.springcloud.entity;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/11/17 12:11
 */
public class Goods {


    private int goodsId;

    private String goodsName;

    private double price;

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
