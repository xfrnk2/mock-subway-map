package subway.util;

import java.util.List;
import java.util.Objects;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.OutputView;

public class InputValidator {

	public static void checkValidStationNameToAdd(final String stationName) {

		if (stationName == null || stationName.isEmpty()) {
			OutputView.printError("빈 값은 입력할 수 없습니다.");
		} else if (isDuplicatedStationName(stationName)) {
			OutputView.printError("이미 존재하는 역 이름은 입력할 수 없습니다.");
		} else if (stationName.length() < 2){
			OutputView. printError("2글자 미만 이름을 입력하셨습니다.");
		}
	}

	public static void checkValidStationNameToDelete(final String stationName) {

		if (stationName == null || stationName.isEmpty()) {
			OutputView.printError("빈 값은 입력할 수 없습니다.");
		} else if (stationName.length() < 2){
			OutputView. printError("2글자 미만 이름을 입력하셨습니다.");
		}
	}

	public static boolean isDuplicatedStationName(String stationName) {
		return StationRepository.stations()
			.stream()
			.anyMatch(station -> Objects.equals(station.getName(), stationName));
	}
}

