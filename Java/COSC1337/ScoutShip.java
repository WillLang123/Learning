public class ScoutShip extends SpaceShip{
		public ScoutShip() {
		numEngines=1;
		name="Scout";
		}
//creates no arg constructor that gives values to inherited attributes
		public ScoutShip(int i) {
		numEngines=i;
		name="Scout";
		}
//constructor with parameters that gives inputed values to inherited attributes
		public void showSpeed() {
		System.out.println(name+" is a ship with "+numEngines+" engines can fly at speed "+(numEngines*2)+" warp factor");
		}
//overrides method from abstract spaceship
	}
