package com.saboritech.restaurantapi.payload.request;

import lombok.Data;

import java.util.List;
import java.util.Collections;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class OrdenRequest {
    
    @NotBlank
    private String nombreCliente;

    private String notasDeOrden;

    @NotNull
    private List<String> platillos;

    private String estado;

    public void setPlatillos(List<String> platillos) {
        this.platillos = Collections.unmodifiableList(platillos);
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

    public List<String> getPlatillos() {
        return this.platillos;
    }


    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
