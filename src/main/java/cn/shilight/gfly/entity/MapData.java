package cn.shilight.gfly.entity;

import java.util.List;

public class MapData {


    public String type = "FeatureCollection";
    public List<DataFeature>  features;

    public MapData(List<DataFeature> features) {
        this.features = features;
    }

    public List<DataFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<DataFeature> features) {
        this.features = features;
    }
}
