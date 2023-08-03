package com.udemy.section10.prototype;

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return this.type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
