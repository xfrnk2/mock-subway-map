package subway.view;

import java.util.Scanner;

import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.util.InputValidator;

public class InputView {
	public static Scanner sc = new Scanner(System.in);

	public static void getStationNameToAdd() {
		OutputView.printMessage("## 등록할 역 이름을 입력하세요.");
		StationRepository.addStation(sc.next());
	}

	public static void getStationNameToDelete() {
		OutputView.printMessage("## 삭제할 역 이름을 입력하세요.");
		StationRepository.deleteStation(sc.next());
	}

	public static void getLineNameToAdd() {
		OutputView.printMessage("## 등록할 노선 이름을 입력하세요.");
		String lineName = sc.next();
		OutputView.printMessage("## 등록할 노선의 상행 종점역 이름을 입력하세요.");
		String upLineName = sc.next();
		OutputView.printMessage("## 등록할 노선의 하행 종점역 이름을 입력하세요.");
		String downLineName = sc.next();
		LineRepository.addLine(lineName, upLineName, downLineName);
	}


}
