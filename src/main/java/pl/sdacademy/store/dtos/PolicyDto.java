package pl.sdacademy.store.dtos;

import java.math.BigDecimal;

public class PolicyDto {
    private String marka;
    private String model;
    private Integer rocznik;
    private String nrRej;
    private String firstName;
    private String lastName;
    private BigDecimal value;
    private String expireDate;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRocznik() {
        return rocznik;
    }

    public void setRocznik(Integer rocznik) {
        this.rocznik = rocznik;
    }

    public String getNrRej() {
        return nrRej;
    }

    public void setNrRej(String nrRej) {
        this.nrRej = nrRej;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
}
