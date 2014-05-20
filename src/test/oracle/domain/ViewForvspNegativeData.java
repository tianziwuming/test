package test.oracle.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class ViewForvspNegativeData implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5676100079254943658L;

	private Short timeKey;

    private String districtName;

    private String cityName;

    private String tradeNo;

    private Long goodsId;

    private String title;

    private String spName;

    private BigDecimal price;

    private BigDecimal costPirce;

    private Short grossProfit;

    private Long amount;

    private Short sale;

    private Short payed;

    private Short discount;

    private BigDecimal epursePayed;

    private Short costSales;

    private Short grossSales;


    public Short getTimeKey() {
        return timeKey;
    }

    public void setTimeKey(Short timeKey) {
        this.timeKey = timeKey;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCostPirce() {
        return costPirce;
    }

    public void setCostPirce(BigDecimal costPirce) {
        this.costPirce = costPirce;
    }

    public Short getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(Short grossProfit) {
        this.grossProfit = grossProfit;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Short getSale() {
        return sale;
    }

    public void setSale(Short sale) {
        this.sale = sale;
    }

    public Short getPayed() {
        return payed;
    }

    public void setPayed(Short payed) {
        this.payed = payed;
    }

    public Short getDiscount() {
        return discount;
    }

    public void setDiscount(Short discount) {
        this.discount = discount;
    }

    public BigDecimal getEpursePayed() {
        return epursePayed;
    }

    public void setEpursePayed(BigDecimal epursePayed) {
        this.epursePayed = epursePayed;
    }

    public Short getCostSales() {
        return costSales;
    }

    public void setCostSales(Short costSales) {
        this.costSales = costSales;
    }

    public Short getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(Short grossSales) {
        this.grossSales = grossSales;
    }
}