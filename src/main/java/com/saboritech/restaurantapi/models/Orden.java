package com.saboritech.restaurantapi.models;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "orden")
public class Orden {

    private final Float impuesto = 1.17f;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombreCliente;
    private String notasDeOrden;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinTable(name = "platillos_cantidad_orden",
            joinColumns = @JoinColumn(name = "orden_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "platillocantidad_id", referencedColumnName = "id"))
    private List<PlatilloCantidad> platillos;

    @Temporal(TemporalType.TIMESTAMP)
    Date fechaHoraCreacion;

    private String estado;

    private Float totalOrden;
    private Float totalMasImpuesto;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNotasDeOrden() {
        return this.notasDeOrden;
    }

    public void setNotasDeOrden(String notasDeOrden) {
        this.notasDeOrden = notasDeOrden;
    }

    public List<PlatilloCantidad> getPlatillos() {
        return new ArrayList<>(platillos);
    }

    public void setPlatillos(List<PlatilloCantidad> platillos) {
        this.platillos = platillos;
    }

    public Date getFechaHoraCreacion() {
        return this.fechaHoraCreacion;
    }

    public void setFechaHoraCreacionToNow() {
        this.fechaHoraCreacion = new Timestamp(System.currentTimeMillis());
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Float getTotalOrden() {
        return this.totalOrden;
    }

    public void setTotalOrden(Float totalOrden) {
        this.totalOrden = totalOrden;
    }

    public Float getTotalMasImpuesto() {
        return this.totalMasImpuesto;
    }

    public void setTotalMasImpuesto() {
        this.totalMasImpuesto = this.totalOrden * this.impuesto;
    }


    public double getImpuesto() {
        return this.impuesto;
    }


}
