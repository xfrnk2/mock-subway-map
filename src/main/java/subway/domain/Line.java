package subway.domain;

public class Line {
    private String name;
    private Station lastUpStation;
    private Station lastDownStation;



    public Line(String name, Station lastUpStation, Station lastDownStation) {

        this.name = name;
        this.lastUpStation = lastUpStation;
        this.lastDownStation = lastDownStation;

    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
}
