package cn.shilight.gfly.entity;

public class Senior {

    private int SeniorId;
    private String SeniorName;
    private boolean SeniorMapEn;
    private boolean SeniorViewEn;
    private boolean AutoEn;
    private String Others;


    public Senior(int seniorId, String seniorName, boolean seniorMapEn, boolean seniorViewEn, boolean autoEn) {
        SeniorId = seniorId;
        SeniorName = seniorName;
        SeniorMapEn = seniorMapEn;
        SeniorViewEn = seniorViewEn;
        AutoEn = autoEn;
    }

    public Senior(int seniorId, String seniorName, boolean seniorMapEn, boolean seniorViewEn, boolean autoEn, String others) {
        SeniorId = seniorId;
        SeniorName = seniorName;
        SeniorMapEn = seniorMapEn;
        SeniorViewEn = seniorViewEn;
        AutoEn = autoEn;
        Others = others;
    }


    public int getSeniorId() {
        return SeniorId;
    }

    public void setSeniorId(int seniorId) {
        SeniorId = seniorId;
    }

    public String getSeniorName() {
        return SeniorName;
    }

    public void setSeniorName(String seniorName) {
        SeniorName = seniorName;
    }

    public boolean isSeniorMapEn() {
        return SeniorMapEn;
    }

    public void setSeniorMapEn(boolean seniorMapEn) {
        SeniorMapEn = seniorMapEn;
    }

    public boolean isSeniorViewEn() {
        return SeniorViewEn;
    }

    public void setSeniorViewEn(boolean seniorViewEn) {
        SeniorViewEn = seniorViewEn;
    }

    public boolean isAutoEn() {
        return AutoEn;
    }

    public void setAutoEn(boolean autoEn) {
        AutoEn = autoEn;
    }

    public String getOthers() {
        return Others;
    }

    public void setOthers(String others) {
        Others = others;
    }
}
