package com.java8;


/**
 * msku预测干预配置,即指定预测量
 *
 * @author RuiLin Zhao
 * @since 2017/10/21
 */
public class MainSkuIntervention {
    private long id; // 主键
    private String shopCode; // 门店code
    private String mainSkuCode; // main sku code
    private Double forecastQty; // 指定预测量,有可能是md上传的新品平均值(需要用单店/全店=系数),也可能就是订货量
    private Integer isAverageForecastQty; // 是否为平均预测量,0否,1是
    private Double occupyDivisionRatio; // 占用中分类分配比例
    private String skuLabel; // 干预标签：新品下品促销品
    private Integer inDivision; // 是否参与中分类分配,现在这个字段不用了
    private Integer ignoreStock; // 是否忽略库存
    private String effectStrategy; // 应用策略
    private String version; // version
    private String startDate; //促销开始时间
    private String endDate; //促销结束时间

    private Double forecastQtyFinal; // 最终计算的转换完的指定上传结果值
    private Double forecastQtyOccupyDivQty; // 最终计算的转换完的占中分类的数量
    private Double shopMulAllRatio; // 单店／全店=系数
    private Double divisionBestSkuSaleQty; // 该品所在的中分类销量最好的品的平均值

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getMainSkuCode() {
        return mainSkuCode;
    }

    public void setMainSkuCode(String mainSkuCode) {
        this.mainSkuCode = mainSkuCode;
    }

    public Double getForecastQty() {
        return forecastQty;
    }

    public void setForecastQty(Double forecastQty) {
        this.forecastQty = forecastQty;
    }

    public String getSkuLabel() {
        return skuLabel;
    }

    public void setSkuLabel(String skuLabel) {
        this.skuLabel = skuLabel;
    }

    public Integer getInDivision() {
        return inDivision;
    }

    public void setInDivision(Integer inDivision) {
        this.inDivision = inDivision;
    }

    public Integer getIgnoreStock() {
        return ignoreStock;
    }

    public void setIgnoreStock(Integer ignoreStock) {
        this.ignoreStock = ignoreStock;
    }

    public String getEffectStrategy() {
        return effectStrategy;
    }

    public void setEffectStrategy(String effectStrategy) {
        this.effectStrategy = effectStrategy;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getIsAverageForecastQty() {
        return isAverageForecastQty;
    }

    public void setIsAverageForecastQty(Integer isAverageForecastQty) {
        this.isAverageForecastQty = isAverageForecastQty;
    }

    public Double getOccupyDivisionRatio() {
        return occupyDivisionRatio;
    }

    public void setOccupyDivisionRatio(Double occupyDivisionRatio) {
        this.occupyDivisionRatio = occupyDivisionRatio;
    }

    public Double getForecastQtyFinal() {
        return forecastQtyFinal;
    }

    public void setForecastQtyFinal(Double forecastQtyFinal) {
        this.forecastQtyFinal = forecastQtyFinal;
    }

    public Double getForecastQtyOccupyDivQty() {
        return forecastQtyOccupyDivQty;
    }

    public void setForecastQtyOccupyDivQty(Double forecastQtyOccupyDivQty) {
        this.forecastQtyOccupyDivQty = forecastQtyOccupyDivQty;
    }

    public Double getShopMulAllRatio() {
        return shopMulAllRatio;
    }

    public void setShopMulAllRatio(Double shopMulAllRatio) {
        this.shopMulAllRatio = shopMulAllRatio;
    }

    public Double getDivisionBestSkuSaleQty() {
        return divisionBestSkuSaleQty;
    }

    public void setDivisionBestSkuSaleQty(Double divisionBestSkuSaleQty) {
        this.divisionBestSkuSaleQty = divisionBestSkuSaleQty;
    }
}
