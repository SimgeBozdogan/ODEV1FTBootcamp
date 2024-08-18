
import Model.House;
import Model.SummerHouse;
import Model.Villa;
import Service.HousingService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        House house1 = new House(100000, 120, 3, 1);
        House house2 = new House(150000, 150, 4, 2);
        House house3 = new House(200000, 180, 5, 2);

        Villa villa1 = new Villa(300000, 250, 6, 2);
        Villa villa2 = new Villa(400000, 300, 7, 3);
        Villa villa3 = new Villa(500000, 350, 8, 3);

        SummerHouse summerHouse1 = new SummerHouse(150000, 130, 3, 1);
        SummerHouse summerHouse2 = new SummerHouse(200000, 160, 4, 2);
        SummerHouse summerHouse3 = new SummerHouse(250000, 200, 5, 2);

        List<House> houseList = List.of(house1, house2, house3);
        List<Villa> villaList = List.of(villa1, villa2, villa3);
        List<SummerHouse> summerHouseList = List.of(summerHouse1, summerHouse2, summerHouse3);


        HousingService housingService = new HousingService();

        System.out.println("Total price of houses: " + housingService.getTotalPriceOfHouses(houseList));
        System.out.println("Total price of villas: " + housingService.getTotalPriceOfVillas(villaList));
        System.out.println("Total price of summer houses: " + housingService.getTotalPriceOfSummerHouses(summerHouseList));
        System.out.println("Total price of all properties: " + housingService.getTotalPriceOfAllProperties(houseList, villaList, summerHouseList));
        System.out.println("Average square meters of houses: " + housingService.getAverageSquareMetersOfHouses(houseList));
        System.out.println("Average square meters of villas: " + housingService.getAverageSquareMetersOfVillas(villaList));
        System.out.println("Average square meters of summer houses: " + housingService.getAverageSquareMetersOfSummerHouses(summerHouseList));
        System.out.println("Average square meters of all properties: " + housingService.getAverageSquareMetersOfAllProperties(houseList, villaList, summerHouseList));

        int rooms = 4;
        int livingRooms = 2;
        List<House> filteredHouses = housingService.filterPropertiesByRoomAndLivingRoom(houseList, rooms, livingRooms);
        System.out.println("Filtered houses with " + rooms + " rooms and " + livingRooms + " living rooms: " + filteredHouses.size());
    }
}
