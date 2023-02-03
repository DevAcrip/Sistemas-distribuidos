package com.acrip.distribuidos.api_rest_bidding.models;

public class ProductEntity {
    private Integer codigo;		
	private String nombre;	
    private Integer valor;

    public ProductEntity() {}
    public ProductEntity(Integer codigo, String nombre, Integer valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getValor() {
        return valor;
    }
    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
