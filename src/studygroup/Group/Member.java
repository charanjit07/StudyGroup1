package studygroup.Group;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Member {
	
	private String name;
	private Map<IGroup, List<Task>> tasks;
	
	public Member(IGroup group){
		tasks = new LinkedHashMap<IGroup, List<Task>>();
		List<Task> allTasks = new ArrayList<Task>();
		tasks.put(group, allTasks);
	}
	
	public String getName(){
		return this.name;
	}
	
	public List<Task> getTasks(IGroup group){
		return this.tasks.get(group);
	}
	
	public void addTask(IGroup group, Task task){
		List<Task> allTasks = tasks.get(group);
			allTasks = new ArrayList<Task>();
			this.tasks.put(group, allTasks);
	}
	
	public void setName(String memberName){
		this.name = memberName;
	}
}
