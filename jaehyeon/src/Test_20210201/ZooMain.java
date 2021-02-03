package Test_20210201;

public class ZooMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] animal = new Animal[7];
		String[] s = {"È£¶ûÀÌ","ÄÚ³¢¸®","ÇÏ¸¶","»çÀÚ","´Á´ë","Ä¡Å¸","Åä³¢"};
		int[] age = {5,7,4,10,3,3,6};
		int[] weight = {10,15,13,15,9,14,12};
		
		for(int i = 0; i < s.length; i++) {
			animal[i] = new Animal(s[i], age[i], weight[i]);
		}
		animal[0].setEatMeats(true);
		animal[3].setEatMeats(true);
		animal[4].setEatMeats(true);
		animal[5].setEatMeats(true);
		
		Zoo zoo = new Zoo(animal);
		
		zoo.printCarnivore();
		zoo.printHerbivore();
		
		
		
		
	}

}
