/*Will Lang
 * COSC 2336
 * Instructor: JiangJiang Liu
 * Programming Assignment 10
 * Due: 11/1/23
 * Implement new MyHashedMap with linear probing instead of separate chaining
 */
public class TestMyHashMapWill {
	public static void main(String[] args) {
		// Create a map
		MyMap<String, Integer> map = new MyHashMap<>();
		map.put("Smith", 30);
	   map.put("Anderson", 31);
		map.put("Lewis", 29);
		map.put("Cook", 29);
		map.put("Smith", 65);

		System.out.println("Entries in map: " + map);

		System.out.println("The age of Lewis is " +
			map.get("Lewis"));

		System.out.println("Is Smith in the map? " +
			map.containsKey("Smith"));

		System.out.println("Is age 33 in the map? " +
			map.containsValue(33));
		System.out.println();

		map.remove("Smith");
		System.out.println("Entries in map: " + map);

		map.clear();
		System.out.println("Entries in map: " + map);

	}
}
