package application;

import java.util.HashMap;
import java.util.Map;

import entities.Candidate;

public class Program {
	public static void main(String[] args) {
		Map<Candidate, Integer> allCandidates = new HashMap<>();
		
		allCandidates.put(new Candidate("Victor"), 20);
		allCandidates.put(new Candidate("José"), 22);
		allCandidates.put(new Candidate("Andrew"), 15);
		allCandidates.put(new Candidate("Lucas"), 23);
		allCandidates.put(new Candidate("Leandro"), 23);
		allCandidates.put(new Candidate("Leandro"), 23);
		allCandidates.put(new Candidate("Leandro"), 23);
		
		Candidate candidate = new Candidate("Leandro");
		candidate.addVotesTotal(candidate, allCandidates);
	}
}
