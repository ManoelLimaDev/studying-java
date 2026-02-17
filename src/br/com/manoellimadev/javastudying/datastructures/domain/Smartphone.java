package br.com.manoellimadev.javastudying.datastructures.domain;

public class Smartphone {
    private String serialNumber;
    private String model;

    public Smartphone(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smt = (Smartphone) obj;
        return smt.getSerialNumber() == this.serialNumber && smt.getModel() == this.model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
