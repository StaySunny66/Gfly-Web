package cn.shilight.gfly.entity;

public class geometry {
    public String type  = "Point";
    public double[] coordinates ;


    public geometry(){
        coordinates = new double[2];
    }
    public geometry(double jd,double wd){


        coordinates = new double[2];
        this.coordinates[0] = jd;
        this.coordinates[1] = wd;
    }

    public void geoSet(double jd,double wd){

        this.coordinates[0] = jd;
        this.coordinates[1] = wd;

    }





}
