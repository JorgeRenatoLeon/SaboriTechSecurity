package com.saboritech.restaurantapi.models;

import javax.persistence.*;

@Entity
@Table(name = "platillocantidad")
public class PlatilloCantidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "platillo_platillo_cantidad",
            joinColumns = @JoinColumn(name = "platillocantidad_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "platillo_id", referencedColumnName = "id"))
    private Platillo platillo;

    private Integer quantity;

    private Float subTotal;

    public PlatilloCantidad() {
    }

    public PlatilloCantidad(Platillo platillo, Integer quantity, Float subTotal) {
        this.platillo = platillo;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Platillo getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }
}
