package cf;

import cf.listcf.ListCF;


public class Main {
    
	public static void main(String[] args) {
		String trainPath = "ub.base";
		String testPath = "ub.test";
		String simPath = null;
		String resultPath = null;
		String timePath = null;


		ListCF listcf = new ListCF();
		simPath = "list_similarity.txt";
		resultPath = "list_results.xls";
		timePath = "list_time.txt";
		listcf.run(trainPath, testPath, simPath, resultPath, timePath);
		listcf = null;		
	}

}
