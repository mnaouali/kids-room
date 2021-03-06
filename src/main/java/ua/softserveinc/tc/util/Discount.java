package ua.softserveinc.tc.util;

import ua.softserveinc.tc.dto.DayDiscountDTO;
import ua.softserveinc.tc.dto.PersonalDiscountDTO;

import java.time.LocalTime;
import java.util.Objects;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Discount {
    private int value;
    private LocalTime startTime;
    private LocalTime endTime;

    public Discount(int value) {
        this.value = value;
    }

    public Discount(int value, LocalTime startTime, LocalTime endTime) {
        this.value = value;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Discount(DayDiscountDTO dto) {
        this.value = dto.getValue();
        this.startTime = dto.getStartTime();
        this.endTime = dto.getEndTime();
    }

    public Discount(PersonalDiscountDTO dto) {
        this.value = dto.getValue();
        this.startTime = dto.getStartTime();
        this.endTime = dto.getEndTime();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public int getValue() {
        return value;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public boolean containPeriod(LocalTime startPeriodTime, LocalTime endPeriodTime) {
        return startTime.isBefore(endPeriodTime) && endTime.isAfter(startPeriodTime);
    }

    @Override
    public String toString() {
        return String.valueOf(value) + "% - "
                + DateUtil.differenceBetweenTwoTimes(startTime, endTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount = (Discount) o;
        return value == discount.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
