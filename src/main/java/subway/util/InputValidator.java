package subway.util;

import java.util.List;
import java.util.Objects;

import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.OutputView;

public class InputValidator {

	public static boolean checkValidName(final String name) {

		if (name == null || name.isEmpty()) {
			OutputView.printError("빈 값은 입력할 수 없습니다.");
			return false;
		} else if (name.length() < 2){
			OutputView. printError("2글자 미만 이름을 입력하셨습니다.");
			return false;
		}
		return true;
	}

	public static boolean isDuplicatedStationName(String stationName) {
		if (StationRepository.stations()
			.stream()
			.anyMatch(station -> Objects.equals(station.getName(), stationName))){
			OutputView.printError("이미 존재하는 역 이름입니다.");
			return true;
		}
		return false;
	}

	public static boolean isExistStationName(String stationName) {
		if (StationRepository.stations()
			.stream()
			.noneMatch(station -> Objects.equals(station.getName(), stationName))){
			OutputView.printError("존재하지 않는 역 이름입니다.");
			return false;
		}
		return true;
	}

