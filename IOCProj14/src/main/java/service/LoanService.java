package service;

import bo.CustomerBO;
import dao.LoanDAO;

public class LoanService {
    private LoanDAO dao;
    public void setDao(LoanDAO dao){
        this.dao = dao;
    }
    public float calcIntrAmt(int cno,String cname,float pamt,float rate,float time){
        //b.logic
        float intramt = pamt*rate*time/100.0f;
        //use dao class persistance logic
        CustomerBO cbo = new CustomerBO();
        cbo.setPamt(pamt);
        cbo.setCno(cno);
        cbo.setCname(cname);
        cbo.setIntramt(intramt);
        int result = dao.insert(cbo);
        return intramt;
    }
}
