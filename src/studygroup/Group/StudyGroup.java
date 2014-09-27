package studygroup.Group;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup implements IGroup{

	String groupName;
	String owner;
	List<Member> members;
	
	public StudyGroup(String owner){
		this.owner = owner;
	}
	
	public void nameGroup(String name){
		this.groupName = name;
	}
	
	public String getGroupName(){
		return this.groupName;
	}
	
	public void addMembers(ArrayList<Member> members){
		this.members = members;
	}
	
	public void removeMembers(Member memberName){
		this.members.remove(memberName);
	}
	
	public String shareGroup(){
		return null;
	}
}
