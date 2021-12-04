package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import subway.util.InputValidator;

public class StationRepository {
	private static final List<Station> stations = new ArrayList<>();

	public static List<Station> stations() {
		return Collections.unmodifiableList(stations);
	}

	public static void addStation(String stationName) {
		if (InputValidator.checkValidName(stationName) && !InputValidator.isDuplicatedStationName(stationName)) {
			stations.add(new Station(stationName));
		}
	}

	public static void deleteStation(String stationName) {
		if (InputValidator.checkValidName(stationName)) {
			stations.removeIf(station -> Objects.equals(station.getName(), stationName));
		}
	}
}
