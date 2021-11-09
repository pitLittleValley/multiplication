package microservices.book.multiplication.challenge;

import org.assertj.core.api.ObjectAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;


@ExtendWith(MockitoExtension.class)
class ChallengeGeneratorServiceTest {

    private ChallengeGeneratorServiceImpl challengeGeneratorService;

    @Spy
    private Random random;

    @BeforeEach
    public void setUp(){
        challengeGeneratorService = new ChallengeGeneratorServiceImpl(random);
    }

    @Test
    public void generateRandomFactorIsBetweenExpectedLimits(){
        //The way to generate random numbers between 11 and 99 is to get a random number
        //between 0 and 89 and add 11 to it. So 20 -> 31 and 30 -> 41
        //89 is max - min range  (99 - 10 = 89, 11 is included)
        given(random.nextInt(89)).willReturn(20, 30);

        // when we generate a challenge
        Challenge challenge = challengeGeneratorService.randomChallenge();

        //then the challenge contains factors as expected
        then(challenge).isEqualTo(new Challenge(31, 41));
    }

}