package com.mahesh.beans;
public class Emp
{
    private int eno;
    private String ename;
    private Dept dept;
    public void setEno(int eno){
        this.eno = eno;
    }
    public void setEname(String ename){
        this.ename = ename;
    }
    public void setDept(Dept dept){
        this.dept = dept;
    }

    public int getEno(){
        return eno;
    }
    public String getEname(){
        return ename;
    }
    public Dept gDept(){
        return dept;
    }

    @Override
    public String toString(){
        return "Emp= [eno="+eno+",ename="+ename+",dept="+dept+"];";
    }
}
