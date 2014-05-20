package test.oracle.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ViewForvspNegativeDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewForvspNegativeDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTimeKeyIsNull() {
            addCriterion("TIME_KEY is null");
            return (Criteria) this;
        }

        public Criteria andTimeKeyIsNotNull() {
            addCriterion("TIME_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andTimeKeyEqualTo(Short value) {
            addCriterion("TIME_KEY =", value, "timeKey");
            return (Criteria) this;
        }

        public Criteria andTimeKeyNotEqualTo(Short value) {
            addCriterion("TIME_KEY <>", value, "timeKey");
            return (Criteria) this;
        }

        public Criteria andTimeKeyGreaterThan(Short value) {
            addCriterion("TIME_KEY >", value, "timeKey");
            return (Criteria) this;
        }

        public Criteria andTimeKeyGreaterThanOrEqualTo(Short value) {
            addCriterion("TIME_KEY >=", value, "timeKey");
            return (Criteria) this;
        }

        public Criteria andTimeKeyLessThan(Short value) {
            addCriterion("TIME_KEY <", value, "timeKey");
            return (Criteria) this;
        }

        public Criteria andTimeKeyLessThanOrEqualTo(Short value) {
            addCriterion("TIME_KEY <=", value, "timeKey");
            return (Criteria) this;
        }

        public Criteria andTimeKeyIn(List<Short> values) {
            addCriterion("TIME_KEY in", values, "timeKey");
            return (Criteria) this;
        }

        public Criteria andTimeKeyNotIn(List<Short> values) {
            addCriterion("TIME_KEY not in", values, "timeKey");
            return (Criteria) this;
        }

        public Criteria andTimeKeyBetween(Short value1, Short value2) {
            addCriterion("TIME_KEY between", value1, value2, "timeKey");
            return (Criteria) this;
        }

        public Criteria andTimeKeyNotBetween(Short value1, Short value2) {
            addCriterion("TIME_KEY not between", value1, value2, "timeKey");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNull() {
            addCriterion("DISTRICT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNotNull() {
            addCriterion("DISTRICT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameEqualTo(String value) {
            addCriterion("DISTRICT_NAME =", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotEqualTo(String value) {
            addCriterion("DISTRICT_NAME <>", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThan(String value) {
            addCriterion("DISTRICT_NAME >", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT_NAME >=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThan(String value) {
            addCriterion("DISTRICT_NAME <", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT_NAME <=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLike(String value) {
            addCriterion("DISTRICT_NAME like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotLike(String value) {
            addCriterion("DISTRICT_NAME not like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIn(List<String> values) {
            addCriterion("DISTRICT_NAME in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotIn(List<String> values) {
            addCriterion("DISTRICT_NAME not in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameBetween(String value1, String value2) {
            addCriterion("DISTRICT_NAME between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotBetween(String value1, String value2) {
            addCriterion("DISTRICT_NAME not between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("TRADE_NO is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("TRADE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("TRADE_NO =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("TRADE_NO <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("TRADE_NO >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_NO >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("TRADE_NO <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("TRADE_NO <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("TRADE_NO like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("TRADE_NO not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("TRADE_NO in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("TRADE_NO not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("TRADE_NO between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("TRADE_NO not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNull() {
            addCriterion("SP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNotNull() {
            addCriterion("SP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpNameEqualTo(String value) {
            addCriterion("SP_NAME =", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotEqualTo(String value) {
            addCriterion("SP_NAME <>", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThan(String value) {
            addCriterion("SP_NAME >", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThanOrEqualTo(String value) {
            addCriterion("SP_NAME >=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThan(String value) {
            addCriterion("SP_NAME <", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThanOrEqualTo(String value) {
            addCriterion("SP_NAME <=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLike(String value) {
            addCriterion("SP_NAME like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotLike(String value) {
            addCriterion("SP_NAME not like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameIn(List<String> values) {
            addCriterion("SP_NAME in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotIn(List<String> values) {
            addCriterion("SP_NAME not in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameBetween(String value1, String value2) {
            addCriterion("SP_NAME between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotBetween(String value1, String value2) {
            addCriterion("SP_NAME not between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCostPirceIsNull() {
            addCriterion("COST_PIRCE is null");
            return (Criteria) this;
        }

        public Criteria andCostPirceIsNotNull() {
            addCriterion("COST_PIRCE is not null");
            return (Criteria) this;
        }

        public Criteria andCostPirceEqualTo(BigDecimal value) {
            addCriterion("COST_PIRCE =", value, "costPirce");
            return (Criteria) this;
        }

        public Criteria andCostPirceNotEqualTo(BigDecimal value) {
            addCriterion("COST_PIRCE <>", value, "costPirce");
            return (Criteria) this;
        }

        public Criteria andCostPirceGreaterThan(BigDecimal value) {
            addCriterion("COST_PIRCE >", value, "costPirce");
            return (Criteria) this;
        }

        public Criteria andCostPirceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PIRCE >=", value, "costPirce");
            return (Criteria) this;
        }

        public Criteria andCostPirceLessThan(BigDecimal value) {
            addCriterion("COST_PIRCE <", value, "costPirce");
            return (Criteria) this;
        }

        public Criteria andCostPirceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PIRCE <=", value, "costPirce");
            return (Criteria) this;
        }

        public Criteria andCostPirceIn(List<BigDecimal> values) {
            addCriterion("COST_PIRCE in", values, "costPirce");
            return (Criteria) this;
        }

        public Criteria andCostPirceNotIn(List<BigDecimal> values) {
            addCriterion("COST_PIRCE not in", values, "costPirce");
            return (Criteria) this;
        }

        public Criteria andCostPirceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PIRCE between", value1, value2, "costPirce");
            return (Criteria) this;
        }

        public Criteria andCostPirceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PIRCE not between", value1, value2, "costPirce");
            return (Criteria) this;
        }

        public Criteria andGrossProfitIsNull() {
            addCriterion("GROSS_PROFIT is null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitIsNotNull() {
            addCriterion("GROSS_PROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitEqualTo(Short value) {
            addCriterion("GROSS_PROFIT =", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitNotEqualTo(Short value) {
            addCriterion("GROSS_PROFIT <>", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitGreaterThan(Short value) {
            addCriterion("GROSS_PROFIT >", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitGreaterThanOrEqualTo(Short value) {
            addCriterion("GROSS_PROFIT >=", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitLessThan(Short value) {
            addCriterion("GROSS_PROFIT <", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitLessThanOrEqualTo(Short value) {
            addCriterion("GROSS_PROFIT <=", value, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitIn(List<Short> values) {
            addCriterion("GROSS_PROFIT in", values, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitNotIn(List<Short> values) {
            addCriterion("GROSS_PROFIT not in", values, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitBetween(Short value1, Short value2) {
            addCriterion("GROSS_PROFIT between", value1, value2, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andGrossProfitNotBetween(Short value1, Short value2) {
            addCriterion("GROSS_PROFIT not between", value1, value2, "grossProfit");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andSaleIsNull() {
            addCriterion("SALE is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsNotNull() {
            addCriterion("SALE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEqualTo(Short value) {
            addCriterion("SALE =", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotEqualTo(Short value) {
            addCriterion("SALE <>", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThan(Short value) {
            addCriterion("SALE >", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThanOrEqualTo(Short value) {
            addCriterion("SALE >=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThan(Short value) {
            addCriterion("SALE <", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThanOrEqualTo(Short value) {
            addCriterion("SALE <=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleIn(List<Short> values) {
            addCriterion("SALE in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotIn(List<Short> values) {
            addCriterion("SALE not in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleBetween(Short value1, Short value2) {
            addCriterion("SALE between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotBetween(Short value1, Short value2) {
            addCriterion("SALE not between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andPayedIsNull() {
            addCriterion("PAYED is null");
            return (Criteria) this;
        }

        public Criteria andPayedIsNotNull() {
            addCriterion("PAYED is not null");
            return (Criteria) this;
        }

        public Criteria andPayedEqualTo(Short value) {
            addCriterion("PAYED =", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedNotEqualTo(Short value) {
            addCriterion("PAYED <>", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedGreaterThan(Short value) {
            addCriterion("PAYED >", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYED >=", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedLessThan(Short value) {
            addCriterion("PAYED <", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedLessThanOrEqualTo(Short value) {
            addCriterion("PAYED <=", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedIn(List<Short> values) {
            addCriterion("PAYED in", values, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedNotIn(List<Short> values) {
            addCriterion("PAYED not in", values, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedBetween(Short value1, Short value2) {
            addCriterion("PAYED between", value1, value2, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedNotBetween(Short value1, Short value2) {
            addCriterion("PAYED not between", value1, value2, "payed");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Short value) {
            addCriterion("DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Short value) {
            addCriterion("DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Short value) {
            addCriterion("DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Short value) {
            addCriterion("DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Short value) {
            addCriterion("DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Short value) {
            addCriterion("DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Short> values) {
            addCriterion("DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Short> values) {
            addCriterion("DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Short value1, Short value2) {
            addCriterion("DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Short value1, Short value2) {
            addCriterion("DISCOUNT not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andEpursePayedIsNull() {
            addCriterion("EPURSE_PAYED is null");
            return (Criteria) this;
        }

        public Criteria andEpursePayedIsNotNull() {
            addCriterion("EPURSE_PAYED is not null");
            return (Criteria) this;
        }

        public Criteria andEpursePayedEqualTo(BigDecimal value) {
            addCriterion("EPURSE_PAYED =", value, "epursePayed");
            return (Criteria) this;
        }

        public Criteria andEpursePayedNotEqualTo(BigDecimal value) {
            addCriterion("EPURSE_PAYED <>", value, "epursePayed");
            return (Criteria) this;
        }

        public Criteria andEpursePayedGreaterThan(BigDecimal value) {
            addCriterion("EPURSE_PAYED >", value, "epursePayed");
            return (Criteria) this;
        }

        public Criteria andEpursePayedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EPURSE_PAYED >=", value, "epursePayed");
            return (Criteria) this;
        }

        public Criteria andEpursePayedLessThan(BigDecimal value) {
            addCriterion("EPURSE_PAYED <", value, "epursePayed");
            return (Criteria) this;
        }

        public Criteria andEpursePayedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EPURSE_PAYED <=", value, "epursePayed");
            return (Criteria) this;
        }

        public Criteria andEpursePayedIn(List<BigDecimal> values) {
            addCriterion("EPURSE_PAYED in", values, "epursePayed");
            return (Criteria) this;
        }

        public Criteria andEpursePayedNotIn(List<BigDecimal> values) {
            addCriterion("EPURSE_PAYED not in", values, "epursePayed");
            return (Criteria) this;
        }

        public Criteria andEpursePayedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EPURSE_PAYED between", value1, value2, "epursePayed");
            return (Criteria) this;
        }

        public Criteria andEpursePayedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EPURSE_PAYED not between", value1, value2, "epursePayed");
            return (Criteria) this;
        }

        public Criteria andCostSalesIsNull() {
            addCriterion("COST_SALES is null");
            return (Criteria) this;
        }

        public Criteria andCostSalesIsNotNull() {
            addCriterion("COST_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andCostSalesEqualTo(Short value) {
            addCriterion("COST_SALES =", value, "costSales");
            return (Criteria) this;
        }

        public Criteria andCostSalesNotEqualTo(Short value) {
            addCriterion("COST_SALES <>", value, "costSales");
            return (Criteria) this;
        }

        public Criteria andCostSalesGreaterThan(Short value) {
            addCriterion("COST_SALES >", value, "costSales");
            return (Criteria) this;
        }

        public Criteria andCostSalesGreaterThanOrEqualTo(Short value) {
            addCriterion("COST_SALES >=", value, "costSales");
            return (Criteria) this;
        }

        public Criteria andCostSalesLessThan(Short value) {
            addCriterion("COST_SALES <", value, "costSales");
            return (Criteria) this;
        }

        public Criteria andCostSalesLessThanOrEqualTo(Short value) {
            addCriterion("COST_SALES <=", value, "costSales");
            return (Criteria) this;
        }

        public Criteria andCostSalesIn(List<Short> values) {
            addCriterion("COST_SALES in", values, "costSales");
            return (Criteria) this;
        }

        public Criteria andCostSalesNotIn(List<Short> values) {
            addCriterion("COST_SALES not in", values, "costSales");
            return (Criteria) this;
        }

        public Criteria andCostSalesBetween(Short value1, Short value2) {
            addCriterion("COST_SALES between", value1, value2, "costSales");
            return (Criteria) this;
        }

        public Criteria andCostSalesNotBetween(Short value1, Short value2) {
            addCriterion("COST_SALES not between", value1, value2, "costSales");
            return (Criteria) this;
        }

        public Criteria andGrossSalesIsNull() {
            addCriterion("GROSS_SALES is null");
            return (Criteria) this;
        }

        public Criteria andGrossSalesIsNotNull() {
            addCriterion("GROSS_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andGrossSalesEqualTo(Short value) {
            addCriterion("GROSS_SALES =", value, "grossSales");
            return (Criteria) this;
        }

        public Criteria andGrossSalesNotEqualTo(Short value) {
            addCriterion("GROSS_SALES <>", value, "grossSales");
            return (Criteria) this;
        }

        public Criteria andGrossSalesGreaterThan(Short value) {
            addCriterion("GROSS_SALES >", value, "grossSales");
            return (Criteria) this;
        }

        public Criteria andGrossSalesGreaterThanOrEqualTo(Short value) {
            addCriterion("GROSS_SALES >=", value, "grossSales");
            return (Criteria) this;
        }

        public Criteria andGrossSalesLessThan(Short value) {
            addCriterion("GROSS_SALES <", value, "grossSales");
            return (Criteria) this;
        }

        public Criteria andGrossSalesLessThanOrEqualTo(Short value) {
            addCriterion("GROSS_SALES <=", value, "grossSales");
            return (Criteria) this;
        }

        public Criteria andGrossSalesIn(List<Short> values) {
            addCriterion("GROSS_SALES in", values, "grossSales");
            return (Criteria) this;
        }

        public Criteria andGrossSalesNotIn(List<Short> values) {
            addCriterion("GROSS_SALES not in", values, "grossSales");
            return (Criteria) this;
        }

        public Criteria andGrossSalesBetween(Short value1, Short value2) {
            addCriterion("GROSS_SALES between", value1, value2, "grossSales");
            return (Criteria) this;
        }

        public Criteria andGrossSalesNotBetween(Short value1, Short value2) {
            addCriterion("GROSS_SALES not between", value1, value2, "grossSales");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}