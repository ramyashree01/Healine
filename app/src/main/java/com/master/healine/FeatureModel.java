package com.master.healine;

public class FeatureModel {
    private String title;
    private String subtitle;
    private int anim;

    public FeatureModel(String title, String subtitle, int anim) {
        this.title = title;
        this.subtitle = subtitle;
        this.anim = anim;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getAnim() {
        return anim;
    }

    public void setAnim(int anim) {
        this.anim = anim;
    }
}
