package com.saboritech.restaurantapi.payload.request;

import lombok.Data;

import java.util.List;
import java.util.Collections;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class OrdenRequest {

    public static class PlatilloOrder {
        private String dish;
        private Integer quantity;
        private Float subTotal;

        public PlatilloOrder() {
        }

        public PlatilloOrder(String dish, Integer quantity, Float subTotal) {
            this.dish = dish;
            this.quantity = quantity;
            this.subTotal = subTotal;
        }

        public String getDish() {
            return dish;
        }

        public void setDish(String dish) {
            this.dish = dish;
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
    
    @NotBlank
    private String nombreCliente;

    private String notasDeOrden;

    @NotNull
    private List<PlatilloOrder> platillos;

    private String estado;

    public void setPlatillos(List<PlatilloOrder> platillos) {
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

    public List<PlatilloOrder> getPlatillos() {
        return this.platillos;
    }


    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
