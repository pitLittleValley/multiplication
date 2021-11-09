package microservices.book.multiplication.challenge;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import microservices.book.multiplication.user.User;
import microservices.book.multiplication.user.UserRepository;
import org.springframework.stereotype.Service;
@Slf4j
@RequiredArgsConstructor
@Service
public class ChallengeServiceImpl implements ChallengeService {

    public ChallengeServiceImpl(UserRepository userRepository, ChallengeAttemptRepository challengeAttemptRepository) {
    }

    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {
        //check if the attempt is correct
        boolean isCorrect = attemptDTO.getGuess() == (attemptDTO.getFactorA() * attemptDTO.getFactorB());

        /* We don't user identifiers for now */
        User user = new User(null, attemptDTO.getUserAlias());

        return new ChallengeAttempt(null,  user,
                attemptDTO.getFactorA(), attemptDTO.getFactorB(), attemptDTO.getGuess(), isCorrect);
    }
}
