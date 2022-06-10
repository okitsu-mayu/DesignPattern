package chain0fResponsibility;

public class Level {
	int level;
	Level(int level){
		this.level = level;
	}
	public boolean lessThan(Level responsibleLevel) {
		return this.level <= responsibleLevel.level;
	}
}
