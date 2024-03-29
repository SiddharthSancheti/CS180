package Week06;
/**
 * @author Siddharth Sancheti, Section 33
 */
public class State {
    private String capital;
    private int population;

    public State(String capital, int population) {
        this.capital = capital;
        this.population = population;
    }

    public String getCapital() { return capital; }
	@SuppressWarnings("unused")
	private int getPopulation() { return population; }

    public void setCapital(String capital) { this.capital = capital; }
    public void setPopulation(int population) { this.population = population; }
}
