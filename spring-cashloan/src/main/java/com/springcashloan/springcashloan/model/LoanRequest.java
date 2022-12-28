package com.springcashloan.springcashloan.model;

import javax.persistence.*;

@Entity
@Table(name = "loanrequest", schema = "public")
public class LoanRequest {


    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(User borrowerId) {
        this.borrowerId = borrowerId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public TermRate getTermRateId() {
        return termRateId;
    }

    public void setTermRateId(TermRate termRateId) {
        this.termRateId = termRateId;
    }

    public Status getStatusId() {
        return statusId;
    }

    public void setStatusId(Status statusId) {
        this.statusId = statusId;
    }

    public LenderShop getStoreId() {
        return storeId;
    }

    public void setStoreId(LenderShop storeId) {
        this.storeId = storeId;
    }

    public User getManagerId() {
        return managerId;
    }

    public void setManagerId(User managerId) {
        this.managerId = managerId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @ManyToOne
    private User borrowerId;

    private Integer amount;

    @ManyToOne
    private TermRate termRateId;

    @ManyToOne
    private Status statusId;

    @ManyToOne
    private LenderShop storeId;

    @ManyToOne
    private User managerId;

    private String remarks;
}
