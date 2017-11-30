
public class Grade {
	// declare the variables
	final String course = "COMSC-051 Java Programming Part 1";
	int totalPoints;
	String letterGrade;

	// method to calculate the total points
	int calcTotPoints (int score1, int score2, int score3){   
	      totalPoints = score1 + score2 + score3;
	      return totalPoints;                                  

	}

	// method to compute for letter grade
	String calcGrade(){
	       if (totalPoints>=900) {
	               return letterGrade="A";
	      } else if(totalPoints >=800 && totalPoints <900) {
	               return letterGrade="B";
	      } else if (totalPoints >=700 && totalPoints <800) {
	               return letterGrade="C";
	      } else if (totalPoints >=600  && totalPoints<700){
	               return letterGrade="D";
	      } else {
	               return letterGrade="F";
	      }

	}
}
