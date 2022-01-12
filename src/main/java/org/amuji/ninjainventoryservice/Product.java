package org.amuji.ninjainventoryservice;

public class Product {
    private String id;
    private String name;
    private String manufacture;
    private String vendor;

    public Product() {
    }

    public Product(String id, String name, String manufacture, String vendor) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.vendor = vendor;
    }

    public String getId() {
        return id;
    }

    public Product setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getManufacture() {
        return manufacture;
    }

    public Product setManufacture(String manufacture) {
        this.manufacture = manufacture;
        return this;
    }

    public String getVendor() {
        return vendor;
    }

    public Product setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
}
