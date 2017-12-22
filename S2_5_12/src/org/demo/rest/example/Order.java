package org.demo.rest.example;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Order {
    String id;
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.WRAPPER_ARRAY)
    Object clientName;
    int amount;
    
    public Order() {}
    
    public Order(String id, Object clientName, int amount) {
        super();
        this.id = id;
        this.clientName = clientName;
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Object getClientName() {
        return clientName;
    }
    public void setClientName(Object clientName) {
        this.clientName = clientName;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Order rhs = (Order) obj;
        return new EqualsBuilder()
                .append(this.id, rhs.id)
                .append(this.clientName, rhs.clientName)
                .append(this.amount, rhs.amount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(id)
                .append(clientName)
                .append(amount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("clientName", clientName)
                .append("amount", amount)
                .toString();
    }
}
