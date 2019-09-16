/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author C-Lo 12
 */
@Entity
@Table(name = "PURCHASE_ORDER", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "PurchaseOrder.findAll", query = "SELECT p FROM PurchaseOrder p")
    , @NamedQuery(name = "PurchaseOrder.findByOrderNum", query = "SELECT p FROM PurchaseOrder p WHERE p.orderNum = :orderNum")
    , @NamedQuery(name = "PurchaseOrder.findByProductId", query = "SELECT p FROM PurchaseOrder p WHERE p.productId = :productId")
    , @NamedQuery(name = "PurchaseOrder.findByQuantity", query = "SELECT p FROM PurchaseOrder p WHERE p.quantity = :quantity")
    , @NamedQuery(name = "PurchaseOrder.findByShippingCost", query = "SELECT p FROM PurchaseOrder p WHERE p.shippingCost = :shippingCost")
    , @NamedQuery(name = "PurchaseOrder.findBySalesDate", query = "SELECT p FROM PurchaseOrder p WHERE p.salesDate = :salesDate")
    , @NamedQuery(name = "PurchaseOrder.findByShippingDate", query = "SELECT p FROM PurchaseOrder p WHERE p.shippingDate = :shippingDate")
    , @NamedQuery(name = "PurchaseOrder.findByFreightCompany", query = "SELECT p FROM PurchaseOrder p WHERE p.freightCompany = :freightCompany")})
public class PurchaseOrder implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_NUM")
    private Integer orderNum;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private int productId;
    @Column(name = "QUANTITY")
    private Short quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SHIPPING_COST")
    private BigDecimal shippingCost;
    @Column(name = "SALES_DATE")
    @Temporal(TemporalType.DATE)
    private Date salesDate;
    @Column(name = "SHIPPING_DATE")
    @Temporal(TemporalType.DATE)
    private Date shippingDate;
    @Column(name = "FREIGHT_COMPANY")
    private String freightCompany;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    @ManyToOne(optional = false)
    private Customer customerId;

    public PurchaseOrder() {
    }

    public PurchaseOrder(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public PurchaseOrder(Integer orderNum, int productId) {
        this.orderNum = orderNum;
        this.productId = productId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        Integer oldOrderNum = this.orderNum;
        this.orderNum = orderNum;
        changeSupport.firePropertyChange("orderNum", oldOrderNum, orderNum);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        int oldProductId = this.productId;
        this.productId = productId;
        changeSupport.firePropertyChange("productId", oldProductId, productId);
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        Short oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public BigDecimal getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(BigDecimal shippingCost) {
        BigDecimal oldShippingCost = this.shippingCost;
        this.shippingCost = shippingCost;
        changeSupport.firePropertyChange("shippingCost", oldShippingCost, shippingCost);
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        Date oldSalesDate = this.salesDate;
        this.salesDate = salesDate;
        changeSupport.firePropertyChange("salesDate", oldSalesDate, salesDate);
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        Date oldShippingDate = this.shippingDate;
        this.shippingDate = shippingDate;
        changeSupport.firePropertyChange("shippingDate", oldShippingDate, shippingDate);
    }

    public String getFreightCompany() {
        return freightCompany;
    }

    public void setFreightCompany(String freightCompany) {
        String oldFreightCompany = this.freightCompany;
        this.freightCompany = freightCompany;
        changeSupport.firePropertyChange("freightCompany", oldFreightCompany, freightCompany);
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        Customer oldCustomerId = this.customerId;
        this.customerId = customerId;
        changeSupport.firePropertyChange("customerId", oldCustomerId, customerId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderNum != null ? orderNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseOrder)) {
            return false;
        }
        PurchaseOrder other = (PurchaseOrder) object;
        if ((this.orderNum == null && other.orderNum != null) || (this.orderNum != null && !this.orderNum.equals(other.orderNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "frames.PurchaseOrder[ orderNum=" + orderNum + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
