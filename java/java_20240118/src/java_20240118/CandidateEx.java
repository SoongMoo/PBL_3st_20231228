package java_20240118;

public class CandidateEx {
	public static void main(String[] args) {
		Candidate candidate1 = new Candidate();
		/*
		candidate1.candidateNum = 123;
		candidate1.candidateName ="이숭무";
		candidate1.vote = 80;
		*/
		candidate1.setCandidateName("이숭무");
		candidate1.setCandidateNum(123);
		candidate1.setVote(100);
		System.out.println(candidate1.getVote());
	}
}
