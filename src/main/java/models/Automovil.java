package models;

import java.util.Random;

public class Automovil {
    private long id;
    private String marca;
    private int año;
    private String color;
    private int precio;
    private boolean turbo;
    private String tipo;
    private String motor;
    private int cabinas;
    private boolean sunroof;
    private int popularidad;

    public Automovil() {
        Random random = new Random();
        this.id = random.nextLong();
        this.marca = generarMarca(random.nextInt(5));
        this.año = random.nextInt(9) + 2015;
        this.color = generarColor(random.nextInt(5));
        this.precio = random.nextInt(22000001) + 8000000;
        this.turbo = random.nextBoolean();
        this.tipo = generarTipo(random.nextInt(3));
        this.motor = generarMotor(tipo, random.nextInt(3));
        this.cabinas = tipo.equals("camioneta") ? random.nextInt(2) + 1 : 0;
        this.sunroof = tipo.equals("SUV") ? random.nextBoolean() : false;
        this.popularidad = 0;
    }

    private String generarMarca(int index) {
        String[] marcas = {"Toyota", "Chevrolet", "Ford", "Nissan", "Mazda"};
        return marcas[index];
    }

    private String generarColor(int index) {
        String[] colores = {"Rojo", "Azul", "Negro", "Gris", "Blanco"};
        return colores[index];
    }

    private String generarTipo(int index) {
        String[] tipos = {"Sedan", "Camioneta", "SUV"};
        return tipos[index];
    }

    private String generarMotor(String tipo, int index) {
        if (tipo.equals("Sedan")) {
            String[] motores = {"1.4cc", "1.6cc", "2.0cc"};
            return motores[index];
        } else if (tipo.equals("Camioneta")) {
            String[] motores = {"2.4cc", "3.0cc", "4.0cc"};
            return motores[index];
        } else {
            String[] motores = {"1.8cc", "2.2cc", "2.8cc"};
            return motores[index];
        }
    }

    // Getters y setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCabinas() {
        return cabinas;
    }

    public void setCabinas(int cabinas) {
        this.cabinas = cabinas;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", año=" + año +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", turbo=" + turbo +
                ", tipo='" + tipo + '\'' +
                ", motor='" + motor + '\'' +
                ", cabinas=" + cabinas +
                ", sunroof=" + sunroof +
                ", popularidad=" + popularidad +
                '}';
    }
}
