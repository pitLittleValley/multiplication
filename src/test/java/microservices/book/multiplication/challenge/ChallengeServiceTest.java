package microservices.book.multiplication.challenge;

import microservices.book.multiplication.user.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.BDDAssertions.then;


@ExtendWith(MockitoExtension.class)
class ChallengeServiceTest {

    private ChallengeService challengeService;

    @Mock
    private UserRepository userRepository;

    @Mock
    private ChallengeAttemptRepository challengeAttemptRepository;


    @BeforeEach
    public void setUp() {

        challengeService = new ChallengeServiceImpl(userRepository, challengeAttemptRepository);
    }

    @Test
    public void checkCorrectAttemptTest() {
        //given
        ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50, 60, "john_doe", 3000);

        //when
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);

        //then
        then(resultAttempt.isCorrect()).isTrue();
    }

    @Test
    public void checkWrongAttemptTests() {
        //given
        ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50, 60, "john_doe", 5000);

        //when
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);

        //then
        then(resultAttempt.isCorrect()).isFalse();
    }
}