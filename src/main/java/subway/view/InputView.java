package subway.view;

import java.util.Scanner;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.util.InputValidator;

public class InputView {
	public static Scanner sc = new Scanner(System.in);

	public static void getStationNameToAdd() {
		OutputView.printMessage("## 등록할 역 이름을 입력하세요.");
		StationRepository.addStation(sc.next());
		OutputView.printInfoMessage("지하철 역이 등록되었습니다.");
	}

	public static void getStationNameToDelete() {
		OutputView.printMessage("## 삭제할 역 이름을 입력하세요.");
		StationRepository.deleteStation(sc.next());
		OutputView.printInfoMessage("지하철 역이 삭제되었습니다.");
	}


}
