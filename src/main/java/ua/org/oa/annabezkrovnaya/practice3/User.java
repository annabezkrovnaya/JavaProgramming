package ua.org.oa.annabezkrovnaya.practice3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends Entity <Integer>{

    private String fullName;
    private String login;
    private String password;
    private Role role;
    private PaymentCard paymentCard;
    private String email;
    private List<Ticket> ownTickets;

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public class PaymentCard{

        private String type;
        private String number;
        private LocalDate validDate;
        private String ownerName;
        private String code;
    }

    public enum Role{
        ADMIN, USER;
    }
}
