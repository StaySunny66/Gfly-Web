package cn.shilight.gfly.entity;

public class DataFeature {

    public String type = "Feature";
    public geometry geometry ;

    public properties properties;

    public DataFeature(double jd,double wd,int count){

        this.geometry = new geometry(jd,wd);
        this.properties = new properties(count);

    }


}
