package ch_11;

public class htwt implements Comparable<htwt>{
	Integer wt;
	Integer ht;
	@Override
	public int compareTo(htwt other) {
		// TODO Auto-generated method stub
		if(this.ht!=other.ht)
			return this.ht.compareTo(other.ht);
		
		return this.wt.compareTo(other.wt);
	}
	
	public htwt(int ht,int wt)
	{
		this.ht=ht;
		this.wt=wt;
	}
	

}
