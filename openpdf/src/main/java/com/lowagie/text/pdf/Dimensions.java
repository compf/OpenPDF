package com.lowagie.text.pdf;

public class Dimensions {

    private int height;
    private int width;
    private int ws;
    private int options;

    public Dimensions(int height, int width, int ws, int options) {
        this.height = height;
        this.width = width;
        this.ws = ws;
        this.options = options;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }

    public int getOptions() {
        return options;
    }

    public void setOptions(int options) {
        this.options = options;
    }

}