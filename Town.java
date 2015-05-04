package travellingSalesman;

	public class Town {
		private final double R = 6371.0;
		public double lon = 0.0, lat = 0.0;
		public String name = "";
		int visted = 0, num = 0;


		public Town(int number, String town, double lattitude, double longitude) {
			num = number;
			lat = lattitude;
			lon = longitude;
			name = town;
		}

		public double distance(Town loc) {
			double latDiff = loc.lat - lat, lonDiff = loc.lon - lon;
			double a = (Math.sin(Math.toRadians(latDiff / 2)) * Math.sin(Math
					.toRadians(latDiff / 2)))
					+ Math.cos(Math.toRadians(loc.lat))
					* Math.cos(Math.toRadians(lat))
					* (Math.sin(Math.toRadians(lonDiff / 2)) * Math.sin(Math
							.toRadians(lonDiff / 2)));
			double c = 2 * Math.asin(Math.sqrt(a));
			double d = R * c;
			return d;
		}
	}



