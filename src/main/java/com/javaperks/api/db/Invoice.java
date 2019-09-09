package com.javaperks.api.db;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
// import java.text.SimpleDateFormat;

public class Invoice
{
    private int invoiceId;
    private String invoiceNumber;
    private int custId;
    private String invoiceDate;
    private String orderId;
    private String title;
    private double amount;
    private double tax;
    private double shipping;
    private double total;
    private String datePaid;
    private String contact;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private List<InvoiceItem> items;

    public Invoice() {
    }

    public Invoice(int invoiceId, String invoiceNumber, int custId, String invoiceDate, String orderId, String title, double amount, double tax, double shipping, double total, String datePaid, String contact, String address1, String address2, String city, String state, String zip, String phone, List<InvoiceItem> items) {
        this.invoiceId = invoiceId;
        this.invoiceNumber = invoiceNumber;
        this.custId = custId;
        this.invoiceDate = invoiceDate;
        this.orderId = orderId;
        this.title = title;
        this.amount = amount;
        this.shipping = shipping;
        this.tax = tax;
        this.total = total;
        this.datePaid = datePaid;
        this.contact = contact;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.items = items;
    }

    public int getInvoiceId() {
        return this.invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getCustId() {
        return this.custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getShipping() {
        return this.shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDatePaid() {
        return this.datePaid;
    }

    public void setDatePaid(String datePaid) {
        this.datePaid = datePaid;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address) {
        this.address1 = address;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address) {
        this.address2 = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<InvoiceItem> getItems() {
        return this.items;
    }

    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        String out = "";

        out += "invoiceId: " + Integer.toString(invoiceId) + "\n";
        out += "invoiceNumber: " + this.invoiceNumber + "\n";
        out += "custId: " + Integer.toString(this.custId) + "\n";
        out += "invoieDate: " + this.invoiceDate + "\n";
        out += "orderId: " + this.orderId + "\n";
        out += "title: " + this.title + "\n";
        out += "amount: " + Double.toString(this.amount) + "\n";
        out += "shipping: " + Double.toString(this.shipping) + "\n";
        out += "tax: " + Double.toString(this.tax) + "\n";
        out += "total: " + Double.toString(this.total) + "\n";
        out += "datePaid: " + this.datePaid + "\n";
        out += "contact: " + this.contact + "\n";
        out += "address1: " + this.address1 + "\n";
        out += "address2: " + this.address2 + "\n";
        out += "city: " + this.city + "\n";
        out += "state: " + this.state + "\n";
        out += "zip: " + this.zip + "\n";
        out += "phone: " + this.phone + "\n";

        return out;
    }
}