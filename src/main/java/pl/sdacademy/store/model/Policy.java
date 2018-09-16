package pl.sdacademy.store.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "policies")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String model;
    @Column
    private Integer productionYear;
    @Column
    private String mark;
    @Column
    private BigDecimal value;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date expireDate;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;


    /**
     * Encja może mieć konstruktor posiadający parametry. Należy jednak
     * pamiętać, że jeśli pojawi się inny konstruktor niż bezparametrowy,
     * to trzeba dodać też taki bez parametrów.
     *
     * @param model
     * @param productionYear
     * @param mark
     * @param value
     * @param expireDate
     */
    public Policy(String model, Integer productionYear, String mark, BigDecimal value, Date expireDate) {
        this.model = model;
        this.productionYear = productionYear;
        this.mark = mark;
        this.value = value;
        this.expireDate = expireDate;
    }

    /**
     * Encja MUSI mieć bezparametrowy konstruktor.
     * Może być też domyślny.
     */
    public Policy() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
