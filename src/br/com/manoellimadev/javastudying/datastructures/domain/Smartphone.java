package br.com.manoellimadev.javastudying.datastructures.domain;

public class Smartphone {
    private String serialNumber;
    private String model;

    public Smartphone(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smt = (Smartphone) obj;
        return smt.getSerialNumber() != null && smt.getSerialNumber().equals(this.serialNumber);
    }

    @Override
    public String toString() {
        return "Serial Number: "+ this.serialNumber + "; Model: "+ this.model;
    }

    @Override
    public int hashCode() {

        return this.serialNumber == null ? 0 : this.serialNumber.hashCode();
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
