package cn.shilight.gfly.entity;

import java.sql.Timestamp;

public class ValueData {
    private int valueDataId;
    private int seniorId;
    private String valueName;
    private String JD;
    private String WD;
    private Long sampleTime;
    private double valueData;
    private String valueUnits;

    // 构造函数
    public ValueData() {
    }

    public ValueData(int seniorId, String valueName, String JD, String WD, long sampleTime, double valueData, String valueUnits) {
        this.seniorId = seniorId;
        this.valueName = valueName;
        this.JD = JD;
        this.WD = WD;
        this.sampleTime = sampleTime;
        this.valueData = valueData;
        this.valueUnits = valueUnits;
    }

    // Getter 和 Setter 方法
    public int getValueDataId() {
        return valueDataId;
    }

    public void setValueDataId(int valueDataId) {
        this.valueDataId = valueDataId;
    }

    public int getSeniorId() {
        return seniorId;
    }

    public void setSeniorId(int seniorId) {
        this.seniorId = seniorId;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getJD() {
        return JD;
    }

    public void setJD(String JD) {
        this.JD = JD;
    }

    public String getWD() {
        return WD;
    }

    public void setWD(String WD) {
        this.WD = WD;
    }

    public long getSampleTime() {
        return sampleTime;
    }

    public void setSampleTime(long sampleTime) {
        this.sampleTime = sampleTime;
    }

    public double getValueData() {
        return valueData;
    }

    public void setValueData(double valueData) {
        this.valueData = valueData;
    }

    public String getValueUnits() {
        return valueUnits;
    }

    public void setValueUnits(String valueUnits) {
        this.valueUnits = valueUnits;
    }

    // toString 方法
    @Override
    public String toString() {
        return "ValueData{" +
                "valueDataId=" + valueDataId +
                ", seniorId=" + seniorId +
                ", valueName='" + valueName + '\'' +
                ", JD='" + JD + '\'' +
                ", WD='" + WD + '\'' +
                ", sampleTime=" + sampleTime +
                ", valueData=" + valueData +
                ", valueUnits='" + valueUnits + '\'' +
                '}';
    }
}
