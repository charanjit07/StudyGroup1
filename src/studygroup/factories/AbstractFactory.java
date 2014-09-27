package studygroup.factories;

import studygroup.Group.IGroup;

public abstract class AbstractFactory {
	
	public abstract IGroup getGroup(String groupType);
}
