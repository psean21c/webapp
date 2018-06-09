package spring.abc.scope.aop;

public class UserManager {

	UserPreferences userPreferences;
	String name;

	public UserPreferences getUserPreferences() {
		return userPreferences;
	}
	public String getName() {
		return name;
	}
	public void setUserPreferences(UserPreferences userPreferences) {
		this.userPreferences = userPreferences;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
