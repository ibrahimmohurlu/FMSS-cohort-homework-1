public class Main {
    public static void main(String[] args) {
        ResidenceRepository repo = new ResidenceRepository();
        ResidenceService service = new ResidenceService(repo);
        System.out.println("Evlerin toplam fiyatlarını dönen bir metot -> " + service.getTotalHousePrice());
        System.out.println("Villaların toplam fiyatlarını dönen bir metot -> " + service.getTotalVillaPrice());
        System.out.println("Yazlıkların toplam fiyatlarını dönen metot -> " + service.getTotalSummerHousePrice());
        System.out.println("Tüm tipteki evlerin toplam fiyatını dönen metot -> " + service.getTotalResidencePrice());
        System.out.println("Evlerin ortalama metrekaresini dönen bir metot -> " + service.getAverageHouseArea());
        System.out.println("Villaların ortalama metrekaresini dönen bir metot -> " + service.getAverageVillaArea());
        System.out.println("Yazlıkların ortalama metrekaresini dönen metot -> " + service.getAverageSummerHouseArea());
        System.out.println("Tüm tipteki evlerin ortalama metrekaresini dönen metot  -> " + service.getAverageResidenceArea());
        System.out.println("Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot (oda sayisi > 2 ve salon sayisi > 3) -> " + service.filterResidenceByRoomAndLoungeCount(2, 3));
    }
}