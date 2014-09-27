package studygroup.factories;

import studygroup.Group.IGroup;
import studygroup.Group.StudyGroup;

public class Factory extends AbstractFactory{

	public IGroup getGroup(String groupType){
		switch (groupType){
		case "StudyGroup":
			return new StudyGroup("");
		default: 
			return null;
		}
	}
}
