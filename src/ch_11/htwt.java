package ch_11;

public class htwt implements Comparable<htwt>{
	Integer wt;
	Integer ht;
	@Override
	public int compareTo(htwt other) {	//for sorting accordign to height
		// TODO Auto-generated method stub
		if(this.ht!=other.ht)
			return this.ht.compareTo(other.ht);
		
		return this.wt.compareTo(other.wt);
	}
	public boolean isBefore(htwt other)	// for finding LIS according to weight
	{
		if(this.wt<other.wt && this.ht<other.ht)
			return true;
		return false;
	}
	
	public htwt(int ht,int wt)
	{
		this.ht=ht;
		this.wt=wt;
	}
	
	

}
