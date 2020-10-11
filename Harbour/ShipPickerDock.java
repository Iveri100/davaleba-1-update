package ge.edu.btu.BattleShips.Harbour;

import ge.edu.btu.BattleShips.Vessels.Ship;
import ge.edu.btu.BattleShips.Exceptions.BattleshipsException;


public class ShipPickerDock {
    private String name;

    private int MaxDesiredNumOfShips = 8;
    private int ShipAmount;

    private Ship[] ships = new Ship[10];


    public ShipPickerDock() {}

    public ShipPickerDock(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int addShips(Ship ship){
        ships[ShipAmount] = ship;
        ShipAmount++;

        return ShipAmount;
    }

    public void ShipNumException(int ShipAmount) throws BattleshipsException {
        if(ShipAmount == MaxDesiredNumOfShips) throw new BattleshipsException("The desired amount of 8 was reached!");

    }
}
