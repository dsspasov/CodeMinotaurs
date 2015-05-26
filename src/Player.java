
public class Player {

    private String name;
    private int points;
    
    public Player(){
        super();
    }
    
    public Player(String name){
        this.setName(name);
        this.setPoints(points);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
}
