package subway.view;

import java.util.stream.Collectors;

import subway.domain.Station;
import subway.domain.StationRepository;

public class OutputView {

	public static final String ERROR_SIGN = "[ERROR] ";
	public static final String INFO_SIGN = "[INFO] ";

	public static void printMessage(String message, Object... args) {
		System.out.printf(message, args);
		printNextLine();
	}

	public static void printInfoMessage(String message) {
		printMessage(INFO_SIGN, message);

	}

	public static void printError(String error) {
		printMessage(ERROR_SIGN, error);
	}

	public static void printNextLine() {
		printMessage("\n");
	}

	public static void printStations() {
		StationRepository.stations().stream().map(Station::getName).forEach(OutputView::printInfoMessage);
	}

}
