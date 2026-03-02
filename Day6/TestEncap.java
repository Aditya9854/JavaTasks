//Encapsulation : Binding data and methods in single unit 
class Player
{
    public String name;
    public int score;

    public Player(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
    public void updateScore(int points)
    {
        this.score += points;
        System.out.println("updated Score : "+score);
    }
}
public class TestEncap
{
    public static void main(String[]a)
    {
        Player p1 = new Player("virat", 85);

        p1.updateScore(15);

    }
}