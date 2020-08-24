package ex04;

public class Test {

	public static void main(String[] args) {
		// 지원자
		EntertainerApplicant boram = new EntertainerApplicant();
		
		// 지원할 곳 (JYP)
		JypEntertainment jyp = new JypEntertainment();
		jyp.actorAudition(boram);
		jyp.idolAudition(boram);
	}

}
