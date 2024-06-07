package com.learningpath.RESTdemo.model;

public class CloudVendor {
    private String VenodrId;
    private String VendorName;
    private String VendorAddress;
    private String VendorPhoneNumber;

//Create empty constructor
    public CloudVendor() {
    }
//Create constructor for the fields
    public CloudVendor(String venodrId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        VenodrId = venodrId;
        VendorName = vendorName;
        VendorAddress = vendorAddress;
        VendorPhoneNumber = vendorPhoneNumber;
    }
//Created the getter and setter for the following class
    public String getVenodrId() {
        return VenodrId;
    }

    public void setVenodrId(String venodrId) {
        VenodrId = venodrId;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }
}
