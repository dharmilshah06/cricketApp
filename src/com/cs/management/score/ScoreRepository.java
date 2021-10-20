package com.cs.management.score;

import java.util.HashMap;
import java.util.Map;

public class ScoreRepository {

	
		private Map<String, Integer> score = new HashMap<>();

		public boolean saveScore(Score scoreIng) {
			try {
				score.put("RUNS",scoreIng.getRuns() );
				score.put("WICKETS",scoreIng.getWickets());
				score.put("NO_OF_FOURS",scoreIng.getNoOfFours());
				/**
				 * In case of Database , need to add product in Product table from
				 * here
				 */
				// add all data in db......
				// boolean flag=update flag in db
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;

	}
}
