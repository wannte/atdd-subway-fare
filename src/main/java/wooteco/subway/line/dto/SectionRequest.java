package wooteco.subway.line.dto;

import javax.validation.constraints.Positive;

public class SectionRequest {

    @Positive(message = "잘못된 역 아이디입니다.")
    private Long upStationId;

    @Positive(message = "잘못된 역 아이디입니다.")
    private Long downStationId;

    @Positive(message = "거리는 양수여야 합니다.")
    private int distance;

    public SectionRequest() {
    }

    public SectionRequest(Long upStationId, Long downStationId, int distance) {
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public int getDistance() {
        return distance;
    }
}
