package com.example.grocerymanagement.model;

import javax.persistence.*;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private Integer supplierId;

    @Column(name = "supplier_name")
    private String supplierName;

    @Column(name = "supplier_address")
    private String supplierAddress;

    @Column(name = "supplier_telephone_number")
    private Integer supplierTelNo;

    public Supplier() {
    }

    public Supplier(Integer customerId, String customerName, String customerAddress, Integer customerTelNo) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierTelNo = supplierTelNo;
    }

    public Integer getSupplierId() { return supplierId; }

    public void setSupplierId(Integer supplierId) {
        this.supplierId  = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public Integer getSupplierTelNo() {
        return supplierTelNo;
    }

    public void setSupplierTelNo(Integer supplierTelNo) {
        this.supplierTelNo = supplierTelNo;
    }
}

