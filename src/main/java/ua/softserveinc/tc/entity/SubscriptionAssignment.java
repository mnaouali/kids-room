package ua.softserveinc.tc.entity;

import org.hibernate.annotations.GenericGenerator;
import ua.softserveinc.tc.constants.AbonnementConstants;
import ua.softserveinc.tc.constants.UserConstants;
import ua.softserveinc.tc.dto.AbonnementDto;
import ua.softserveinc.tc.dto.SubscriptionAssignmentDto;
import ua.softserveinc.tc.dto.UserDto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = AbonnementConstants.Entity.TABLE_SUBSCRIPTION_ASSIGNMENT)
public class SubscriptionAssignment {
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = AbonnementConstants.Entity.SUBSCRIPTION_ID, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = UserConstants.Entity.ID_USER)
    private User user;

    @ManyToOne
    @JoinColumn(name = AbonnementConstants.Entity.ID_ABONEMENT)
    private Abonnement abonnement;

    @Column(name = AbonnementConstants.Entity.VALID)
    Boolean valid;

    public SubscriptionAssignment() {
    }

    public SubscriptionAssignment(SubscriptionAssignmentDto dto) {
        if (dto.getId() != null) {
            this.id = dto.getId();
        }
        this.setUser(dto.getUser());
        this.setAbonnement(dto.getAbonnement());
        this.valid = dto.getValid();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUser(UserDto userDto) {
        User user = this.getUser();
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPhoneNumber(userDto.getPhoneNumber());
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public void setAbonnement(AbonnementDto dto) {
        Abonnement abonnement = this.getAbonnement();
        abonnement.setId(dto.getId());
        abonnement.setName(dto.getName());
        abonnement.setHour(dto.getHour());
        abonnement.setPrice(dto.getPrice());
        abonnement.setActive(dto.isActive());
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionAssignment that = (SubscriptionAssignment) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(user, that.user) &&
                Objects.equals(abonnement, that.abonnement) &&
                Objects.equals(valid, that.valid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, abonnement, valid);
    }
}