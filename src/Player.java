import java.awt.event.KeyEvent;

public class Player {
    private String name;
    private int points;
    private int xCoordinate;
    private int yCoordinate;

    public Player() {
        super();
    }

    public Player(String name, int points, int xCoordinate, int yCoordinate) {
        this.setName(name);
        this.setPoints(points);
        this.setxCoordinate(xCoordinate);
        this.setyCoordinate(yCoordinate);
    }

    public void moveTo(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT && getxCoordinate() > 0) {
            setxCoordinate(getxCoordinate() - 1);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            setxCoordinate(getxCoordinate() + 1);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            setyCoordinate(getyCoordinate() + 1);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            setyCoordinate(getyCoordinate() - 1);
        } else {

        }

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

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

}
