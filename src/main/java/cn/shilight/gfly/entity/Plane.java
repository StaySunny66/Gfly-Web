package cn.shilight.gfly.entity;
// 飞机实体类
public class Plane {

    private String planeid;
    private String planename;
    private String planeuser;

    private int planestate;
    private float distance;


    public Plane(String planeid, String planename, String planeuser, int planestate, float distance) {
        this.planeid = planeid;
        this.planename = planename;
        this.planeuser = planeuser;
        this.planestate = planestate;
        this.distance = distance;
    }


    public String getPlaneid() {
        return planeid;
    }

    public void setPlaneid(String planeid) {
        this.planeid = planeid;
    }

    public String getPlanename() {
        return planename;
    }

    public void setPlanename(String planename) {
        this.planename = planename;
    }

    public String getPlaneuser() {
        return planeuser;
    }

    public void setPlaneuser(String planeuser) {
        this.planeuser = planeuser;
    }

    public int getPlanestate() {
        return planestate;
    }

    public void setPlanestate(int planestate) {
        this.planestate = planestate;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
}
