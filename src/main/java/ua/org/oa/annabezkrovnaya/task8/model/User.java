package ua.org.oa.annabezkrovnaya.task8.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class User extends Entity<Integer> {

    private String login;
    private String password;
    private String eMail;
    private String phoneNumber;
    private Role currentRole;
    private int ownBonus;
    private List<Ticket> currentTicketList;
    private PaymentCard ownCard;

    public User(String login, String password, String eMail, String phoneNumber){
        this.login = login;
        this.password = password;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    private class PaymentCard {
        private String type;
        private String cardNumber;
        private LocalDate validDate;
        private String ownerName;
        private String securityCode;

        @Override
        public String toString() {
            return "PaymentCard{" +
                    "type='" + type + '\'' +
                    ", cardNumber='" + cardNumber + '\'' +
                    ", validDate=" + validDate +
                    ", ownerName='" + ownerName + '\'' +
                    ", securityCode='" + securityCode + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PaymentCard that = (PaymentCard) o;

            if (!type.equals(that.type)) return false;
            if (!cardNumber.equals(that.cardNumber)) return false;
            if (!validDate.equals(that.validDate)) return false;
            if (!ownerName.equals(that.ownerName)) return false;
            return securityCode.equals(that.securityCode);
        }

        @Override
        public int hashCode() {
            int result = type.hashCode();
            result = 31 * result + cardNumber.hashCode();
            result = 31 * result + validDate.hashCode();
            result = 31 * result + ownerName.hashCode();
            result = 31 * result + securityCode.hashCode();
            return result;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", currentRole=" + currentRole +
                ", ownBonus=" + ownBonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (ownBonus != user.ownBonus) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (eMail != null ? !eMail.equals(user.eMail) : user.eMail != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(user.phoneNumber) : user.phoneNumber != null) return false;
        return currentRole.equals(user.currentRole);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + currentRole.hashCode();
        result = 31 * result + ownBonus;
        return result;
    }
}
