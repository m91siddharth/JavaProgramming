package stringProblems;

public class CheckNoOfEdits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "pale", st2 = "bake";
		int editsNos = checkNoEdits(st1, st2);
		System.out.println("Edit Count :"+editsNos);
	}

	private static int checkNoEdits(String st1, String st2) {
		// TODO Auto-generated method stub
		int editCount =0;
		if(st1.length()==st2.length()) {
			if(!st1.equalsIgnoreCase(st2)) {
				editCount++;
			}
		}
		if(st1.length()>st2.length()) {
			editCount++;
			if(!st1.contains(st2)) {
				editCount++;
			}
		}
		if(st1.length()<st2.length()) {
			editCount++;
			if(!st2.contains(st1)) {
				editCount++;
			}
		}
		return editCount;
	}

}
