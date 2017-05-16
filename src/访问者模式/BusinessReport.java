package 访问者模式;

import java.util.ArrayList;
import java.util.List;

public class BusinessReport {
	List<Staff> mStaffs=new ArrayList<Staff>();
	
	public BusinessReport(){
		mStaffs.add(new Manager("jack"));
		mStaffs.add(new Engineer("jack1"));
		mStaffs.add(new Engineer("jack2"));
		mStaffs.add(new Engineer("jack3"));
		mStaffs.add(new Engineer("jack4"));
	}

	public void showRepost(Visitor visitor){
		for(Staff staff:mStaffs){
			staff.accept(visitor);
		}
	}
	
}
