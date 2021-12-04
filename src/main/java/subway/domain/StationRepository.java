package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import subway.util.InputValidator;
import subway.view.OutputView;

public class StationRepository {
	private static final List<Station> stations = new ArrayList<>();

	public static List<Station> stations() {
		return Collections.unmodifiableList(stations);
	}

	public static void addStation(String stationName) {
		if (InputValidator.checkValidName(stationName) && !InputValidator.isDuplicatedStationName(stationName)) {
			stations.add(new Station(stationName));
			OutputView.printInfoMessage("지하철 역이 등록되었습니다.");
		}
	}

	public static void deleteStation(String stationName) {
		if (InputValidator.checkValidName(stationName) && InputValidator.isExistStationName(stationName)) {
			stations.removeIf(station -> Objects.equals(station.getName(), stationName));
			OutputView.printInfoMessage("지하철 역이 삭제되었습니다.");
		}
	}
}
