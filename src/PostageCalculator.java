public class PostageCalculator {
    public static double calculatePostage(String zip, String zip2, double weight, double length, double height, double width)
    {
        String countyCode = zip.substring(0, 3);
        String countyCode2 = zip2.substring(0, 3);
        double cost = 0;
        double weightCost = (weight*10) * 0.05;
        double countyCodeCost = (double) (Integer.parseInt(countyCode) - Integer.parseInt(countyCode2)) / 100;
        double overSizeCost = 0;
        double overWeightCost = 0;
        if (length + height + width > 36)
        {
            double difference = (length + height + width) - 36;
            overSizeCost += difference * 0.1;
        }
        if (weight > 40)
        {
            double difference = weight - 40;
            overWeightCost = (difference * 10) * 0.1;
        }
        cost += weightCost + countyCodeCost + overSizeCost + overWeightCost + 3.75;
        return cost;
    }

    public static double calculatePostage(Address a, Address b, double weight, double length, double height, double width)
    {
        String countyCode = a.getZipcode().substring(0, 3);
        String countyCode2 = b.getZipcode().substring(0, 3);
        double cost = 0;
        double weightCost = (weight*10) * 0.05;
        double countyCodeCost = (double) (Integer.parseInt(countyCode) - Integer.parseInt(countyCode2)) / 100;
        double overSizeCost = 0;
        double overWeightCost = 0;
        if (length + height + width > 36)
        {
            double difference = (length + height + width) - 36;
            overSizeCost += difference * 0.1;
        }
        if (weight > 40)
        {
            double difference = weight - 40;
            overWeightCost = (difference * 10) * 0.1;
        }
        cost += weightCost + countyCodeCost + overSizeCost + overWeightCost + 3.75;
        return cost;
    }

    public static double calculatePostage(Package p)
    {
        String countyCode = p.getOrigin().getZipcode().substring(0, 3);
        String countyCode2 = p.getDestination().getZipcode().substring(0, 3);
        double cost = 0;
        double weightCost = (p.getPounds()*10) * 0.05;
        double countyCodeCost = (double) (Integer.parseInt(countyCode) - Integer.parseInt(countyCode2)) / 100;
        double overSizeCost = 0;
        double overWeightCost = 0;
        if (p.getLength() + p.getHeight() + p.getWidth() > 36)
        {
            double difference = (p.getLength() + p.getHeight() + p.getWidth()) - 36;
            overSizeCost += difference * 0.1;
        }
        if (p.getPounds() > 40)
        {
            double difference = p.getPounds() - 40;
            overWeightCost = (difference * 10) * 0.1;
        }
        cost += weightCost + countyCodeCost + overSizeCost + overWeightCost + 3.75;
        return cost;
    }
}
