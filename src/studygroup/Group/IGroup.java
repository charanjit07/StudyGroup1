package studygroup.Group;

import java.util.ArrayList;

public interface IGroup {

	public void nameGroup(String name);
	
	public String getGroupName();
	
	public String shareGroup();
	
	public void addMembers(ArrayList<Member> members);
	
	public void removeMembers(Member member);
}
