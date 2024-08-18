package Service;
import Model.House;
import Model.SummerHouse;
import Model.Villa;

import java.util.List;

public class HousingService {

    public double getTotalPriceOfHouses(List<House> houses) {
        return houses.stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfVillas(List<Villa> villas) {
        return villas.stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfSummerHouses(List<SummerHouse> summerHouses) {
        return summerHouses.stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfAllProperties(List<House> houses, List<Villa> villas, List<SummerHouse> summerHouses) {
        return getTotalPriceOfHouses(houses) + getTotalPriceOfVillas(villas) + getTotalPriceOfSummerHouses(summerHouses);
    }

    public double getAverageSquareMetersOfHouses(List<House> houses) {
        return houses.stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfVillas(List<Villa> villas) {
        return villas.stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfSummerHouses(List<SummerHouse> summerHouses) {
        return summerHouses.stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfAllProperties(List<House> houses, List<Villa> villas, List<SummerHouse> summerHouses) {
        double totalSquareMeters = houses.stream().mapToDouble(House::getSquareMeters).sum()
                + villas.stream().mapToDouble(House::getSquareMeters).sum()
                + summerHouses.stream().mapToDouble(House::getSquareMeters).sum();

        int totalCount = houses.size() + villas.size() + summerHouses.size();
        return totalSquareMeters / totalCount;
    }

    public List<House> filterPropertiesByRoomAndLivingRoom(List<House> houses, int rooms, int livingRooms) {
        return houses.stream()
                .filter(h -> h.getRooms() == rooms && h.getLivingRooms() == livingRooms)
                .toList();
    }
}
