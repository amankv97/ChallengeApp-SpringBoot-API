package com.aman.ChallengeApp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChallengeService {

    private final ChallengeRepository challengeRepository;
    private long nextID = 1L; // created for use as a parameter in the challenge.setId() i.e. setter

    // Challenge List
    public List<Challenge> challenges = new ArrayList<>(); // Data Type Challenge class List

    public ChallengeService(ChallengeRepository challengeRepository) {
        this.challengeRepository = challengeRepository;
    }

    // Get Data Method
    public List<Challenge> getAllChallenges(){ // This list contains the data type as challenge class
        //return challenges;// This is returning the challenge list which have created above
        return (List<Challenge>) challengeRepository.findAll();
    }

    // Post Data Method
    public boolean addChallenges(Challenge challenge){ // Argument type of Challenge class in this method
        if (challenge != null)
        {
            challenge.setId(nextID++); // this will perform 1++ means next id will be 2,3,4......show on
//            challenges.add(challenge);
            challengeRepository.save(challenge);
            return true;
        }
        else return false;
    }

    // Get Data By {/month} Method
    public Challenge getMonthChallenge(String month) {
        Optional<Challenge> challenge = challengeRepository.findByMonthIgnoreCase(month);
//        for (Challenge challenge : challenges){
//            if (challenge.getMonth().equalsIgnoreCase(month)) {
//                return challenge;
//            }
//        }
//        return null;
        return challenge.orElse(null);
    }

    // Put or Update Data by {id}
    public boolean updateChallenge(Long id, Challenge updatedChallenge) {
        if (challengeRepository.existsById(id)) {
            updatedChallenge.setId(id);
            challengeRepository.save(updatedChallenge);
            return true;
        } else {
            return false;
        }
//        for (Challenge challenge : challenges){
//            if (challenge.getId().equals(id)) {
//                challenge.setMonth(updatedChallenge.getMonth());
//                challenge.setDescription(updatedChallenge.getDescription());
//                return true;
//            }
//        }
//        return false;
    }

    // Delete Data by {id}
    public boolean deleteChallenge(Long id) {
        // the below method "removeIf" will return boolean value according to the situation
//        return challenges.removeIf(challenge -> challenge.getId().equals(id));
        if (challengeRepository.existsById(id)) {
            challengeRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
