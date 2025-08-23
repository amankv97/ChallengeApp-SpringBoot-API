package com.aman.ChallengeApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/challenges")
public class ChallengeController {

    private final ChallengeService challengeService;

    public ChallengeController(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @GetMapping
    public ResponseEntity<List<Challenge>> getAllchallenges() {
        return new ResponseEntity<>(challengeService.getAllChallenges(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<String> addChallenges(@RequestBody Challenge challenge) {
        boolean isChallengeAdded = challengeService.addChallenges(challenge);
        if (isChallengeAdded) {
            return new ResponseEntity<>("Challenge Added Successfully", HttpStatus.OK);
        } else
            return new ResponseEntity<>("Challenge not found", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{month}")
    public ResponseEntity<Challenge> getChallengeByMonth(@PathVariable String month) {
        Challenge challenge = challengeService.getMonthChallenge(month);
        if (challenge != null)
            return new ResponseEntity<>(challenge, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateChallenge(@PathVariable Long id, @RequestBody Challenge updatedChallenge) {
        boolean isChallengeUpdated = challengeService.updateChallenge(id,updatedChallenge);
        if (isChallengeUpdated) {
            return new ResponseEntity<>("Challenge Updated Successfully",HttpStatus.OK);
        } else
            return new ResponseEntity<>("Challenge not found", HttpStatus.NOT_FOUND);

    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteChallenge(@PathVariable Long id){
        boolean isChallengeDeleted = challengeService.deleteChallenge(id);
        if (isChallengeDeleted) {
            return new ResponseEntity<>("Challenge Deleted Successfully",HttpStatus.OK);
        } else
            return new ResponseEntity<>("Operation Failed", HttpStatus.NOT_FOUND);
    }

}
