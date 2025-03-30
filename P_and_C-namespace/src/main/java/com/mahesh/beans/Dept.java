package com.mahesh.beans;
//dependent class
import java.util.Date;

public class Dept {
    private int deptno;
    private String name;
    private Date dop;
    //constructor injection  ----> use c: in configuration file
    public Dept(int deptno,String name,Date dop){
        System.out.println("Dept:3-param constructor");
        this.deptno = deptno;
        this.name = name;
        this.dop = dop;
    }
    @Override
    public String toString(){
        return "Dept=[deptno: "+deptno+",name :"+name+", date:"+dop+"]";
    }
}
