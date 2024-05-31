import residence.Residence;

import java.util.List;
import java.util.OptionalDouble;

public class ResidenceService {
    private final ResidenceRepository repo;

    public ResidenceService(ResidenceRepository repo) {
        this.repo = repo;
    }

    public int getTotalHousePrice() {

        return this.repo.getHouseList().stream().mapToInt(Residence::getPrice).sum();
    }

    public int getTotalVillaPrice() {
        return this.repo.getVillaList().stream().mapToInt(Residence::getPrice).sum();
    }

    public int getTotalSummerHousePrice() {
        return this.repo.getSummerHouseList().stream().mapToInt(Residence::getPrice).sum();
    }

    public int getTotalResidencePrice() {
        return getTotalHousePrice() + getTotalSummerHousePrice() + getTotalVillaPrice();
    }

    public double getAverageHouseArea() {
        OptionalDouble avg = this.repo.getHouseList().stream().mapToInt(Residence::getArea).average();
        if (avg.isPresent()) {
            return avg.getAsDouble();
        }
        return -1;
    }

    public double getAverageVillaArea() {
        OptionalDouble avg = this.repo.getVillaList().stream().mapToInt(Residence::getArea).average();
        if (avg.isPresent()) {
            return avg.getAsDouble();
        }
        return -1;
    }

    public double getAverageSummerHouseArea() {
        OptionalDouble avg = this.repo.getSummerHouseList().stream().mapToInt(Residence::getArea).average();
        if (avg.isPresent()) {
            return avg.getAsDouble();
        }
        return -1;
    }

    public double getAverageResidenceArea() {
        OptionalDouble avg = repo.getResidenceList().stream().mapToInt(Residence::getArea).average();
        if (avg.isEmpty()) {
            return -1;
        }
        return avg.getAsDouble();
    }

    public List<Residence> filterResidenceByRoomAndLoungeCount(int roomCount, int loungeCount) {
        return repo.getResidenceList().stream().filter(r -> r.getLoungeCount() > loungeCount && r.getRoomCount() > roomCount).toList();
    }
}
