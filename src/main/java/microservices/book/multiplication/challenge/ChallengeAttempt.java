package microservices.book.multiplication.challenge;

import lombok.*;
import microservices.book.multiplication.user.User;

import javax.persistence.*;

/**
 * Identifies the attempt from a {@link User} to solve a challenge.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChallengeAttempt {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    private User user;
    // this was a decision, include factors
    private int factorA;
    private int factorB;
    // But now we use the alternative, using a Challenge
    //private Challenge challenge;
    private int resultAttempt;
    private boolean correct;
}
