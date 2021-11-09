package microservices.book.multiplication.challenge;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * This class implements a REST API to get random challenges
 */
@Slf4j
@RequiredArgsConstructor
@RestController  // is a combination of @Controller and @ResponseBody
@RequestMapping("/challenges")
public class ChallengeController {

    private final ChallengeGeneratorService challengeGeneratorService;

    @GetMapping("/random")
    Challenge getRandomChallenge(){
        Challenge challenge = challengeGeneratorService.randomChallenge();
        log.info("Generating a random challenge: {}", challenge);
        return challenge;
    }



    //GET http://ourhost.com/challenges/5?factorA=40
    @GetMapping("/{challengeId}")
    public Challenge getChallengeWithParam(@PathVariable("challengeId") Long challengeId, @RequestParam("factorA") int factorA){
        return null;
    }


}
