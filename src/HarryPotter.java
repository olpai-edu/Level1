public class HarryPotter {
	
	private boolean cloakOn;

	HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell){
		System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}
	
	void explode() {
		System.out.println("HARRY POTTER IS DEAD! HE HAS EXPLODED INTO MANY PIECES!");
	}

	public static void main(String[] args) {

		for (int i = 0; i > -1; i++) {
			// 1. make harry potter
			HarryPotter harrypotter = new HarryPotter();
			// 2. become invisible
			harrypotter.makeInvisible(true);
			// 3. spy on professor snape
			harrypotter.spyOnSnape();
			// 4. become visible again
			harrypotter.makeInvisible(false);
			// 5. cast a “stupefy” spell
			harrypotter.castSpell("stupefy");
			harrypotter.explode();
		}

	}

}
