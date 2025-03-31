package bo;

public class CustomerBO {
	private int cno;
	private String cname;
	private float pamt,intramt;
	
	public int getCno(){
		return cno;
	}
	public String getCname(){
		return cname;
	}
	public float getPamt(){
		return pamt;
	}
	public float getIntramt(){
		return intramt;
	}


	public void setCno(int cno){
		this.cno = cno;
	}
	public void setCname(String cname){
		this.cname = cname;
	}
	public void setPamt(float pamt){
		this.pamt = pamt;
	}
	public void setIntramt(float intramt){
		this.intramt = intramt;
	}

}
