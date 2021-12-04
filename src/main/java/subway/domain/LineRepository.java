package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import jdk.internal.util.xml.impl.Input;
import subway.util.InputValidator;
import subway.view.OutputView;

public class LineRepository {
	private static final List<Line> lines = new ArrayList<>();

	public static List<Line> lines() {
		return Collections.unmodifiableList(lines);
	}

	public static void addLine(String lineName, String upLineName, String downLineName) {
		if (InputValidator.checkValidName(lineName) &&
			!InputValidator.checkDuplicatedLineName(lineName) &&
			!InputValidator.checkDuplicatedStationNames(upLineName, downLineName) &&
			InputValidator.checkExistStationName(upLineName) &&	InputValidator.checkExistStationName(downLineName)) {
			lines.add(new Line(lineName, StationRepository.getStation(upLineName), StationRepository.getStation(downLineName)));
			OutputView.printInfoMessage("지하철 노선이 등록되었습니다.");
		}
	}

	public static boolean deleteLineByName(String lineName) {
		if (InputValidator.checkValidName(lineName) && InputValidator.checkExistLineName(lineName)) {
			lines.removeIf(station -> Objects.equals(station.getName(), lineName));
			OutputView.printInfoMessage("지하철 노선이 삭제되었습니다.");
		}
		return lines.removeIf(line -> Objects.equals(line.getName(), lineName));
	}
}
