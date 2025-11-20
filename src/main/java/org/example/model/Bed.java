package org.example.model;

public class Bed {
    private String style;
    private int pillows;
        private int height;
        private int sheets;
        private int quilts;

    public Bed(int pillows, int height, int sheets, int quilts,  String style) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
        this.style = style;
    }
    public void make(){
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilt=" + quilts +
                ", style='" + style + '\'' +
                '}';
    }

    public String getStyle() {
        return style;
    }
}
