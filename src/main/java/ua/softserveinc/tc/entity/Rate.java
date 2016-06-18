package ua.softserveinc.tc.entity;

import org.hibernate.annotations.GenericGenerator;
import ua.softserveinc.tc.constants.RateConstants;
import ua.softserveinc.tc.constants.RoomConstants;

import javax.persistence.*;

/**
 * Created by TARAS on 19.05.2016.
 */
@Entity
@Table(name = RateConstants.TABLE_RATES)
public class Rate {
    public static final Rate DEFAULT = new Rate(-1, -1L);

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = RateConstants.ID_RATE, nullable = false)
    private Long idRate;
    @Column(name = RateConstants.HOUR_RATE, nullable = false)
    private Integer hourRate;
    @Column(name = RateConstants.PRICE_RATE, nullable = false)
    private Long priceRate;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = RoomConstants.ID_ROOM)
    private Room room;

    public Rate() {
        //empty constructor for instantiating in controller
    }

    public Rate(Integer hourRate, Long priceRate) {
        this.hourRate = hourRate;
        this.priceRate = priceRate;
    }

    public Long getIdRate() {
        return idRate;
    }

    public void setIdRate(Long idRate) {
        this.idRate = idRate;
    }

    public Integer getHourRate() {
        return hourRate;
    }

    public void setHourRate(Integer hourRate) {
        this.hourRate = hourRate;
    }

    public Long getPriceRate() {
        return priceRate;
    }

    public void setPriceRate(Long priceRate) {
        this.priceRate = priceRate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        room.getRates().add(this);
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Rate rate = (Rate) o;

        return hourRate.equals(rate.hourRate)
                && priceRate.equals(rate.getPriceRate());
    }

    @Override
    public int hashCode() {
        int a = 17;
        a = 31 * a + hourRate.hashCode();
        a = 31 * a + priceRate.hashCode();
        return a;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "priceRate=" + priceRate +
                ", hourRate=" + hourRate +
                '}';
    }
}