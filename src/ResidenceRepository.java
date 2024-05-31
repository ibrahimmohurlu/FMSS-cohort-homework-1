import residence.House;
import residence.Residence;
import residence.SummerHouse;
import residence.Villa;

import java.util.ArrayList;
import java.util.List;

public class ResidenceRepository {
    private final List<House> houses;
    private final List<SummerHouse> summerHouses;
    private final List<Villa> villas;

    public ResidenceRepository() {
        this.houses = List.of(
                new House(120_000, 90, 3, 1),
                new House(250_000, 180, 3, 2),
                new House(600_000, 236, 6, 2)
        );
        this.summerHouses = List.of(
                new SummerHouse(386_800, 160, 5, 3),
                new SummerHouse(718_450, 489, 2, 4),
                new SummerHouse(452_476, 134, 2, 5)
        );
        this.villas = List.of(
                new Villa(476_254, 453, 8, 4),
                new Villa(765_657, 687, 5, 4),
                new Villa(375_746, 545, 12, 6)
        );

    }

    public List<Residence> getResidenceList() {
        List<Residence> residences = new ArrayList<>();
        residences.addAll(houses);
        residences.addAll(summerHouses);
        residences.addAll(villas);
        return residences;
    }

    public List<House> getHouseList() {
        return this.houses;
    }

    public List<SummerHouse> getSummerHouseList() {
        return this.summerHouses;
    }

    public List<Villa> getVillaList() {
        return this.villas;
    }
}
