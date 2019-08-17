package com.dandan.pojo;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/27
 * @Desciption :
 */
public class Order {

    private String id;
    private String orderNumber;
    private String partnerOrderNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPartnerOrderNumber() {
        return partnerOrderNumber;
    }

    public void setPartnerOrderNumber(String partnerOrderNumber) {
        this.partnerOrderNumber = partnerOrderNumber;
    }

    @Override
    public String toString() {
        return "orderId=" + this.id + "---orderNumber = " + orderNumber + "---partnerOrderNumber = " + partnerOrderNumber + "\n";
    }
}
