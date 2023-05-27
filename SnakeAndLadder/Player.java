package SnakeAndLadder;

public class Player {
    String id;
    String name;
    int currPos;
    
    public Player(String id, String name, int currPos){
        this.id = id;
        this.name = name;
        this.currPos = currPos;
    }
    
    public String getID(){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCurrPos(){
        return currPos;
    }

    public void setCurrPos(int currPos){
        this.currPos = currPos;
    }
}
