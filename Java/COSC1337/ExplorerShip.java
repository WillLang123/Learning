public class ExplorerShip extends SpaceShip{
		public ExplorerShip() {
		numEngines=2;
		name="Explorer";
		}
//constructor with parameters that gives values to inherited attributes
		public ExplorerShip(int i) {
		numEngines=i;
		name="Explorer";
		}
//constructor with parameters that gives inputed values to inherited attributes
		public void showSpeed() {
		System.out.println(name+" is a ship with "+numEngines+" engines can fly at speed "+(numEngines*2)+" warp factor");	
		}
//overrides method from abstract spaceship
	}
